/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import java.util.Scanner;

/**
 *
 * @author KOL-FACULTY01
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
       int c=sc.nextInt();
       for(int i=0;i<=c;i++)
       {
           for(int j=0;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println("");
       }
    }
    
}
