/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ASUS
 */
public class huruf {
    public static void main(String[] args) {
          int k,l,m ,n;
        
        for(k=1; k<=4; k++){
            for(l=1; l<=1; l++){
                System.out.print("@");
            }
        for(m=2; m<=4; m++){
            if(k==m){
                System.out.print("@");
                
            }
            else{
                System.out.print(" ");
            }
        }
        for(n=1; n<=1; n++){
            System.out.print("@");
        }
            System.out.println("");
        }
        
        int z= 4;
        for(int a=1; a<=5; a++){
            if(a==1||a==5){
                for( int b=1; b<=5; b++){
                    System.out.print("@");
                }
            }
            else{
                for(int b=1; b<=5; b++){
                    if(b==z){
                        System.out.print("@");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                z--;
            }
            System.out.println(" ");
        }
    }
    
    
}
