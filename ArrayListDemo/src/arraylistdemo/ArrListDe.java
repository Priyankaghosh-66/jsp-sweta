/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author KOL-FACULTY01
 */
public class ArrListDe {
    
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        al.add("yahoo");
        al.add("gmail");
        al.add("rediff");
        al.add(5);
        
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
    
}
