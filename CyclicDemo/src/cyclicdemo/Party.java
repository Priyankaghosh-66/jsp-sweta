/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyclicdemo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOL-FACULTY01
 */
public class Party extends Thread{
    private int dur;
    private CyclicBarrier barrier;
    
   public Party(int duration,CyclicBarrier barrier,String name)
   {
       super(name);
       this.dur=duration;
       this.barrier=barrier;
   }
   public void run()
           {
        try {
            Thread.sleep(dur);
            System.out.println(Thread.currentThread().getName()+"is calling await()");
            barrier.await();
            System.out.println(Thread.currentThread().getName()+"has Started again");
        } catch (InterruptedException|BrokenBarrierException ex) {
            ex.printStackTrace();
        }
       
   }
    
}
