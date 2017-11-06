/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overrideeg;

/**
 *
 * @author KOL-FACULTY01
 */
public class Child extends Parent{
    void add(int num)
    {
        int res=num+num;
        System.out.println("Inside child print method."+res);
    }
}
