/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbctest;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author KOL-FACULTY01
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter a date :");
     String inp=sc.nextLine();
       
        
        try{
            SimpleDateFormat formatter=new SimpleDateFormat("MM dd yyyy HH:mm:ss",Locale.ENGLISH);
        Date date= formatter.parse(inp);
           java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            System.out.println(sqlDate);

            con=JdbcTest.getDBConnection();
        pstmt=con.prepareStatement("select * from employee where emp_date=?");
        pstmt.setDate(1, sqlDate);
        rs=pstmt.executeQuery();
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
        }
        catch(ParseException pe)
      {
          System.out.println(pe);
      }
        catch(SQLException sq)
        {
            System.out.println(sq);
        }
        
        
    }
    
}
