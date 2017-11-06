/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author KOL-FACULTY01
 */
public class CollectionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     List li=new ArrayList();
     li.add("Sweta");
     li.add("Priyanka");
     li.add("Poulami");
     li.add(24);
        System.out.println("Arraylist elements:");
        System.out.println("\t" +li);
        
        List a1=new LinkedList();
     a1.add("Sweta");
     a1.add("Priyanka");
     a1.add("Poulami");
     a1.add(1);
        System.out.println();
        System.out.println("Arraylist elements:");
        System.out.println("\t" +a1);
        
        Set<String> s1=new HashSet<>();
        //HashSet<String> s1=new Set<String>();
        s1.add("qwerty");
        s1.add("tyui");
        s1.add("asdfg");
        s1.add("asdfg");
        
        
        System.out.println();
        System.out.println("HashSet elements:");
        System.out.println("\t "+s1);
        
        
        Map m1=new HashMap();
        m1.put("Potato", 60);
        m1.put("Cabbage", 70);
        m1.put("carrot", 40);
        m1.put("carrot", 40);
        System.out.println();
        System.out.println("HashMap elements:");
        System.out.println("\t "+m1);
        
     
    }
    
}
