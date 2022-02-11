/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Cottage {
    public static void main(String []args){
        int id[]={1,2,3,4,5};//id pelanggan
     String nama[]={"Ali", "Budi", "Dani", "Edi", "Umar"};
     Scanner ha =new Scanner(System.in);
     
     System.out.print("Masukkan id :");
     int idw = ha.nextInt();
     int iId=Integer.valueOf(idw);
     System.out.println("Nama : " + nama[iId-1]);
     System.out.print("Cottage : ");
     int cottage = ha.nextInt();
     System.out.print("Golongan hari : ");
     int hari = ha.nextInt();
     System.out.print("Lama menginap : ");
     int lama = ha.nextInt();
     
     int bayar =0;
     if(cottage == 1 || cottage == 2){ //duku , jeruk
         if(hari == 1){           //weekday
             bayar = lama*915000;
             System.out.println("Weekday : Rp"+bayar);
         }
         if(hari == 2){          //weekend
             bayar = lama*1025000;
             System.out.println("Weekend : Rp"+bayar);
         }
         if(hari == 3){      //holiday
             bayar = lama*1225000;
             System.out.println("Holiday : Rp"+bayar);
         }
     }
     if(cottage == 3 || cottage == 4){ // alpukat, jambu air
         if(hari == 1){
             bayar = lama*575000;
             System.out.println("Weekday : Rp"+bayar);
         }
         if(hari == 2){
             bayar = lama*695000;
             System.out.println("Weekend : Rp"+bayar);
         }
         if(hari == 3){
             bayar = lama*895000;
             System.out.println("Holiday : Rp"+bayar);
         }
     }
     if(cottage == 5 || cottage == 6){  // durian, melon
         if(hari == 1){
             bayar = lama*595000;
             System.out.println("Weekday : Rp"+bayar);
         }
         if(hari == 2){
             bayar = lama*715000;
             System.out.println("Weekend : Rp"+bayar);
         }
         if(hari == 3){
             bayar = lama*915000;
             System.out.println("Holiday : Rp"+bayar);
         }
     }
     if(cottage == 7 || cottage == 8 || cottage == 9){ // belimbing, mangga, kedondong
         if(hari == 1){
             bayar = lama*495000;
             System.out.println("Weekday : Rp"+bayar);
         }
         if(hari == 2){
             bayar = lama*575000;
             System.out.println("Weekend : Rp"+bayar);
         }
         if(hari == 3){
             bayar = lama*755000;
             System.out.println("Holiday : Rp"+bayar);
         }
     }
     
    }
}
