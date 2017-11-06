package connectivity;
import java.io.*;
import java.sql.*;
public class Connectivity {
    public static void main(String[] args) throws IOException,SQLException, ClassNotFoundException {
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
       Statement stmt=con.createStatement();
     /*  ResultSet rs=stmt.executeQuery("select * from customer");
       while(rs.next())
       {
           System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t");
       }*/
     stmt.execute("insert into customer values(30,'sweta',12345)");
    }
    
}
