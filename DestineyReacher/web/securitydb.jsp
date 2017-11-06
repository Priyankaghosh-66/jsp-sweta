<%-- 
    Document   : securitydb
    Created on : Sep 22, 2017, 12:11:30 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"import="java.io.*,java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            String sm=(String)session.getAttribute("d");
            out.println(" Login : "+sm);
            %>
        <%
        String a = request.getParameter("question");
        String b = request.getParameter("answer");
        try
        {
            
        Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/destinyreacher", "root", "tiger");
// String sql="insert into userprofile(question1,answer1) values('"+a+"','"+b+"')";
String sql="update table userprofile (question1,answer1) values('"+a+"','"+b+"') where username=sm";
  Statement st=conn.createStatement();
        st.executeUpdate(sql);
        out.println("Your Account had been successfully Updated");
        
         st.close();
        conn.close();
}
        catch(Exception e)
{
}
%>
    </body>
</html>
