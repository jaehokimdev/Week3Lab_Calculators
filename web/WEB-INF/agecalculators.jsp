<%-- 
    Document   : agecalculators
    Created on : Sep 20, 2022, 8:22:58 PM
    Author     : Joe Kim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
        Enter your age: <input type="text" name="age"><br>
        <input type="submit" value="Age next birthday">
        </form>
        ${message}<br>
        Arithmetic Calculator
    </body>
</html>
