<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
<h1>注册页面</h1>
<form action="user/registPro" method="post">
	用户名：<input type="text" name="user.name"/>
	密码：<input type="text" name="user.pass"/>
	体重：<input type="text" name="user.weight"/>
	生日：<input type="text" name="user.birth"/>
	<input type="submit" value="注册"/>
</form>
</body>
</html>