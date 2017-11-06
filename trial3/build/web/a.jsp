<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <java:usebean id="mybean" class="pck.Modelc" scope="session">
        <jsp:setProperty name="mybean" property="name" value="james Curl"></jsp:setProperty>
        
    </java:usebean>
        <%--${mybean.name}--%>
        <%=mybean.name%>;
    </body>
</html>
