<%-- 
    Document   : jsp1
    Created on : Dec 24, 2015, 4:41:09 PM
    Author     : KOL-FACULTY01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%out.println(config.getInitParameter("name"));%>
    </body>
</html>
