<%-- 
    Document   : signupdb
    Created on : Sep 15, 2017, 12:20:36 AM
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
                    <%
            String sm=(String)session.getAttribute("d");
            out.println(" Login : "+sm);
            %>
                    <div id="loginref">
                        
                        <a href="login.jsp">Login </a>
                        <a href="signup.jsp">Sign Up </a>
                    </div>
        <%
String a = request.getParameter("name");
String year=request.getParameter("year");
 String month=request.getParameter("month");
 String day=request.getParameter("day");
//String dob=request.getParameter("dob");
//String fname=request.getParameter("fname");
String b = request.getParameter("mob");
String c = request.getParameter("email");
//String padd=request.getParameter("present");
//int ppin=Integer.parseInt(request.getParameter("prepin"));
//String permanentadd=request.getParameter("permanent");
//int permanentpin=Integer.parseInt(request.getParameter("perpin"));
String d = request.getParameter("user");
String f = request.getParameter("pass");

String ddd = year+"-"+month+"-"+day;
String m=(String)session.getAttribute("d");
            out.println(" Login : "+m);

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/destinyreacher", "root", "tiger");
 String sql="insert into userprofile(name,dob,mobile,email,username,password) values('"+a+"','"+ddd+"','"+b+"','"+c+"','"+d+"','"+f+"')";
        
       
                
        Statement st=conn.createStatement();
        st.executeUpdate(sql);
        out.println("Your Account had been successfully created");
        /* String sql1="select * from userprofile where username='d'";
        ResultSet rs=st.executeQuery(sql1);
        while(rs.next())
        {
            
            String aa=rs.getString("name");
            String bb=rs.getString("mobile");
            String cc=rs.getString("email");
            String dd=rs.getString("user");
           // String ee=rs.getString("ansr");
            
            out.print("\n"+aa+"\t"+bb+"\t"+cc+"\t"+dd+"\t");
        }
        out.println(" <br> Your account created successfully ");*/
        
       //session.setAttribute("name",+dd);
        out.println(" <br> <a href='Bookticket1.jsp'>Book ticket now !!!</a> "); 
        out.println(" <br> <a href='Home.jsp'>Log out</a> ");
       
       
            
        st.close();
        conn.close();

        }catch(Exception e){
            
        }
%>
                </div>
        </div>
        </div>
    </center>

<jsp:include page="footer.jsp" />
    </body>
</html>
