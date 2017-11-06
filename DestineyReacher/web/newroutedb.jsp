<%-- 
    Document   : newroutedb
    Created on : Sep 14, 2017, 11:48:10 PM
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
                    <div id="loginref">
                        
                        <a href="login.jsp">Login </a>
                        <a href="signup.jsp">Sign Up </a>
                    </div>
        <%
String a = request.getParameter("src");
//String dob=request.getParameter("dob");
//String fname=request.getParameter("fname");
String b = request.getParameter("dest");
String year=request.getParameter("year");
 String month=request.getParameter("month");
 String day=request.getParameter("day");
//String c = request.getParameter("doj");
//String padd=request.getParameter("present");
//int ppin=Integer.parseInt(request.getParameter("prepin"));
//String permanentadd=request.getParameter("permanent");
//int permanentpin=Integer.parseInt(request.getParameter("perpin"));
String d = request.getParameter("total");
String f = request.getParameter("price");


String ddd = year+"-"+month+"-"+day;

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/destinyreacher", "root", "tiger");
 String sql="insert into journey(src,des,doj,tot,price) values('"+a+"','"+b+"','"+ddd+"','"+d+"','"+f+"')";
        
       
                
        Statement st=conn.createStatement();
        st.executeUpdate(sql);
        out.println("data inserted");
        String sql1="select * from journey";
        ResultSet rs=st.executeQuery(sql1);
        while(rs.next())
        {
            String aa=rs.getString("src");
            String bb=rs.getString("des");
            String cc=rs.getString("doj");
            String dd=rs.getString("tot");
            String ee=rs.getString("price");
            
            out.print("\n"+aa+"\t"+bb+"\t"+cc+"\t"+dd+"\t"+ee+"/t");
        }
        out.println(" <br> New Route is assigned successfully ");
        
        
        out.println(" <br> <a href='bookticket.jsp'>Book ticket now !!!</a> "); 
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
