<%-- 
    Document   : index
    Created on : 17.10.2017, 22:47:31
    Author     : jvm
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
        <div>${info}</div>
        <a href="controller?command=login">login</a><br>
        <a href="controller?command=logout">logout</a><br>
        <a href="controller?command=page1">page1</a><br>
        <a href="controller?command=page2">page2</a>
    </body>
</html>
