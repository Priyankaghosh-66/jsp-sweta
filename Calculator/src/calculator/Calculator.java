/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        char ch,choice;
        int n,a,b,res;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("1.Addition:");
        System.out.println("2.Substraction:");
        System.out.println("3.Multiplication:");
        System.out.println("4.Division:");
        System.out.println("5.Exit:");
        System.out.println("Enter your choice:");
        choice=sc.next().charAt(0);
        switch(choice){
            case '1':System.out.println("Enter the Two number:");
            a=sc.nextInt();
            b=sc.nextInt();
            res=a+b;
            System.out.println("The result is:"+res);
            break;
            case '2':System.out.println("Enter the Two number:");
            a=sc.nextInt();
            b=sc.nextInt();
            res=a-b;
            System.out.println("The result is:"+res);
            break;
            case '3':System.out.println("Enter the Two number:");
            a=sc.nextInt();
            b=sc.nextInt();
            res=a*b;
            System.out.println("The result is:"+res);
            break;
            case '4':System.out.println("Enter the Two number:");
            a=sc.nextInt();
            b=sc.nextInt();
            res=a/b;
            System.out.println("The result is:"+res);
            break;
            case '5':System.exit(0);
            break;
            default :System.out.println("Wrong choice!!!!");
            break;
        } System.out.println("/----------------------------------/");
        }while(choice!=5);
               

    }    
        
    }
   

