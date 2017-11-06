/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinput;

import java.io.FileWriter;

/**
 *
 * @author KOL-FACULTY01
 */
public class FileInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("E://temp.txt");
            fw.write("Welcome to World");
            fw.close();
            
        }catch(Exception e)
        {
            System.out.println(e);
            
        }
        System.out.print("success...");
    }
    
}
