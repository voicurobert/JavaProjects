<%-- 
    Document   : index
    Created on : Apr 8, 2020, 6:16:03 PM
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
        <h1>

            <%
                for (int i = 1; i <= 100; i++) {
            %>
            <p>
                <%
                    out.println(i);
                %>
            </p>
            <%
                }
            %>

        </h1>
    </body>
</html>
