/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

/**
 *
 * @author ACER
 */
public class Pemesananhotel {
    int hargakamar;
    int lamamenginap;

    public Pemesananhotel() {
        hargakamar= 200000;
        lamamenginap=4;
    }
    
    void cetakInfo(){
        System.out.println("=========================");
        System.out.println("hargakamar : "+hargakamar);
        System.out.println("lamamenginap: "+lamamenginap);
        System.out.println("=========================");
    }
    
    int hitungTotal(){
        int total;
        total=hargakamar*lamamenginap;
        return total;
    }
    
    void cetakTotal(){
        System.out.println("Totalnya adalah: "+hitungTotal());
    }
}
