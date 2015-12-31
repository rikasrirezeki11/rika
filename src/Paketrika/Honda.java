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
public class Honda extends Motor{
    
     public void tampilkan(){
        
       
       String bahanbakar="premium";
       
       Motor kendaraan= new Motor();
       kendaraan.inputData("scoopy","Merah","BE 2341 SE" );
      kendaraan.tampilkanData();
        
        
         System.out.println("bahanbakar:"+bahanbakar);
    }
}
