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
public class singledig {

    
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
           i=n%10;
           sum=sum+i;
           n=n/10;
        }
        System.out.println("The sum of the digits are:"+sum);
    }
    
}
