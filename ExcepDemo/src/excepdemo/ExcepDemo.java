/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepdemo;

import java.io.FileOutputStream;

/**
 *
 * @author KOL-FACULTY01
 */
public class ExcepDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream=new FileOutputStream("E:\\hu.txt")){
            String msg="Welcome to hello world!!";
            byte byteArray[]=msg.getBytes();
            fileOutputStream.write(byteArray);
            System.out.println("message printed on text file.");
        }catch(Exception e)
        {
            System.out.println(e);
        }
        // TODO code application logic here
    }
    
}
