/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparearray;

public class CompareArray {

    
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={9,8,2,7,1};
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println("The matching numbers are:"+arr1[i]);
                }
//                else
//                {
//                    System.out.println("no matching elements found!!");
//                }
            }
        }
        
    }
    
}
