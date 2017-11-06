/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author KOL-FACULTY01
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> arl=new ArrayList<String>();
        arl.add("Rahul");
        arl.add("Ravi");
        arl.add("Raman");
        arl.add("Ricky");
        arl.add("Rima");
        
        System.out.println("The values inside arraylist elements are:"+arl);
        
        arl.remove("Raman");
        arl.remove("Ricky");
        
        System.out.println("The values inside arraylist elements are:"+arl);
        
        arl.add("Dream");
        arl.add("flower");
        
        System.out.println("The values of arl after all works:"+arl);
        
        
        
        
        
    }
    
}
