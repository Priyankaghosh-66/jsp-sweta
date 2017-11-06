<%-- 
    Document   : signup
    Created on : Sep 14, 2017, 12:33:53 AM
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
                padding-top: 50px;
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
                    </div>
                    
                    <h2>Seat Booking Page</h2>
        <table border="1" id="tab">
        <form name="f2" action="signupdb.jsp">
           <!-- <tr>
<td>Select type of user</td>
<td><select name="type" id="type"value="">
<option value="user">user</option>
<option value="admin">admin</option>
</select></td>
</tr>-->
        <tr><td> Name:</td><td> <input type= "text" name="name" value=""></td></tr>
        
         <tr>
      
       <td>Date Of Birth : (YYYY)</td><td><select name="year">
       <option value="">Select</option>
       <option value="1990">1990</option>
       <option value="1991">1991</option>
       <option value="1992">1992</option>
       <option value="1993">1993</option> </select></td>
      
      
       <td>MM</td><td><select name="month">
       <option value="">Select</option>
       <option value="01">jan</option>
       <option value="02">Feb</option>
       <option value="03">March</option>
       <option value="04">April</option> </select></td>
      
      
       <td>DD</td><td><select name="day">
       <option value="">Select</option>
       <option value="01">01</option>
       <option value="02">02</option>
       <option value="03">03</option>
       <option value="04">04</option>
       <option value="05">05</option>
       <option value="06">06</option>
       <option value="07">07</option>
       <option value="08">08</option>
       <option value="09">09</option></select></td>
      
       </tr>
       <!--  <tr><td>Date of birth</td><td><input type= "date" name="dob" value=""></td></tr>
        <tr><td> Father's name:</td><td> <input type= "text" name="fname" value=""></td></tr>-->
        <tr><td>Mobile No:</td><td><input type= "text" name="mob" value=""></td></tr>
        <tr><td>Email:</td><td><input type= "text" name="email" value=""></td></tr>
       <!-- <tr><td>Present Address:</td><td><input type= "text" name="present" value=""></td></tr>
        <tr><td>Pincode:</td><td><input type= "number" name="prepin" value=""></td></tr>
        <tr><td>Permanent Address:</td><td><input type= "text" name="permanent" value=""></td></tr>
        <tr><td>Pincode:</td><td><input type= "number" name="perpin" value=""></td></tr>
        <tr>
					<td>Set security question</td>
					<td><select name="sel" id="sel">
                         <option value="What is your favourite colour?">What is your favourite colour?</option>
                         <option value="What is your pet?">What is your pet?</option>
                         </select></td>
					</tr>
					<tr>
					<td>Your answer </td>
					<td> <input type="password" name="ansr"></td>
					</tr>-->
        
     
        <tr><td>Username:</td><td><input type= "text" name="user" value=""></td></tr>
        <tr><td>Password:</td><td><input type= "password" name="pass" value=""></td></tr>
        
        <tr> <td><input type= "submit" name="sub" value="Register"></td></tr>
        </form>
        </table>
                    
                </div>
            </div>
        
        
    </div>
        </center>
        
        <jsp:include page="footer.jsp" />
    </body>
</html>
