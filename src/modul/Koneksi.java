/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author atika
 */
public class Koneksi {

    public Connection koneksi() {
        Connection koneksi = null;
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "hr";
            String pass = "hr";

            OracleDataSource sumber = new OracleDataSource();
            sumber.setURL(url); // mengeset atau mengisi alamat sumber data
            koneksi = sumber.getConnection(user, pass); // mengambil nama dan password untuk database
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return koneksi;
    }
}
