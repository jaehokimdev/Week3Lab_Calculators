<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 21, 2022, 6:44:52 PM
    Author     : Joe Kim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
        Second: <input type="text" name="second" value="${second}"><br>
        <input type="submit" name="operation" value="+">
        <input type="submit" name="operation" value="-">
        <input type="submit" name="operation" value="*">
        <input type="submit" name="operation" value="%"><br><br>
        </form>
        Result: ${result}<br>
        <A href="/Week3Lab_Calculators/age">Age Calculator</A>
    </body>
</html>
