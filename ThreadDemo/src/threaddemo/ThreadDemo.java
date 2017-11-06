/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author KOL-FACULTY01
 */
public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thr th=new Thr();
        Thread thh=new Thread(th);
        thh.start();
        System.out.println("thh.getName()");
        for(int i=0;i<2;i++)
        {
            System.out.println("main thread");
        }
    }
    
}
