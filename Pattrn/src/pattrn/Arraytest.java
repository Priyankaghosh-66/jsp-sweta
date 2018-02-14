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
public class Arraytest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //int arr[]=new int[10];
       int arr[]={1,2,3,4,6,7,8,9};
       for(int i=1;i<10;i++)
       {
           for(int j=0;j<=i;j++)
           {
               if(arr[j]!=arr[i])
               System.out.println("The not found element is:"+i);
           }
       }
    }
    
}
