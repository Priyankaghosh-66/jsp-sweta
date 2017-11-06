<%-- 
    Document   : logindb
    Created on : Sep 18, 2017, 10:05:53 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,java.util.*"%>
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
        
       
        <div id="loginref">
                        
            
                    </div>
				
        
        <%
        
        try{
            
        Class.forName ("com.mysql.jdbc.Driver");
        Connection con;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/destinyreacher","root","tiger");
        
        Statement st = con.createStatement();    
        
        String a=request.getParameter("username");
        String b=request.getParameter("password");        
         //String sm=(String)session.getAttribute("user");
           // out.println(" Login : "+sm);
            
        
        String sql="select * from userprofile where username='"+a+"' and password='"+b+"'";
        
       
        ResultSet rs=st.executeQuery(sql);
        
        boolean flag=false;
        String c="";
        String d="";
        String e="";
        String f="";
        while(rs.next())
        {
            flag=true;
            c=rs.getString(1);
            d=rs.getString(2);
            e=rs.getString(3);
            f=rs.getString(4);
            
         }
        
         //email found password match
        if(flag)
       {
            //session object created
            session.setAttribute("Username",a); 
            out.println("  <br> <h1> Login successfully </h1>");
            
            //if(e.equals("admin"))
            //out.println(" <br>  <a href='AdminHome.jsp'> Proceed</a> ");
            //else
            //out.println(" <br><br><br>  <a href='Userhome.jsp'> Proceed</a> ");
            
            
            
        }
        else{
            out.println("  Login failed !! ");            
            out.println(" <br>  <a href='Home.jsp'>  Try Again</a> ");
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
