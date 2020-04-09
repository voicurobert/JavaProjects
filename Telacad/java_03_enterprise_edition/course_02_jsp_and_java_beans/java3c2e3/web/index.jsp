<%-- 
    Document   : index
    Created on : Apr 8, 2020, 7:06:25 PM
    Author     : robert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post">
            <p>
                Nume:<input type="text" name="nume"/>
                <input type="submit" value="Salut"/>
            </p>
            <%
                if (request.getParameter("nume") != null) {
                    out.println("Salut, " + request.getParameter("nume"));
                }
            %>
        </form>
    </body>
</html>
