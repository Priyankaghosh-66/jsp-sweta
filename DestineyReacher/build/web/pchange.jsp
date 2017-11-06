<%-- 
    Document   : pchange
    Created on : Sep 21, 2017, 11:22:19 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <div id="loginref">
                        
                        <a href="login.jsp">Login </a>
                        <a href="signup.jsp">Sign Up </a>
                        <a href="bookticket.jsp">search bus </a>
                        
                        <a href="displaytest.jsp">Display </a>
                    </div>
                    <h2>Forget Password </h2>
        <form action="pchange2.jsp">
    
    <h3>
Enter Email
<input type="text" value="" name="email">
   </h3>
    

   
<h3>
Click and proceed
<input type="submit" value="GO" name="sub">
    <br> <br>
    <a href="Register.jsp"> New User? sign up </a>
   </h3>   
   <hr>
   <a href="index.jsp"> Home </a>
</form>
        
                </div>
            </div>
        
        
    </div>
         
        </center>
           
        
    </body>
</html>
