/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcheck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author KOL-FACULTY01
 */
public class StringCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String s=br.readLine();
        s=s.toLowerCase();
        int l=s.length();
        int count=0;
        char ch;
        for(char c='a';c<='z';c++)
        {
            count=0;
            for(int j=1;j<l;j++)
            {
                ch=s.charAt(j);
                if(ch==c)
                count++;
                if(count!=0)
        {
            System.out.println(ch+"\t\t"+count);
        }
            }
        }
        
        
    }
    
    
}
