/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexample;

/**
 *
 * @author KOL-FACULTY01
 */
public class JoinThread extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try{
                Thread.sleep(500);
                
            }catch(Exception ex)
            {
                System.out.println(ex);
            }
            System.out.println(i);
        }
    }
        public static void main(String[] args)
        {
            JoinThread obj=new JoinThread();
            JoinThread obj1=new JoinThread();
            JoinThread obj2=new JoinThread();
            obj.start();
            try{
                obj.join();
            }catch(Exception ex)
            {
                System.out.println(ex);
            }
            obj1.start();
            obj2.start();
        }
    }
    

