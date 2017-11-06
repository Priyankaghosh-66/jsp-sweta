/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author KOL-FACULTY01
 */
public class JdbcTest {

    public static Connection getDBConnection ()
    {
        Connection con=null;
       try{
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           con=DriverManager.getConnection("jdbc:derby://localhost:1527/Demo", "sa", "sa");
           //Statement st=con.createStatement();
         
       }catch(Exception e)
       {
           System.out.println(e);
       }
       return con;
       
    }
    public static java.sql.Timestamp getCurrentTimestamp(java.util.Date dt)
    {
         dt=new java.util.Date();
        return new java.sql.Timestamp(dt.getTime());
    }
}
    

