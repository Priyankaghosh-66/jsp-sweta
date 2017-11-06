/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author KOL-FACULTY01
 */
public class FileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte[] b=new byte[128];
        int bLen=b.length;
        try(FileOutputStream fos=new FileOutputStream("copyfile.txt"))
        {
            int count=0,read=0;
            while((read=System.read(b,"datafile.txt")) !=-1)
            {
                if(read<bLen)fos.write(b,0,read);
                else fos.write(b);
                count+=read;
            }
            System.out.println("File Written");
            
        }
        catch(FileNotFoundException f)
        {
            System.out.println("File not Found");
        }
        catch(IOException e)
        {
            System.out.println("IOException occured");
        }
    }
    
}
