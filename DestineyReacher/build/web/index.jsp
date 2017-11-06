<%-- 
    Document   : index
    Created on : Sep 13, 2017, 9:24:59 AM
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
                    
                </div>
            </div>
        
        
    </div>
         
        </center>
        <jsp:include page="footer.jsp" />
        <a href="adminpanel.jsp"> Admin Login </a>
       
    </body>
</html>
