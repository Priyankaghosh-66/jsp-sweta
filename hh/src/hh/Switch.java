/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh;

import java.util.Scanner;

/**
 *
 * @author KOL-FACULTY01
 */
public class Switch {
    public static void main(String[] args)
    {
        char ch;
        int a,b,res;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.println("Enter the choice!");
        
        switch(ch)
        {
            case '+':System.out.println("Enter two numbers:");
            a=sc.nextInt();
            b=sc.nextInt();
            res=a+b;
                System.out.println("The result is"+res);
                break;
        }
        
    }
    
}
