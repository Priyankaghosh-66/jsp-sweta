/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impo;

/**
 *
 * @author KOL-FACULTY01
 */
public class impo1 {
    static int count=100;
    public void increment()
    {
        count++;
    }
    public static void main(String[] args)
    {
        impo1 im=new impo1();
        im.increment();
        impo1 imw=new impo1();
        System.out.println(imw.count);
        
    }
    
}
