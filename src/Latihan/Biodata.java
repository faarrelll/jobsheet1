/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Biodata {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String nama,tempat,jenis,alamat,moto, tanggal;
        int nis;
        System.out.print("Masukan Nama : ");
        nama = masukan.next();
        System.out.print("Masukan Nis : ");
        nis = masukan.nextInt();
        System.out.print("Masukan Tempat Lahir : ");
        tempat = masukan.next();
        System.out.print("Masukan  tanggal lahir : ");
        tanggal = masukan.next();
        System.out.print("Masukan Jenis Kelamin : ");
        jenis = masukan.next();
        System.out.print("Alamat : ");
        alamat = masukan.next();
        System.out.print("Masukan  moto hidup : ");
        moto = masukan.next();
        
        System.out.println("===================");
        System.out.println("Biodata");
        System.out.println("===================");
        System.out.println("Nama : "+nama);
        System.out.println("Nis : "+nis);
        System.out.println("Tempat Lahir : "+tempat);
        System.out.println("Tanggal Lahir : "+tanggal);
        System.out.println("jenis Kelamin : "+jenis);
        System.out.println("Alamat : "+alamat);
        System.out.println("Moto Hidup : "+moto);
        
        
    }
}
