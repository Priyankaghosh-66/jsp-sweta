<%-- 
    Document   : pchange2
    Created on : Sep 21, 2017, 11:29:10 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.io.*,java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" type="text/css" href="css/style1.css">
        <style>
            #badikeimg {
                float: center;
                padding:10 px;
            }
        </style>
    </head>
    <body>
         <h2> Checking login page ok or not </h2>
        
        <%
        
        try{
            
        Class.forName ("com.mysql.jdbc.Driver");
        Connection con;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/destinyreacher","root","tiger");
        
        
        Statement st = con.createStatement();    
        
        String a=request.getParameter("email");
        
        
      
        
        String sql="select * from userprofile where email='"+a+"'";
        
        
        
        ResultSet rs=st.executeQuery(sql);
        
        boolean flag=false;
        String f="";
        
        
        while(rs.next())
        {
            flag=true;
            
            f=rs.getString(8);
            
         }
        
      
         //email found password match
        if(flag)
       {
            
            %>
            
            <form action="pchange3.jsp">
    
    <h3>
 Email
<input type="text" readonly value="<%=a%>" name="email" id="em">
   </h3>
    
<h3>
Your questions
<input type="text" value="<%=f%>" name="question">
   </h3>
   
<h3>
Please Answer
<input type="text" value="" name="answer">
   </h3>   
   
<h3>
Click to 
<input type="submit" value="continue" name="sub">
</h3>
        
    
</form>
            
            
            
            <%
            
        }
        else{
            out.println("  EMAIL do not exists  ");            
            out.println(" <br>  <a href='index.jsp'>  try Again</a> ");
            }
        
        
        }catch(Exception e){
            
            }
        
    %>
    </body>
</html>
