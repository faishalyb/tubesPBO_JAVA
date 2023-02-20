/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiPenjualan;
import java.sql.*; // karakter * adalah mendeklarasikan semua class yang ada di package tersebut (mysql)



/**
 *
 * @author faish
 */

public class koneksi {
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/dbfilms";
    static final String USER = "root";
    static final String PASSWORD = "";
    
    public static Connection connectDB(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // nama class pada JDBC versi yang digunakan
            // open a Connection
            conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            return conn;
        }catch(Exception ex){
            System.out.println("Error ketika mengkoneksi ke database");
            return null;
        }
    }
    
    
}
