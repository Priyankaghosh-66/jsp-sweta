<%-- 
    Document   : AddStudent
    Created on : Oct 28, 2017, 2:01:47 PM
    Author     : KOL-FACULTY01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee</title>
    </head>
    <body>
        <div id="add">
        <h1> Add Emp </h1>
        <form action="EmployeeController" method="GET">
            <table>
                <tr>
                    <td> Employee Name: </td>
                    <td><input type="text" name="ename"></td>
                </tr>
                <tr>
                    <td> Employee Number: </td>
                    <td><input type="text" name="enumber"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="addEmployee" value="Add"></td>
                    
                </tr>
            </table>
        </form>
        </div>
        <form action="EmployeeController" method="POST">
            <input type="submit" name="showEmployee" value="Show"> &nbsp; &nbsp;<br>
            
            
        </form>
    </body>
</html>