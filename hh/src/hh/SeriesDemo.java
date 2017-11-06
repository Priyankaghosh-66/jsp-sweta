/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh;

/**
 *
 * @author KOL-FACULTY01
 */
public class SeriesDemo {
    public static void main(String[] args)
    {
        int limit=50;
        System.out.println("Printing even numbers between 1 to"+limit);
        System.out.print("s=");
        for(int i=0;i<=limit;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
        
    }
    
}
