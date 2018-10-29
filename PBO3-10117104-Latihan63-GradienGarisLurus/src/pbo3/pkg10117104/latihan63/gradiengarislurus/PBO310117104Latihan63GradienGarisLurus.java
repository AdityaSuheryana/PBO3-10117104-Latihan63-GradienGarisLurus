/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan63.gradiengarislurus;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan hasil perhitungan gradien garis lurus dengan
 * titik koordinat yang diketahui
 * 
 */
public class PBO310117104Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Koordinat xy = new Koordinat(0,0,0,0);
        xy.setX1(2);
        xy.setY1(10);
        xy.setX2(5);
        xy.setY2(7);
        System.out.println("Garis yang melalui titik ("+xy.getX1()+","
                +xy.getY1()+") dan ("+xy.getX2()+","+xy.getY2()+")");
        System.out.println("Memiliki Gradien Sebesar "+xy.hitungGradien());
        
        System.out.println("");
        
        Koordinat obj2 = new Koordinat(0,0,0,0);
        obj2.setX1(5);
        obj2.setY1(1);
        obj2.setX2(3);
        obj2.setY2(12);
        System.out.println("Garis yang melalui titik ("+obj2.getX1()+","
                +obj2.getY1()+") dan ("+obj2.getX2()+","+obj2.getY2()+")");
        
        System.out.println("Memiliki Gradien Sebesar "+obj2.hitungGradien());
    }
    
}
