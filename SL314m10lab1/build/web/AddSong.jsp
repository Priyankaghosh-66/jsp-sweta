<%-- 
    Document   : AddSong
    Created on : Oct 20, 2009, 6:37:29 PM
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
        <h1>Add a song</h1>
            <form action="Controller">
                <p>Artist: <input type="text" name="artist" /></p>
                <p>Song title: <input type="text" name="song" /></p>
                <input type="submit" name="operation" value="add" />
            </form>
    </body>
</html>
