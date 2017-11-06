/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moddemo;

/**
 *
 * @author KOL-FACULTY01
 */
public class EvalDemo {
    static int n;
    static float a;
    static byte b;
    static long l;
    static short s;
    static char c;
    static double d;
    
    public static void main(String[] args){
        System.out.println("Size of int:"+(Integer.SIZE)+"bytes.");
        System.out.println("Size of byte:"+(Byte.SIZE/8)+"bytes.");
        System.out.println("Size of long:"+(Long.SIZE/8)+"bytes.");
        System.out.println("Size of short:"+(Short.SIZE/8)+"bytes.");
        System.out.println("Size of charater:"+(Character.SIZE/8)+"bytes.");
        System.out.println("Size of float:"+(Float.SIZE/8)+"bytes.");
        System.out.println("Size of double:"+(Double.SIZE/8)+"bytes.");
    }
    
}
