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
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,sum=0,val;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a valid number:");
        num=sc.nextInt();
        int temp=num;
        while(temp!=0)
        {
            val=temp%10;
            sum=sum*10+val;
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println("its a pa;indrome"+sum);
        }
        else
        {
            System.out.println("its not palindrome"+sum);
        }
        
    }
    
}
