<%--
    Document   : index
    Created on : Apr 9, 2020, 8:01:23 AM
    Author     : robert
--%>

<%@page import="service.LoginService"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            boolean logged = false;
            if (username != null && password != null) {
                logged = LoginService.getInstance().login(username, password);
                session.setAttribute("logged", String.valueOf(logged));
            } else {
                if (session.getAttribute("logged") != null) {
                    logged = session.getAttribute("logged").toString().equals("true");
                }

            }

            if (request.getParameter("logout") != null) {
                session.setAttribute("logged", null);
                logged = false;
                response.sendRedirect("index.jsp");
            }

            if (logged) {
        %>
        <jsp:include page="pagini/main.jsp"/>
        <%
        } else {
        %>
        <jsp:include page="pagini/formular.jsp"/>
        <%
            }
        %>

    </body>
</html>
