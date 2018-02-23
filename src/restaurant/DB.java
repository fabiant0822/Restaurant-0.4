/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fabian Tamas 1.0
 */
public class DB {
    Connection kapcs;
    PreparedStatement ekpar;
    ResultSet eredmeny;
    
    final String dbUrl = "jdbc:mysql://localhost:3306/"
            + "?useUnicode = true&characterEncoding = UTF-8";
    final String user = "root";
    final String pass = "";
    
    public DB() {
        String s1 = "CREATE DATABASE IF NOT EXISTS etterem";
        String s2 = "USE etterem";
        String s3 = "CREATE TABLE IF NOT EXISTS asztalok (" +
                "asztal int(11)," +
                "szek int(11)," +
                "PRIMARY KEY(asztal) " +
                ") ENGINE = InnoDB DEFAULT CHARSET = utf8mb4" +
                " COLLATE = utf8mb4_hungarian_ci;";
        
        try {
            // kapcsolat létrehozása
            kapcs = DriverManager.getConnection(dbUrl, user, pass);
                        
            // adatbázis létrehozása
            ekpar = kapcs.prepareStatement(s1);
            ekpar.execute();
                        
            // adatbázis kijelölése
            ekpar = kapcs.prepareStatement(s2);
            ekpar.execute();
                        
            // tábla létrehozása
            ekpar = kapcs.prepareStatement(s3);
            ekpar.execute();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void lista() {
        try {
            ekpar = kapcs.prepareStatement("SELECT * FROM asztalok");
            eredmeny = ekpar.executeQuery();
            while (eredmeny.next()) {
                System.out.printf("%2d %2d\n",
                                    eredmeny.getInt("asztal"),
                                    eredmeny.getInt("szek"));
        }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }  
    }
    
    public void uj (int asztal, int szek) {
        String s = "INSERT INTO asztalok (asztal, szek) "
                    + "VALUES (?, ?);";
        
        try {
            ekpar = kapcs.prepareStatement(s);
            ekpar.setInt(1, asztal);
            ekpar.setInt(2, szek);
            ekpar.executeUpdate();
            System.out.println(asztal + " hozzáadva.");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
     
    public void torol() {
        String s = "DELETE FROM asztalok;";
        try {
            ekpar = kapcs.prepareStatement(s);
            int sorok = ekpar.executeUpdate();
            System.out.println(sorok + " asztal törölve.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
