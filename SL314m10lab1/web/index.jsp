<%-- 
    Document   : index
    Created on : Oct 20, 2009, 3:32:22 PM
    Author     : Simon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
            <form action="Controller">
                <input type="submit" name="operation" value="list" />
            </form>
            <form action="AddSong.jsp">
                <input type="submit" value="Add" />
            </form>
    </body>
</html>
