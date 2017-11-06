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
public class Thr extends Thread{
    public void run()
    {
        for(int i=0;i<=2;i++)
        {
            System.out.println("Child Thread");
        }
    }
    
}
