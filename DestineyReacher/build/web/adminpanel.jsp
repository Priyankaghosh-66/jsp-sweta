<%-- 
    Document   : adminpanel
    Created on : Sep 14, 2017, 7:35:22 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        
         <link rel="stylesheet" type="text/css" href="css/style1.css">
        <style>
            #badikeimg {
                float: center;
                padding-top: 50px;
            }
            #container1
            {
                height: 800px;
                color: blueviolet;
                border-color: red;
            }
            #row11
            {
                height: 1000px; 
            }
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp" />
    <center>
        <div id="container">
        
        <div id="row11">
               <div id="container1">
                    <a href="seatassign.jsp"> assign seat</a>
                     <a href="newroute.jsp">newroute </a>
                        
                        <a href="login.jsp">Login </a>
                        <a href="signup.jsp">Sign Up </a>
                        <a href="bookticket.jsp">Book Now </a>
                    
                
            </div>
        
        
    </div>
         
        </center>
        <jsp:include page="footer.jsp" />
    </body>
</html>
