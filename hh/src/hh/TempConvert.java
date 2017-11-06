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
public class TempConvert {
    public static void main(String[] args)
    {
        float temp;
        System.out.println("Enter the temp you wanted to convert:");
        Scanner sc=new Scanner(System.in);
        temp=sc.nextFloat();
        temp=(((temp-32)*5)/9);
        System.out.println("The float temp is"+temp);
    }
    
}
