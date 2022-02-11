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
public class PDAM {
    static int hitung(int nilai) {
        int bayar=0;
        
    //pengitungan 10 kedua
    if (nilai<10 && nilai>0){
        bayar=2000;}

    //pengitungan 10 kedua
    if (nilai>10 && nilai<21){
        bayar=3000;}

    //pengitungan 10 ketiga
    if (nilai>20 && nilai<31){
        bayar=4000;}
    
    //pengitungan selanjutnya
    if (nilai>31){
        bayar=5000;}

 return bayar;
 }

 public static void main(String[] args) {
     int id[]={1,2,3,4,5};//id pelanggan
     String namaPelanggan[]={"Ali", "Budi", "Dani", "Edi", "Umar"};
     //namapelanggan
     Scanner myObj = new Scanner(System.in);
     System.out.println("Masukkan id pelanggan");
     String idIn = myObj.nextLine();
     int iId=Integer.valueOf(idIn);
     
     System.out.println("Masukkan jumlah tagihan");
     String tagihan = myObj.nextLine();
     int iTagihan = Integer.valueOf(tagihan);
     
     iTagihan=hitung(iTagihan);
     
     iTagihan=iTagihan+10000;

     System.out.println("Print Out Tagihan");
     System.out.println("ID\t:" + idIn);
     System.out.println("Nama\t:" + namaPelanggan[iId-1]);
     System.out.println("Tagihan\t:Rp." + iTagihan+",-");
   }
 }
    

