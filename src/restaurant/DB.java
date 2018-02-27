package restaurant;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DB {

    final String user = "admin";
    final String pass = "admin";
    String dbUrl;
    
    public DB() {
        url_be();
    }
    
    /**
     * Beolvassa a config.properties fileból az adatbázis IP címét
     * és beállítja a dbUrl-t, ha nincs fájl, hibaüzenetet küld és
     * a localhost-ot használja.
     */
    private void url_be() {
        Properties beallitasok = new Properties();
        try (FileInputStream be = new FileInputStream("config.properties")) {
            beallitasok.load(be);
            String ip = beallitasok.getProperty("ip");
            dbUrl = "jdbc:mysql://" + ip + ":3306/etterem"
                    + "?useUnicode=true&characterEncoding=UTF-8";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            dbUrl = "jdbc:mysql://localhost:3306/etterem"
                   + "?useUnicode=true&characterEncoding=UTF-8";
        }
    }

    /**
     * Beolvassa a termek tábla rekordjait, teremszám szerinti sorrendben.
     * Az adatokat betölti a táblába és a combobox.ba
     * @param tbl betölti ebbe a táblába a terméket
     * @param cb és betölti a comboboxba is
     */
    public void asztal_be(JTable tbl, JComboBox cb) {
        final DefaultTableModel tm = (DefaultTableModel)tbl.getModel();
        String s = "SELECT * FROM asztalok ORDER BY asztal;";

        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass);
                PreparedStatement parancs = kapcs.prepareStatement(s);
                ResultSet eredmeny = parancs.executeQuery()) {
            tm.setRowCount(0);
            cb.removeAllItems();
            while (eredmeny.next()) {
                Object sor[] = {
                    eredmeny.getInt("asztal"),
                    eredmeny.getInt("szek"),
                    eredmeny.getString("helyseg")
                };
                tm.addRow(sor);
                cb.addItem(eredmeny.getString("asztal"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.exit(1);
        }
    }
    
    /**
     * Levágja a bevinni kívánt adatokat az adatbázisban megadott méretre
     * @param s a bevitt adat változója
     * @param n az adattípus megadott karakterszáma
     * @return 
     */
    private String levag(String s, int n) {
        return s.length() > n ? s.substring(0, n) : s;
    }
    
     /**
     * A szam metódus az s sztriget számmá alakítja és visszaadja.
     * Ha nem sikerült 0-t ad vissza
     * @param s - az átalakítandó szöveg
     * @return - a szám, vagy nulla
     */
    private int szam(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
    /**
     * Hozzáadja az adatbázishoz a teremszámot és a felhasználását a teremnek
     * @param tbl
     * @param chr
     * @param hly
     */
    public void asztal_hozzaad(String tbl, String chr, String hly) {
        if (hly.isEmpty())
            return;
        String s = "INSERT INTO asztalok (asztal, szek, helyseg) VALUES(?,?,?);";
        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass);
                PreparedStatement parancs = kapcs.prepareStatement(s)) {
            parancs.setString(1, levag(hly.trim(), 4));
            parancs.setString(2, levag(hly.trim(), 4));
            parancs.setString(3, levag(hly.trim(), 20));
            parancs.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}