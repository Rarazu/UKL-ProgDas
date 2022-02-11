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
public class Listrik {
   public static void main(String[] args) {
     int id[]={1,2,3,4};//id pelanggan
     int gol[]={1,3,2,3};
     String namaPelanggan[]={"Galuh", "Indro", "Jedi", "Kanu"};
     //namapelanggan
     String alamat[]={"Sawojajar","Kedung kandang","Ijen","Dinoyo"};
     Scanner myObj = new Scanner(System.in);
     System.out.print("Masukkan id pelanggan : ");
     String idIn = myObj.nextLine();
     int iId=Integer.valueOf(idIn);
     
     System.out.print("Golongan : ");
     String golongan = myObj.nextLine();
     int iGolongan = Integer.valueOf(golongan);
     
     int bayar=0;
       int kwh;
        if (iGolongan == 1){
            kwh = 450*720/1000;
            bayar = 1000*kwh;
            System.out.println("Banyak penggunaan listrik adalah "+kwh+" kwh");
        }
        else if (iGolongan == 2){
            kwh = 1300*720/1000;
            bayar = 1300*kwh;
            System.out.println("Banyak penggunaan listrik adalah "+kwh+" kwh");
        }
        else if (iGolongan == 3){
            kwh = 2200*720/1000;
            bayar = 1500*kwh;
            System.out.println("Banyak penggunaan listrik adalah "+kwh+" kwh");
        }else{
        System.out.println("Golongan yang anda masukkan tidak terdaftar");
    }
         
     
     System.out.println("\nPrint Out Tagihan");
     System.out.println("ID:" + idIn);
     System.out.println("Nama:" + namaPelanggan[iId-1]);
     System.out.println("Golongan:" + gol[iId-1]);
     System.out.println("Alamat:" + alamat[iId-1]);
     System.out.println("Tagihan:Rp." + (bayar+13000)+",-");
       
   }
    
}

