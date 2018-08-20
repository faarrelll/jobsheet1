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
public class LuasPermukaanBola {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int r;
        System.out.print("Masukan panjang jari jari : ");
        r = masukan.nextInt();
        System.out.println("Luas Permukaan Bola adalah : "+(4*22*r/7*r));
    }
}
