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
public class Length {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        while(n>0)
        {
            i=n%10;
            count++;
            n=n/10;
            
            
        }
        System.out.println("the length of a number is:"+count);
    }
    
}
