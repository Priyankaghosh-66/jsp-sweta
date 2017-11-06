<%-- 
    Document   : pchange3
    Created on : Sep 21, 2017, 11:44:12 PM
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
                padding-top: 50px;
            }
                        #sessionName{
                
                float:right;
            }
        </style>
    </head>
    <body>
        
         <jsp:include page="header.jsp" />
        
    <center>
        <div id="container">
            
        <div id="row3">
                <div id="badike">
                    <b> We welcome you </b> 
                     <div id="badikeimg">
                  <img src="image/th.jpg" alt="HTML5 Icon" style="width:150px;height:200px;">
  </div> 
                </div>
                <div id="dandike">
                     <div id="sessionName"> 
            <%
            String sm=(String)session.getAttribute("Username");
            out.println(" Login : "+sm);
            %>
        </div>
        <h2> Checking login page ok or not </h2>
        
        <%
        
        try{
            
        Class.forName ("com.mysql.jdbc.Driver");
        Connection con;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/destinyreacher","root","tiger");
        
        
        Statement st = con.createStatement();    
        
        String a=request.getParameter("email");
        String g=request.getParameter("answer");
        
        
      
        
    String sql="select * from userprofile where email='"+a+"' and answer1='"+g+"'";
        
        
        
        ResultSet rs=st.executeQuery(sql);
        
        boolean flag=false;
        String b="";
        
        
        while(rs.next())
        {
            flag=true;
            
            b=rs.getString(9);
            
            
         }
        
      
         //email found password match
        if(flag)
       {
            
            %>
            
            
    
            <table>
                
                
                <tr>
                    <td>
                        Email            
                    </td>
                    
                    <td>
                        <%=a%>           
                    </td>
                </tr>
              
                <tr>
                    <td>
                    Password Retrieved
                    </td>
                    
                    <td>
                        <%=b%>           
                    </td>
                </tr>
              
            <tr>
                    <td>
                       Click to login again 
                    </td>
                    
                    <td>
                        <a href="index.jsp"> Login</a>
                    </td>
                </tr>              
                   
    
    </table>

     
            
            
            <%
            
        }
        else{
            out.println("  Answer not correct  ");            
            out.println(" <br>  <a href='Forget.jsp'>  try Again</a> ");
            }
        
        
        }catch(Exception e){
            
            }
        %>
         <h3> Update personal details </h3>
    
            
    For Security Concern Update your profile   <a href="security.jsp">Update Profile </a>
        <h3> Password change<a href="pchange.jsp"> go </a> </h3>
        
        <h3>  Give feedback <a href="FeedbackForm.jsp">go</a></h3>
        <a href="bookticket.jsp">Login </a></br>
                </div>
        </div>
        </div>
         
    </center>

<jsp:include page="footer.jsp" />
    </body>
</html>
