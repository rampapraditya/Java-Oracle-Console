/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.v2;

import modul.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rampa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Koneksi k = new Koneksi();
            Statement stmt = k.koneksi().createStatement();
            ResultSet rs = stmt.executeQuery("select * from dosen");
            while (rs.next()) {                
                System.out.println(rs.getString("NID") + "\t" + rs.getString("NAMA_DOSEN"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
