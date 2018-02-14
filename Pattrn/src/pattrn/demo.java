/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattrn;

/**
 *
 * @author KOL-FACULTY01
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(n+ " ");
                if(n<50)
            {
                n=n+2;
            }
            }
            System.out.println("");
            
        }
    }
    
}
