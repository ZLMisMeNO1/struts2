<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>s:date标签</title>
</head>
<body>
	<s:bean var="now" name="java.util.Date"/>
		<s:property value="#now"/>
		<br>
		<s:date name="#now" format="yyyy年MM月dd日 HH:mm:ss a"  />
		<%
			java.util.Date ago = new java.util.Date();
			ago.setDate(1);
			request.setAttribute("ago", ago);
		%>
		<br>
		<s:date name="#request.ago"  nice="true"  />
	<s:debug/>
</body>
</html>
