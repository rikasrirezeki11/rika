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
public class Yamaha extends Motor{
    

    public void tampilkan(){
        
       
       String bahanbakar="pertamax";
       
       Motor m= new Motor();
       m.inputData("mioGT","Biruputih","BE 1234 F" );
      m.tampilkanData();
        
        
         System.out.println("bahanbakar:"+bahanbakar);
    }
    }
