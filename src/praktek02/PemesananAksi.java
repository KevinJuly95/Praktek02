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
public class PemesananAksi {
    public static void main(String[] args) {
        Pemesananhotel r1 = new Pemesananhotel ();
        r1.hargakamar = 100000;
        r1.lamamenginap = 2;
        
        r1.cetakInfo();
        System.out.println("Total PemesananHotel = "+r1.hitungTotal());
        r1.cetakTotal();
        
        Pemesananhotel r2 = new Pemesananhotel ();
        r2.cetakInfo();
        
        Pemesananhotel r3 = new Pemesananhotel (600000,6);
        r3.cetakInfo();
    }
}
