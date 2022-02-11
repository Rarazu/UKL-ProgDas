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
public class Mahasiswa {
    public static void main(String []args){
        System.out.println("=== Jalur Masuk ===");
        System.out.println(" SBMPTN = 1");
        System.out.println(" SNMPTN = 2");
        System.out.println(" Mandiri = 3");
        System.out.println("=== Golongan Pendapatan ===");
        System.out.println(" A = 1");
        System.out.println(" B = 2");
        System.out.println(" C = 3");
        System.out.println(" ");
        
     int id[]={1,2,3,4};//id pelanggan
     String nama[]={"Mira", "Nina", "Oemar", "Pena"};
     String alamat[]={"Sawojajar","Kedung kandang","Ijen","Dinoyo"};
     String jalur[]={"SBMPTN","SNMPTN","Mandiri","SBMPTN"};
 
     Scanner userInput=new Scanner(System.in);
        System.out.print("Masukkan id mahasiswa =");
        int idm = userInput.nextInt();
        int iId=Integer.valueOf(idm);
        System.out.print("Masukkan Jalur masuk = ");
        int jal = userInput.nextInt();
        System.out.print("Masukkan Golongan pendapatan = ");
        int gol = userInput.nextInt();
     
     
     if (jal==1&&gol==1){
           System.out.println("DSP = 5 juta");
           System.out.println("SPP = 500 ribu");
        }
     if (jal==1&&gol==2){
           System.out.println("DSP = 15 juta");
           System.out.println("SPP = 1 juta");
        }
     if (jal==1&&gol==3){
           System.out.println("DSP = 30 juta");
           System.out.println("SPP = 2 juta");
        }
     if (jal==2&&gol==1){
           System.out.println("DSP = 7 juta");
           System.out.println("SPP = 500 ribu");
        }
     if (jal==2&&gol==2){
           System.out.println("DSP = 17 juta");
           System.out.println("SPP = 1 juta");
        }
     if (jal==2&&gol==3){
           System.out.println("DSP = 35 juta");
           System.out.println("SPP = 2 juta");
        }
     if (jal==3&&gol==1){
           System.out.println("DSP = 10 juta");
           System.out.println("SPP = 1 juta");
        }
     if (jal==3&&gol==2){
           System.out.println("DSP = 25 juta");
           System.out.println("SPP = 12juta");
    }
     if (jal==3&&gol==3){
           System.out.println("DSP = 50 juta");
           System.out.println("SPP = 3 juta");
    }
     
     char kategori;
     System.out.print("Kategori pendapatan :");
     kategori = userInput.next().charAt(0);
     if(kategori == 'A'){
         System.out.println("<2 juta");
     }
     else if (kategori == 'B'){
         System.out.println("2 juta s.d 10 juta");
     }
     else if (kategori == 'C'){
         System.out.println(">10 juta");
    
}
     System.out.println("\n Print Out Identitas");
     System.out.println("ID:" + idm);
     System.out.println("Nama:" + nama[iId-1]);
     System.out.println("Alamat:" + alamat[iId-1]);
     System.out.println("Jalur: "+ jalur[iId-1]);
     
}
}
