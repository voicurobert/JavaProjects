<%-- 
    Document   : index
    Created on : Apr 8, 2020, 9:14:40 PM
    Author     : robert
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Layout </h1>

        <p> <a href="index.jsp?pagina=1">Unu</a> </p>
        <p> <a href="index.jsp?pagina=2">Doi</a> </p>
        <p> <a href="index.jsp?pagina=3">Trei</a> </p>


        <c:if test="${param['pagina'] == '1'}">
            <jsp:include page="pagini/unu.jsp"/>
        </c:if>
        <c:if test="${param['pagina'] == '2'}">
            <jsp:include page="pagini/doi.jsp"/>
        </c:if>
        <c:if test="${param['pagina'] == '3'}">
            <jsp:include page="pagini/trei.jsp"/>
        </c:if>

    </body>
</html>
