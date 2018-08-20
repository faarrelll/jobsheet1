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
public class Beasiswa {
    public static void main(String[] args) {
         Scanner masukan = new Scanner(System.in);
        int TPA;
        System.out.print("Masukan Nilai TPA : ");
        TPA = masukan.nextInt();
        System.out.print("Masukan Nilai Bahasa Inggris : ");
        int Bahasainggris = masukan.nextInt();
        if ((TPA > 85) && (Bahasainggris > 80)) {
            System.out.println("Siswa Dapat Beasiswa");
        }
        else {
            System.out.println("Siswa Tidak Dapat Beasiswa");
        }
    }
}
