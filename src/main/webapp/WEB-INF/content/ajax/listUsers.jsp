<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列出所有用户</title>
</head>
<body>
 <table width="600" border="1">
 	<tr>
 		<td>用户名</td>
 		<td>密码</td>
 		<td>身高</td>
 		<td>体重</td>
 		<td>生日</td>
 		
 	</tr>
 	<s:iterator value="ulist" var="u">
 	<tr>
 		<td>${u.name}</td>
 		<td>${u.pass}</td>
 		<td>${u.height}</td>
 		<td>${u.weight}</td>
 		<td>${u.birth}</td>
 	</tr>
 	</s:iterator>
 </table>
</body>
</html>