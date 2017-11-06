/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyclicdemo;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author KOL-FACULTY01
 */
public class CyclicDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CyclicBarrier barrier=new CyclicBarrier(3);
        Party ob1=new Party(1000,barrier,"th-1");
        Party ob2=new Party(1000,barrier,"th-2");
        Party ob3=new Party(1000,barrier,"th-3");
        Party ob4=new Party(1000,barrier,"th-4");
        
        ob1.start();
        ob3.start();
        ob2.start();
        ob4.start();
        
        System.out.println(Thread.currentThread().getName()+"has finished");
    }
    
}
