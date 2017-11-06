<%@page contentType="text/html" isELIgnored="false" pageEncoding="UTF-8"%>
<%@include  file="header.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page using include</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <p>Including Header and Footer jsp page using jsp:include </p>
        
        <jsp:include page="Footer.jsp">
            <jsp:param name="a" value="Hello"></jsp:param>
        </jsp:include>
    </body>
</html>
