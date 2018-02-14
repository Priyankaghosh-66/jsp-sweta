/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KOL-FACULTY01
 */
public class PrimeCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m=0,flag=0,n;
        
         n=7;
         m=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+"is not prime number");
        }
        for(int i=2;i<=m;i++)
        {
            if(n%i==0)
            {
            System.out.println(n+"is not prime number");
            flag=1;
            break;
        }
    }
        if(flag==0)
        {
            System.out.println(n+"is prime number");
        }
        
        
    }
}
    

