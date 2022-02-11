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
public class Aritmatika1 {
    public static void main(String[] args) {
        int a=9;
        int b=6;
        int n=10;
        int u=a;
        int s=a;
        
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<n;i++){
            System.out.println(u);
            u=u+b; 
            s=s+u;
        }
        s=s-u; 
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
    }
}
