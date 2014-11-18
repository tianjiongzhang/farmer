<%@ page language="java"%>
<%@ page contentType="text/html;charset=utf-8"%>
<%@ page pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>error</title>
	</head>
	<body>
		<c:set value="${exception}" var="ee" />
		<jsp:useBean id="ee" type="java.lang.Exception" />

		<%=ee.getMessage()%>
		<%
		    ee.printStackTrace(new java.io.PrintWriter(out));
		%>
	</body>
</html>






