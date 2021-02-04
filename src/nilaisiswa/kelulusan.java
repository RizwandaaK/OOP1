/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

/**
 *
 * @author rizwa
 */
public class kelulusan {
    public static void main(String[] args) {

    // object
    siswa pelajar = new siswa();
    
    // pengisian atribut
    pelajar.nama = "Anya";
    pelajar.nilai = 70;
    
    //menjalankan method
    pelajar.cetaknilai(){
    
    //menentukan lulus
    if(pelajar.lulus()){
        System.out.println("selamat anda lulus");
    }
    else if(pelajar.tidaklulus()){
        System.out.println("Anda harus belajar lebih giat lagi");
    }
}

   