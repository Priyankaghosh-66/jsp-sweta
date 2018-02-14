/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author KOL-FACULTY01
 */
public class twostar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
