<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户的登录</title>
</head>
<body>
<h1>用户登录</h1>

<form action="dmi/DMIAction!login" method="post">
	用户名：<input type="text" name="user.name"/>
	密码：<input type="password" name="user.pass"/>
	<input type="submit" value="登录">
</form>
</body>
</html>