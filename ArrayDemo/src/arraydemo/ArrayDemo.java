/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author KOL-FACULTY01
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int a;
        a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        
        
        
    }
    
}
