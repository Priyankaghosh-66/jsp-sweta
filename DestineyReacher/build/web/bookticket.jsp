<%-- 
    Document   : bookticket
    Created on : Sep 14, 2017, 1:50:22 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                        
                         <h2>Book Ticket Now </h2>
        <form name="f1" action="bookticket1.jsp">
            <table>
            <tr>
               <td colspan="2"> Source</td>
               <td colspan="2"><select name="src" id="src">
                   <option value="Digha">Digha</option>
                   <option value="Kolkata">Kolkata</option>
              </select></td>              
            </tr>
            
            
                <tr>
               <td colspan="2">Destination</td> 
               <td colspan="2"><select name="des" id="des">
                  <option value="Kolkata">Kolkata</option>
                   <option value="Digha">Digha</option>
              </select></td>
                </tr>  
                
                <!-- 
                 <tr>
      
       <td>Select Date: (YYYY)</td><td><select name="year">
       <option value="">--Select--</option>
       <option value="2017">2017</option>
       <option value="2018">2018</option>
      <!-- <option value="1992">1992</option>
       <option value="1993">1993</option>  </select></td>
      
      
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
                
                 <!--<tr>
               <td colspan="2">Enter date of journey</td>
               <td colspan="2"><input type="date" name="doj" value=""></td>
                </tr>-->
               Date <input type="date" name="datea" value=" "/>
               <tr>
               <td colspan="2">Check available or not</td>
               <td colspan="2"><input type="submit" name="sub" value="submit"></td>
               </tr>              
                
               
           
            </table>           
        </form>
                    </div>
                    
                </div>
            </div>
        
        
    </div>
         
        </center>
        <jsp:include page="footer.jsp" />
    </body>
</html>
