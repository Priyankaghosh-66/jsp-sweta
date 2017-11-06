<%-- 
    Document   : bookticket1
    Created on : Sep 14, 2017, 2:32:08 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,java.io.*"%>
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
                        <a href="bookticket.jsp">Book Now </a>
          <%
              
        
        try
        {
            
        Class.forName ("com.mysql.jdbc.Driver");
        Connection con;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/destinyreacher","root","tiger");
        
        Statement st = con.createStatement();    
        
        String a=request.getParameter("src");
        String b=request.getParameter("des");        
        String c=request.getParameter("datea");        
         //String year=request.getParameter("year");
              //String month=request.getParameter("month");
              //String day=request.getParameter("day");
 

              //String ddd = year+"-"+month+"-"+day;
        
        
        
        String sql="select * from journey where src='"+a+"' and des='"+b+"' and doj='"+c+"'";  
        //String sql="select * from journey where src='"+a+"'"; 
        out.println(" <br> sql "+sql);
        
        //ResultSet rs=st.executeQuery(sql);
         ResultSet rs = st.executeQuery(sql);
        
        boolean flag=false;
        
        int tot=0;
        int bk=0;
        int av=0;
        int s=0;
        while(rs.next())
        {
            
            s=rs.getInt(1);
            tot=rs.getInt(5);
            bk=rs.getInt(6);            
            av=rs.getInt(7);                        
            if(av>0) flag=true;
            
         }
        
         //email found password match
        if(flag)
       {
                       
            out.println("  <br> Tickets available ");
            out.println("<table border='1' width=280>");
            out.println("<tr> <td>Total Seats</td>");
           out.println(" <td> "+tot+"</td> </tr> ");
           
           out.println("<tr> <td> Booked </td>");
           out.println(" <td> "+bk+"</td> </tr> ");                   
           
           out.println("<tr> <td> Available </td>");
           out.println(" <td> "+av+"</td> </tr> ");                   
           out.println("</table>");
          out.println(" <br> <a href='bookticket2.jsp?sid="+s+"'> Proceed to book </a> ");
            
            
            
        }
        else{
            out.println("  <br><br> Tickets not available ");            
            out.println(" <br><br><a href='bookticket.jsp'>Try Again</a> ");
            }
        /*
         ResultSet rs=st.executeQuery("select * from journey where src='"+a+"' and des='"+b+"' and doj='"+c+"' ");
        while(rs.next()){
                
          
           try
        {
            
        Class.forName ("com.mysql.jdbc.Driver");
        Connection con;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/destinyreacher","root","tiger");
        
        Statement st = con.createStatement();    


                 ResultSet rs=st.executeQuery("select * from journey where src='Kolkata' and des='Digha' date= '2017-10-02' ");
        while(rs.next()){
*/
                 %>
          
            
                 <table  cellpadding="15" border="1" style="background-color: #ffffcc;">
    <tr> 
        <td>  <%=rs.getInt(1) %></td>

        <td>  <%=rs.getString(2)  %></td>
        <td>  <%=rs.getString(3)      %></td>
       <td>  <%=rs.getDate(4) %></td>

        <td>  <%=rs.getString(5)  %></td>
        <td>  <%=rs.getString(6)      %></td>
       <td>  <%=rs.getString(7)      %></td>
    
    </tr>
                 </table>
        
        <%
        
}
catch(Exception e){}        
            
        
    %>
    </div>
                    
                </div>
            </div>
        
        
    </div>
         
        </center>
        <jsp:include page="footer.jsp" />
       
    </body>
</html>
