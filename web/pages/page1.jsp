<%-- 
    Document   : page1
    Created on : 17.10.2017, 22:46:54
    Author     : jvm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/css/page1.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Page1!</h1>
        <div>${info}</div>
        <br>
        <a href="controller?command=Logout">Logout</a>
        <br>
        <a href="controller?command=page1&atribut=info1">info1</a>
        <br>
        <a href="controller?command=page1&atribut=info2">info2</a>
        <br>
        <img src="resources/images/images.jpg" />
        
    </body>
</html>
