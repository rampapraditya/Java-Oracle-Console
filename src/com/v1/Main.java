/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.v1;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

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
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "hr";
            String pass = "hr";
            
            OracleDataSource sumber = new OracleDataSource();
            sumber.setURL(url); // mengeset atau mengisi alamat sumber data
            Connection koneksi = sumber.getConnection(user, pass); // mengambil nama dan password untuk database

            System.out.println("Terkoneksi");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
