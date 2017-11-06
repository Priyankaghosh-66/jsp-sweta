/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattrn;

import java.util.Scanner;

/**
 *
 * @author KOL-FACULTY01
 */
public class Pattrn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows to print:");
        int n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    
}
