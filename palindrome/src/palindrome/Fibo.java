/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author KOL-FACULTY01
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int var=0;
        for(int i=num;i>0;i--)
        {
            var=temp*i;
        }
        System.out.println(var);
    }
    
}
