/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiPenjualan;


import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author faish
 */
public class MyQuery {
    
    public Connection getConnection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbfilms","root","");
        }catch(SQLException ex){
            Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
       
    
    
    public ArrayList<film> BindTable(){
        ArrayList<film> list = new ArrayList<film>();
        Connection dbconn = getConnection();
        Statement st;
        ResultSet rs;
        
        try{
            st = dbconn.createStatement();
            rs = st.executeQuery("SELECT `id_film`, `nama_film`, `tanggal_film`, `kuota_film`, `img`, `sinopsis` FROM `films`");
            
            film f;
            while(rs.next()){
                f = new film(
                        rs.getString("id_film"),
                        rs.getString("nama_film"),
                        rs.getString("tanggal_film"),
                        rs.getInt("kuota_film"),
                        rs.getBytes("img"),
                        rs.getString("sinopsis")
                         );
                list.add(f);     
            }
        }catch (SQLException ex){
            Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return list;
    }
}
            
       
               
    
   
        
        

