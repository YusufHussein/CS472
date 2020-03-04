<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">Beer Recommendation JSP</h1>
<p>
    <c:forEach var="item" items="${styles}">
        try:  ${item} <br>
    </c:forEach>
</p>
</body>
</html>
