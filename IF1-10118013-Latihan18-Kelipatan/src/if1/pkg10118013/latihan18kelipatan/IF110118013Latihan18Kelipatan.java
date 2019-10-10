/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan18kelipatan;



/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-1
 * NIM : 10118013
 * Deskripsi Program : Menampilkan Kelipatan Sebuah Angka
 */
public class IF110118013Latihan18Kelipatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 3.5;
        double b = 0;

        
        for (int i=1; i <= 10; i++, b = a*i)
            System.out.println(b);
        
        System.out.println("Developed by : Rifian Joe Premilenio");
    }
    
}
