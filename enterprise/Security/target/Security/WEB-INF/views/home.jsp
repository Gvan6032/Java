<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<body>
<h2>Information about spring security</h2>
<c:url value="/logout" var="logoutUrl"/>
<form id="logout" action="${logoutUrl}" method ="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
<c:if test="${pageContext.request.userPrincipal.name!=null}">
    <a href="javascript:document.getElementById('logout').submit()">Logout</a>
</c:if>
<security:authorize access="isAuthenticated()">
    DFDF546FD!!hh54
</security:authorize>
</body>
</html>
