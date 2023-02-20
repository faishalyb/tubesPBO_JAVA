/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiPenjualan;

/**
 *
 * @author faish
 */
public class film {
    private String id_film;
    private String nama_film;
    private String tanggal_film;
    private int kuota_film;
    private byte[] img;
    private String sinopsis;
   
    
    public film(){}
    
    public film(String id_film,String nama_film, String tanggal_film, int kuota_film, byte[] img, String sinopsis){
    
        
        this.id_film = id_film;
        this.nama_film = nama_film;
        this.tanggal_film = tanggal_film;
        this.kuota_film = kuota_film;
        this.img = img;
        this.sinopsis = sinopsis;
        
       
    }
    
    public String getID(){
        return id_film;
    }
    
    public void setID(String id_film){
        this.id_film = id_film;
    }
    
    public String getName(){
        return nama_film;
    }
    
    public void setName(String nama_film){
        this.nama_film = nama_film;
    }
  
    public String getDate(){
        return tanggal_film;
    }
    
    public void setDate(String tanggal_film){
        this.tanggal_film = tanggal_film;
    }
    
    public int getQuota(){
        return kuota_film;
    }
    
    public void setQuota(int kuota_film){
        this.kuota_film = kuota_film;
    }
    
    public byte[] getMyImage(){
        return img;
    }
    
    public String getSynopsis(){
        return sinopsis;
    }
    
    public void setSynopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }
    
    
            
            
       
    
}
