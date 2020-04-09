<%-- 
    Document   : index
    Created on : Apr 8, 2020, 7:13:59 PM
    Author     : robert
--%>

<%@page import="service.RegisterService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register</h1>
        <form method="post">
            <p>
                Username:<input type="text" name="username"/>
                password<input type="password" name="password"/>
                <input type="submit" value="Register"/>
            </p>
        </form>

        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username != null && password != null) {
                boolean res = RegisterService.getInstance().regiserUser(username, password);
                if (res) {
                    out.println("Userul a fost adaugat!");
                } else {
                    out.print("Userul exista deja!");
                }
            }
        %>
    </body>
</html>
