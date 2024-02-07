/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elemiprogtetel;

import java.util.Scanner;

/**
 *
 * @author PolgárBotond(SZF_202
 */
public class ElemiProgTetel {

   static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        //ÖSSZEGZÉS
        System.out.print("szam: ");
        int s = sc.nextInt();
    int n = - 1;
    while (n < 0){
         System.out.print("N=");
    }
    int ossz = 0;
    for ( i=0; i<n+1; i++){
        ossz += i;
    }
        System.out.printf("Az elso %d db  szam osszege: %d\n",n, ossz);
    
    int db = 0;
    for ( i=10; i< 100; i ++) {
         if (i % 2 == 0){
             db++;
        }
        System.out.printf("A ketjegyu parosok szama: %d\n",db);
    }
    
        System.out.println(db);
      
    int VEGE = 0;
    db =0;
    int min = 2147483647;
    int szam=0;
    VEGE = -1;
    while ((szam= sc.nextInt()) != VEGE {
        if (szam < min){
            min = szam;
        }
        db += 1;
    }
    }//main vége
    
    
    

