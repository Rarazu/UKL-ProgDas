/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

/**
 *
 * @author MOKLET-1
 */
public class Array1 {
    public static void main(String[] args) {
        int a[][]={{-7,5,2,3},{4,8,5,3},{1,5,8,5}};
        int b[][]={{1,1,-2,7},{-4,9,-7,4},{1,-1,7,6}};
        System.out.println("Hasil A-B");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]-b[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
