/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author KOL-FACULTY01
 */
public class JdbcDemo {

   
    public static void main(String[] args) {
        
        try{
            
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Test","Priyanka","password");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from Priyanka.Employee");
        
        
        rs.close();
        con.close();
        st.close();
        }catch(SQLException sx)
        {
            System.out.println(sx);
        }catch(Exception cx)
        {
            System.out.println(cx);
        }
    }
    
}
