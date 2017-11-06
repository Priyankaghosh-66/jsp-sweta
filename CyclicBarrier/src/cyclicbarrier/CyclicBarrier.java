/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author KOL-FACULTY01
 */
public class CyclicBarrier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        final CyclicBarrier barrier;
        barrier = new CyclicBarrier(2);
        new Thread(){
            public void run(){
                try{
                    System.out.println("Before Await");
                    barrier.await(5,TimeUnit.SECONDS);
                    System.out.println("After Await");
                }catch(BrokenBarrierException|InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        }.start();
    }
    
}
