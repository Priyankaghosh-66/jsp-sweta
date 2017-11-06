/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializede;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author KOL-FACULTY01
 */
public class Serializede {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Student s1=new Student(211,"ravi");
        FileOutputStream fs=new FileOutputStream("D:\\testout.txt");
        ObjectOutputStream ou=new ObjectOutputStream(fs);
        ou.writeObject(s1);
        ou.flush();
        ou.close();
        
    }
    
}
