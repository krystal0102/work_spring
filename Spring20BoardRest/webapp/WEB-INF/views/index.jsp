<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head><title><spring:message code="homepage" /></title></head>
<body>
	<h1><spring:message code="homepage" /></h1>
	<a href="<c:url value='/board/board-list.do'/>"><spring:message code="board-list" /></a>
	<a href="<c:url value='/admin/users-list.do'/>"><spring:message code="users-list" /></a>
	<sec:authorize access="!hasRole('ADMIN') and !hasRole('USER')">
		<a href="<c:url value='/join.do'/>"><spring:message code="join" /></a>
		<a href="<c:url value='/login.do'/>"><spring:message code="login" /></a>
	</sec:authorize>
	<sec:authorize access="hasRole('ADMIN') or hasRole('USER')">
		<a href="<c:url value='/users-modify.do'/>"><spring:message code="users-modify" /></a>
		<a href="<c:url value='/logout.do'/>"><spring:message code="logout" /></a>
	</sec:authorize>
	
	<br>
	<br>
	 <a href="index.do?lang=ko"><spring:message code="label.ko"/></a>
  	 <a href="index.do?lang=en"><spring:message code="label.en"/></a>
  	 <br>
  	 <br>
  	 <div>현재 언어 : ${ pageContext.response.locale }</div>
</body>
</html>