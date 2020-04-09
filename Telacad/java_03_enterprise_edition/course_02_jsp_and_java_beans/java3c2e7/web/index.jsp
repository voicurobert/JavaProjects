<%-- 
    Document   : index
    Created on : Apr 9, 2020, 9:05:11 AM
    Author     : robert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <%
        String color = "white";
        if (request.getParameter("color") != null) {
            color = request.getParameter("color");
            Cookie cookie = new Cookie("color", color);
            
            response.addCookie(cookie);
        } else {
            if (request.getCookies() != null) {
                for (Cookie cookie : request.getCookies()) {
                    if (cookie.getName().equals("color")) {
                        color = cookie.getValue();
                    }
                }
            }

        }
    %>

    <body style="background-color: <%= color%>">
        <p> <a href="index.jsp?color=red">Red</a> </p>
        <p> <a href="index.jsp?color=green">Green</a> </p>
        <p> <a href="index.jsp?color=blue">Blue</a> </p>
    </body>
</html>
