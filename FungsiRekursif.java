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
public class FungsiRekursif {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int bil, hasil;
        System.out.println("Masukan Suatu Bilangan : ");
        bil = masukan.nextInt();
        hasil = faktorial(bil);
        System.out.println("Nilai Fktorila "+bil+" adalah "+hasil);
        
    }
    public static int faktorial(int a){
        if(a==1)
             return 1;
        else
           
        return (a*faktorial(a-1));
        
    }
    
}
