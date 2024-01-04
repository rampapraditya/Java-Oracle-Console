package com.v3;

import java.sql.SQLException;
import java.sql.Statement;
import modul.Koneksi;

/**
 *
 * @author rampa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Koneksi k = new Koneksi();
            Statement stmt = k.koneksi().createStatement();
            int hasil = stmt.executeUpdate("INSERT INTO DOSEN VALUES ('AT-001','Rampa Praditya')");
            if (hasil == 1) {
                System.out.println("Data tersimpan");
            } else {
                System.out.println("Data gagal tersimpan");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
