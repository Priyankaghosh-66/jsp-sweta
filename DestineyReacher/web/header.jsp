<%-- 
    Document   : header
    Created on : Sep 13, 2017, 9:28:25 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #container
           {
               width:80%;
               background:appworkspace;
               height: 200px;
           }
            
           #row1
           {
               width:100%;
               height: 120px;
               background: grey;
               
           }
           
            
           #heading
           {
               color: orchid;
               font-size: 50px;
               padding: 20px;
               float:center;
               
           }
           #headimg
           {
               float: left;
           }
            #headimg1
           {
               float: right;
           }
           #row2 {
               
                width: 100%;
               height: 40px;
               background-color: #cdcdcd;
               
           }
           ul li {
               list-style-type: none;
               float: left;
               padding: 10px;
               
           }
           a{
               color: navy;
               text-decoration: none;
               
           }
           a:hover {
               text-decoration: underline;
               color: red;
               
           }
           
            
        </style>
    </head>
    <body>
    <center>
        <div id="container">
            
            <div id="row1">
                <div id="headimg">
                  <img src="image/busheading.jpg" alt="HTML5 Icon" style="width:200px;height:100px;">
  </div>
                <div id="headimg1">
                  <img src="image/th1.jpg" alt="HTML5 Icon" style="width:200px;height:100px;">
  </div>
                
                <div id="heading">
                                    Destiny Reacher
                </div>
                
            </div> 
            <div id="row2" >
                <ul>
                    <li>
                        <a href="index.jsp"> Home</a>
                    </li>
                    <li>
                        <a href="#"> Search</a>
                    </li>
                    <li>
                        <a href="#"> Contact Us</a>
                    </li>
                    <li>
                        <a href="aboutus.jsp"> Aboutus</a>
                    </li>
                    <li>
                        <a href="#"> Search</a>
                    </li>
                </ul>
               
            </div> 
        </div>
    </center>
    </body>
</html>
