<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎</title>
</head>
<body>
<h1>欢迎登录${session.userId},${applicationScope.userName }</h1>
<h2>cookie : ${cookie.userAge.value}</h2>
<a href="${pageContext.request.contextPath}/user/viewUsers">列出所有用户</a>
</body>
</html>