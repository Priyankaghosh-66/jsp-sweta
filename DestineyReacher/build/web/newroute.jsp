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
                    
                    <h2>New Bus Route</h2>
        <table border="1" id="tab">
        <form name="f2" action="newroutedb.jsp">
       <!-- <tr><td> ID:</td><td> <input type= "text" name="id" value=""></td></tr>-->
         
        <tr><td> Source:</td><td> <input type= "text" name="src" value=""></td></tr>
        
        <tr><td>Destination:</td><td><input type= "text" name="dest" value=""></td></tr>
        <!--<tr><td>Pincode:</td><td><input type= "text" name="prepin" value=""></td></tr>
        <tr><td>Date of Journey</td><td><input type= "text" name="doj" value=""></td></tr>-->
        
           <tr>
      
       <td>Select Date: (YYYY)</td><td><select name="year">
       <option value="">--Select--</option>
       <option value="2017">2017</option>
       <option value="2018">2018</option>
       <!--<option value="1992">1992</option>
       <option value="1993">1993</option> --> </select></td>
      
      
       <td>MM</td><td><select name="month">
       <option value="">--Select--</option>
       <option value="01">jan</option>
       <option value="02">Feb</option>
       <option value="03">March</option>
       <option value="04">April</option> 
       <option value="05">May</option>
       <option value="06">June</option>
       <option value="07">July</option>
       <option value="08">August</option>
       <option value="09">September</option>
       <option value="10">October</option>
       <option value="11">November</option>
       <option value="12">December</option></select></td>
      
      
       <td>DD</td><td><select name="day">
       <option value="">--Select--</option>
       <option value="01">01</option>
       <option value="02">02</option>
       <option value="03">03</option>
       <option value="04">04</option>
       <option value="05">05</option>
       <option value="06">06</option>
       <option value="07">07</option>
       <option value="08">08</option>
       <option value="09">09</option>
       <option value="10">10</option>
       <option value="11">11</option>
       <option value="12">12</option>
       <option value="13">13</option>
       <option value="14">14</option>
       <option value="15">15</option>
       <option value="16">16</option>
       <option value="17">17</option>
       <option value="18">18</option>
       <option value="19">19</option>
       <option value="20">20</option>
       <option value="21">21</option>
       <option value="22">22</option>
       <option value="23">23</option>
       <option value="24">24</option>
       <option value="25">25</option>
       <option value="26">26</option>
       <option value="27">27</option>
       <option value="28">28</option>
       <option value="29">29</option>
       <option value="30">30</option>
       <option value="31">31</option></select></td>
      
       </tr>
        <tr><td>total number of seat:</td><td><input type= "text" name="total" value=""></td></tr>
        <tr><td>Price of a ticket:</td><td><input type= "text" name="price" value=""></td></tr>
       
        
        <tr> <td><input type= "submit" name="sub" value="insert"></td></tr>
        </form>
        </table>
                    
                </div>
            </div>
        
        
    </div>
        </center>
        
        <jsp:include page="footer.jsp" />
    </body>
</html>
