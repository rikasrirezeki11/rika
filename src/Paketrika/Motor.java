/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paketrika;

/**
 *
 * @author User
 */
public class Motor {
    String nama;
    String plat;
    String warna;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    
    

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public void tampilkanData(){
        System.out.println("nama motor :"+getNama());
        System.out.println("warna :"+getWarna());
        System.out.println("plat :"+getPlat());
        
    }
    public void inputData(String nm,String m,String p){
        setNama(nm);
        setWarna(m);
        setPlat(p);
    }   
    
}
