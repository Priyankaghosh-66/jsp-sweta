

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="Mta-INF/lib/javax.servlet.jsp.jstl.core.jar" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% ArrayList<String> a=new ArrayList<String>(); 
        a.add("Abc");
        a.add("def");
        a.add("skjk");
        request.setAttribute("plist", a);
        %>
    <c:foreach items="$plist" var="item">
        <p>$item</p>
    </c:foreach>
        <h1>Hello World!</h1>
    </body>
</html>
