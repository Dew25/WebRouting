<%-- 
    Document   : error
    Created on : 23.10.2017, 20:32:10
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
        <h1>Error page!</h1>
        ${pageContext.session.getAttribute("nullPage")}
        
    </body>
</html>
