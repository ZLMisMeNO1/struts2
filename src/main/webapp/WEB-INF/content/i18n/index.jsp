<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<s:i18n name="i18n/i18nForm">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="i18nTitle"/></title>
</head>
<body>
	<!--  
		1.更简单
		2.自动支持2列布局
		3.自动输出类型转换失败，输入校验失败的错误提示信息。
	 -->
	<s:form action="i18nPro">
		<s:textfield name="name" key="name"/>
		<s:password name="pass" key="pass"/>
		<s:submit key="submitBtn"/>
	</s:form>
</body>
</html>
</s:i18n>