<%-- 
    Document   : ListSongs
    Created on : Oct 20, 2009, 6:05:43 PM
    Author     : Simon
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Song List</title>
    </head>
    <body>
        <h1>Songs in the catalog</h1>
        <ul>
        <c:forEach var="row" items="${songList}" >
            <li>${row.songTitle} by ${row.artist}</li>
        </c:forEach>
        </ul>
        <form action="Controller">
            <input type="submit" name="operation" value="list" />
        </form>
    </body>
</html>
