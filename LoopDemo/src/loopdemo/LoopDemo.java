/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopdemo;

/**
 *
 * @author KOL-FACULTY01
 */
public class LoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
       for(int i=0;i<=5;i++){
           for(int j=0;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    
}
