<%-- 
    Document   : check
    Created on : Dec 24, 2015, 3:34:10 PM
    Author     : KOL-FACULTY01
--%>

<%@page contentType="text/html" isELIgnored="true"errorPage="error.jsp" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <body>
          <%!int a,b,sum;%>
          <%a=Integer.parseInt(request.getParameter("a1"));
b=Integer.parseInt(request.getParameter("b1"));
sum=a+b;
out.print(sum);
response.sendRedirect("index.jsp");
%>
<p>Sum is ${sum}</p>
    </body>
</html>
