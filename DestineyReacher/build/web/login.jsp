<%-- 
    Document   : login
    Created on : Aug 29, 2017, 9:12:53 PM
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
            #loginform {
                padding: 20px;
                font-size: 20px;
                float: center;
            }
            #tabform
            {
                border-spacing: 2px;
                padding: 5px;
                background-color: violet;
                text-align: center;
                
                
            }
        </style>
    </head>
    <body>
        
         <jsp:include page="header.jsp" />
        <center>
        <div id="container">
        
        <div id="row3">
                <div id="badike">
                    Our side
                </div>
                <div id="dandike">
                    <div id="loginref">
                        
                        
                        <a href="signup.jsp">Sign Up </a>
                    </div>
                    <form name="destsearch" action="logindb.jsp">
                        <div id="loginform">
                            <h2> Login Here</h2>
                            <table border="2" id="tabform">
                <tr>
                    <td> UserName </td>
                    <td> <input type="text" name="username" value="" </td>
                    
                </tr>  
                <tr>
                    <td> Password </td>
                    <td> <input type="password" name="password" value="" </td>
                    
                </tr>  
                <tr>
                    <td>  </td>
                    <td> <input type="submit" name="submit" value="Submit" </td>
                    
                </tr>  
                
                
                
                
            </table>
                      </div>  
                    </form>
                    <br><br>
					Forget Password? <a href="pchange.jsp">Click here !!! </a>
					<br><br>
					New Member? <a href="signup.jsp">Sign up !!! </a>
                </div>
            </div>
        
        
    </div>
        </center>
    </body>
</html>
