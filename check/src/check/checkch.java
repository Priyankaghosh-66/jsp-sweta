/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

/**
 *
 * @author KOL-FACULTY01
 */
public class checkch extends Check{
    public static boolean isPowOfTwo(double num)
    {
        if(num<0)
            return false;
        while(num>1)
        {
            if(num%2.0!=0)
                return false;
            num=num/2.0;
        }
        return true;
    }
}
