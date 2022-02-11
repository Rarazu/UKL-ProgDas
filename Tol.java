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
public class Tol {
    public static void main (String[] args){
        System.out.println("ID Daerah Masuk-Tujuan : ");
        System.out.println("=========SISTEM TERBUKA=========");
        System.out.println("Dupak-Waru = 1");
        System.out.println("=========SISTEM TERTUTUP========");
        System.out.println("Waru-Sidoarjo = 2");
        System.out.println("Waru-Porong = 3");
        System.out.println("Sidoarjo-Waru = 4");
        System.out.println("Sidoarjo-Porong = 5");
        System.out.println("Porong-Sidoarjo = 6");
        System.out.println("Porong-Waru = 7");
        System.out.println("========TERBUKA RELOKASI========");
        System.out.println("Porong-Kejapanan = 8");
        System.out.println("Kejapanan-Gempol = 9");
        System.out.println("===============================");
        System.out.println("Golongan Kendaraan : ");
        System.out.println("Gol 1 = Sedan, Jip, Pick Up");
        System.out.println("Gol 2 = Truk 2 sumbu roda");
        System.out.println("Gol 3 = Truk 3 sumbu roda");
        Scanner userInput=new Scanner(System.in);
        System.out.println("========MASUKKAN DATA========");
        System.out.print("Masukkan ID daerah masuk-tujuan = ");
        int id = userInput.nextInt();
        System.out.print("Masukkan Golongan Kendaraan = ");
        int gol = userInput.nextInt();

        int harga=0;
        //ID 1
        if (id==1&&gol==1){
            harga=harga+5000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==1&&gol==2){
            harga=harga+8000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==1&&gol==3){
            harga=harga+8000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        //ID 2
        if (id==2&&gol==1){
            harga=harga+6000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==2&&gol==2){
            harga=harga+9000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==2&&gol==3){
            harga=harga+9000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        //ID 3
        if (id==3&&gol==1){
            harga=harga+6000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==3&&gol==2){
            harga=harga+14000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==3&&gol==3){
            harga=harga+14000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        //ID 4
        if (id==4&&gol==1){
            harga=harga+6000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==4&&gol==2){
            harga=harga+9000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==4&&gol==3){
            harga=harga+9000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        //ID 5
        if (id==5&&gol==1){
            harga=harga+5500;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==5&&gol==2){
            harga=harga+8500;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==5&&gol==3){
            harga=harga+8500;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        //ID 6
        if (id==6&&gol==1){
            harga=harga+5500;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==6&&gol==2){
            harga=harga+8500;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==6&&gol==3){
            harga=harga+8500;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        //ID 7
        if (id==7&&gol==1){
            harga=harga+9000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==7&&gol==2){
            harga=harga+14000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==7&&gol==3){
            harga=harga+14000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        //ID 8
        if (id==8&&gol==1){
            harga=harga+6000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==8&&gol==2){
            harga=harga+8500;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==8&&gol==3){
            harga=harga+8500;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        //ID 9
        if (id==9&&gol==1){
            harga=harga+3000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==9&&gol==2){
            harga=harga+5000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }
        if (id==9&&gol==3){
            harga=harga+5000;
            System.out.println("Harga yang harus dibayarkan : "+harga);
        }


    }
}
