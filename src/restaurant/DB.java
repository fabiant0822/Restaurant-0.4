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
     * Beolvassa az eszközök tábla rekordjait a név szerinti sorrendben.
     * Az adatokat betölti a táblába és a combobox.ba
     * @param tbl betölti ebbe a táblába a terméket
     * @param cb és betölti a comboboxba is
     */
    public void eszkozok_be(JTable tbl, JComboBox cb) {
        final DefaultTableModel tm = (DefaultTableModel)tbl.getModel();
        String s = "SELECT * FROM eszkozok ORDER BY nev;";

        try (Connection kapcs = DriverManager.getConnection(dbUrl,user,pass);
             PreparedStatement parancs = kapcs.prepareStatement(s);
             ResultSet eredmeny = parancs.executeQuery()) {
            tm.setRowCount(0);
            cb.removeAllItems();
            while (eredmeny.next()) {
                Object sor[] = {
                    eredmeny.getInt("eszkozid"),
                    eredmeny.getString("nev"),
                    eredmeny.getString("ev")
                };
                tm.addRow(sor);
                cb.addItem(eredmeny.getString("nev"));
            }            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.exit(2);
        }
    }

    /**
     * Beolvassa az leltár tábla rekordjait a leltarID szerinti sorrendben.
     * Az adatokat betölti ebbe a táblába
     * @param tbl betölti ebbe a táblába a terméket
     */
    public void leltar_be(JTable tbl) {
        final DefaultTableModel tm = (DefaultTableModel)tbl.getModel();
        String s = "SELECT leltarid, "
                 + "termek.teremszam AS tsz, "
                 + "eszkozok.nev AS ek, "
                 + "egyeb "
                 + "FROM leltar "
                 + "JOIN eszkozok ON leltar.eszkozid=eszkozok.eszkozid "
                 + "JOIN termek ON leltar.teremid=termek.teremid;";

        try (Connection kapcs = DriverManager.getConnection(dbUrl,user,pass);
             PreparedStatement parancs = kapcs.prepareStatement(s);
             ResultSet eredmeny = parancs.executeQuery()) {
            tm.setRowCount(0);
            while (eredmeny.next()) {
                Object sor[] = {
                    eredmeny.getInt("leltarid"),
                    eredmeny.getString("tsz"),
                    eredmeny.getString("ek"),
                    eredmeny.getString("egyeb")
                };
                tm.addRow(sor);
            }            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.exit(3);
        }
    }

    /**
     * kiolvassa a terem ID-t
     * @param teremszam
     * @return
     */
    public int get_teremid(String teremszam) {
        String s = "SELECT teremid FROM termek WHERE teremszam=?";
        int tid = -1;
        try (Connection kapcs = DriverManager.getConnection(dbUrl,user,pass);
              PreparedStatement parancs = kapcs.prepareStatement(s)) {
             parancs.setString(1, teremszam);
             ResultSet eredmeny = parancs.executeQuery();
            if (eredmeny.next()) {
                tid = eredmeny.getInt("teremid");
            }            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return tid;
    }
    
    /**
     * kiolvassa az eszköz ID-t
     * @param nev
     * @return
     */
    public int get_eszkozid(String nev) {
        String s = "SELECT eszkozid FROM eszkozok WHERE nev=?";
        int eid = -1;
        try (Connection kapcs = DriverManager.getConnection(dbUrl,user,pass);
              PreparedStatement parancs = kapcs.prepareStatement(s)) {
             parancs.setString(1, nev);
             ResultSet eredmeny = parancs.executeQuery();
            if (eredmeny.next()) {
                eid = eredmeny.getInt("eszkozid");
            }            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return eid;
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
     * Hozzáadja az adatbázishoz a teremszámot és a felhasználását a teremnek
     * @param tsz teremszám
     * @param fh felhasználás
     */
    public void terem_hozzaad(String tsz, String fh) {
        if (tsz.isEmpty())
            return;
        String s = "INSERT INTO termek (teremszam, felhasznalas) VALUES(?,?);";
        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass);
                PreparedStatement parancs = kapcs.prepareStatement(s)) {
            parancs.setString(1, levag(tsz.trim(), 4));
            if (fh.isEmpty())
                parancs.setNull(2, java.sql.Types.VARCHAR);
            else
                parancs.setString(2, levag(fh.trim(), 30));
            parancs.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
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
     * Hozzáadja az adatbázishoz az eszköz nevét és a beszerzés évét
     * @param nev
     * @param ev 
     */
    public void eszkoz_hozzaad(String nev, String ev) {
        if (nev.isEmpty())
            return;
        String s = "INSERT INTO eszkozok (nev,ev) VALUES(?,?);";
        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass);
                PreparedStatement parancs = kapcs.prepareStatement(s)) {
            parancs.setString(1, levag(nev.trim(), 50));
            int n = szam(ev);
            if (n > 1980 && n < 2050)
                parancs.setInt(2, n);
            else
                parancs.setNull(2, java.sql.Types.INTEGER);
            parancs.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
     * Hozzáadja az adatbázishoz az ID-ket és az adatokat
     * @param asztal
     * @param szek
     * @param helyseg
     */
    public void asztal_be(int asztal, int szek, String helyseg) {
        String s = "INSERT INTO asztalok (asztal,szek,helyseg) VALUES(?,?,?);";
        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass);
                PreparedStatement parancs = kapcs.prepareStatement(s)) {
            parancs.setInt(1, asztal);
            parancs.setInt(2, szek);
            if (!helyseg.isEmpty())
                parancs.setString(3,levag(helyseg.trim(), 20));
            else
                parancs.setNull(3,java.sql.Types.VARCHAR);
            parancs.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
     * Módosítja az adatbázisban a terem tábla adatait
     * @param teremid
     * @param tsz
     * @param fh - felhasználás (lehet üres)
     */
    public void terem_modosit(int teremid, String tsz, String fh) {
        if (tsz.isEmpty())
            return;
        String s = "UPDATE termek SET teremszam=?, felhasznalas=? "
                 + "WHERE teremid=?";
        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass);
                PreparedStatement parancs = kapcs.prepareStatement(s)) {
            parancs.setString(1, levag(tsz.trim(), 4));
            if (fh.isEmpty())
                parancs.setNull(2, java.sql.Types.VARCHAR);
            else
                parancs.setString(2, levag(fh.trim(), 30));
            parancs.setInt(3, teremid);
            parancs.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * Módosítja az adatbázisban az eszköz tábla adatait
     * @param eszkozid
     * @param nev
     * @param ev
     */
    public void eszkoz_modosit(int eszkozid, String nev, String ev) {
        if (nev.isEmpty())
            return;
        String s = "UPDATE eszkozok SET nev=?, ev=? "
                 + "WHERE eszkozid=?";
        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass);
                PreparedStatement parancs = kapcs.prepareStatement(s)) {
            parancs.setString(1, levag(nev.trim(), 50));
            int n = szam(ev);
            if (n > 0)
                parancs.setInt(2, n);
            else
                parancs.setNull(2, java.sql.Types.INTEGER);
            parancs.setInt(3, eszkozid);
            parancs.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }
    
    /**
     * Módosítja az adatbázisban a leltár tábla adatait
     * @param leltarid
     * @param teremid
     * @param eszkozid
     * @param adatok
     */
    public void leltar_modosit(int leltarid, int teremid, 
                               int eszkozid, String adatok) {
        String s = "UPDATE leltar SET teremid=?, eszkozid=?, egyeb=? "
                 + "WHERE leltarid=?";
        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass);
                PreparedStatement parancs = kapcs.prepareStatement(s)) {
            parancs.setInt(1, teremid);
            parancs.setInt(2, eszkozid);
            if (!adatok.isEmpty())
                parancs.setString(3,levag(adatok.trim(), 30));
            else
                parancs.setNull(3,java.sql.Types.VARCHAR);
            parancs.setInt(4, leltarid);
            parancs.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }
    
    /**
     * Törli a terem táblából a megadott azonosítójú elemet
     * @param teremid
     */
    public void terem_torol(int teremid) {
        String s = "DELETE FROM termek WHERE teremid=?;";
        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass);
                PreparedStatement parancs = kapcs.prepareStatement(s)) {
            parancs.setInt(1, teremid);
            parancs.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }                
    }

    /**
     * Törli az eszköz táblából a megadott azonosítójú elemet
     * @param eszkozid
     */
    public void eszkoz_torol(int eszkozid) {
        String s = "DELETE FROM eszkozok WHERE eszkozid=?;";
        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass);
                PreparedStatement parancs = kapcs.prepareStatement(s)) {
            parancs.setInt(1, eszkozid);
            parancs.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }                
    }
    
    /**
     * Törli a leltár táblából a megadott azonosítójú elemet
     * @param leltarid
     */
    public void leltar_torol(int leltarid) {
        String s = "DELETE FROM leltar WHERE leltarid=?;";
        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass);
                PreparedStatement parancs = kapcs.prepareStatement(s)) {
            parancs.setInt(1, leltarid);
            parancs.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }                
    }    
}
