package fileio;
import java.io.*;
import java.util.Scanner;
public class Fileio {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //File f=new File("d:\a.txt");
       Scanner sc=new Scanner(System.in);
       /* FileOutputStream fin=new FileOutputStream("a.txt");
         String s=sc.nextLine();
        byte [] b=s.getBytes();
        
        fin.write(b);
        System.out.println("done");
      FileInputStream fs=new FileInputStream("a.txt");
      byte [] b=new byte[fs.available()];
        fs.read(b);
        String s=new String(b);
        System.out.println(s);
        FileWriter fw=new FileWriter("b.txt");
                String s=sc.nextLine();
                fw.write(s);
                fw.flush();
                fw.close();*/
       FileReader fr=new FileReader("b.txt");
      
    }
    
}
