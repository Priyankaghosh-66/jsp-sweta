<%-- 
    Document   : security
    Created on : Sep 22, 2017, 12:05:04 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="loginref">
                        
                        
                        <a href="signup.jsp">Sign Up </a>
                    </div>
                    <form name="destsearch" action="securitydb.jsp">
                        <div id="loginform">
                            <h2> Security Question Which will be used when you forget your Password</h2>
                            <table border="2" id="tabform">
                <tr>
                    <td> Question </td>
                    <td> <input type="text" name="question" value="" </td>
                    
                </tr>  
                <tr>
                    <td> Answer </td>
                    <td> <input type="text" name="answer" value="" </td>
                    
                </tr>  
                <tr>
                    <td>  </td>
                    <td> <input type="submit" name="submit" value="Submit" </td>
                    
                </tr>  
                
                
                
                
            </table>
                      </div>  
                    </form>
                    <br><br>
					<!--Forget Password? <a href="pchange.jsp">Click here !!! </a>
					<br><br>
					New Member? <a href="signup.jsp">Sign up !!! </a>-->
                </div>
          
    </body>
</html>
