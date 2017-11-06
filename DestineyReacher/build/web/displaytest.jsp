<%-- 
    Document   : displaytest
    Created on : Sep 21, 2017, 4:55:44 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.io.*,java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           try
        {
            
        Class.forName ("com.mysql.jdbc.Driver");
        Connection con;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/destinyreacher","root","tiger");
        
        Statement st = con.createStatement();    


                 ResultSet rs=st.executeQuery("select * from journey ");
        while(rs.next()){
                 %>
          
            
                 <table  cellpadding="15" border="1" style="background-color: #ffffcc;">
    <tr> 
        <td>  <%=rs.getInt(1) %></td>

        <td>  <%=rs.getString(2)  %></td>
        <td>  <%=rs.getString(3)      %></td>
       <td>  <%=rs.getDate(4) %></td>

        <td>  <%=rs.getInt(5)  %></td>
        <td>  <%=rs.getInt(6)      %></td>
       <td>  <%=rs.getInt(7)      %></td>
       <td>  <%=rs.getInt(8)      %></td>    
    </tr>
                 </table>
        
        <%
        }
}
catch(Exception e){}        
            
        
    %>
    </body>
</html>
