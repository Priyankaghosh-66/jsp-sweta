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
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int var=sc.nextInt();
       int sum=1;
       for(int i=var;i>0;i--)
       {
        sum=sum*i;
    }
        System.out.println(sum);
    
}
}
