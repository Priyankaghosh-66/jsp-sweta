/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputstreamdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author KOL-FACULTY01
 */
public class FileInputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            byte bWrite[]={10,20,30,40};
            OutputStream os=new FileOutputStream("E://umbo.txt");
            for(int x=0;x<bWrite.length;x++)
            {
                os.write(bWrite[x]);
            }
            os.close();
            
            InputStream in=new FileInputStream("E://jumbo.txt");
            int size=in.available();
            
            for(int i=0;i<size;i++)
            {
                System.out.print((char)in.read()+ " ");
            }
            in.close();
            
        }catch(IOException e)
        {
            System.out.print("Exception:"+e.getMessage());
        }
    }
    
}
