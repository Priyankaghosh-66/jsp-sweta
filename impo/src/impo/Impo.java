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
public class Impo {
    int x=10;
    public void assign(int x)
    {
        x=x;
        System.out.println(this.x);
    }

    
    public static void main(String[] args) {
        new Impo().assign(100);
        // TODO code application logic here
    }
    
}
