<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>自定义类型转换器</title>
</head>
<body>
<script type="text/javascript" src="${pageContext.request.contextPath }/jquery-1.10.1.js"></script>
<script type="text/javascript">
	function validateName(value) {
		$("#result").load("validateName",{userName:value});
	}
</script>
	<div id="result"></div>
	<s:form action="registPro" >
		<s:textfield name="user.name" label="用户名" onblur="validateName(this.value);"/>
		<s:textfield name="user.pass" label="密码"/>
		<s:textfield name="user.height" label="身高"/>
		<s:textfield name="user.weight" label="体重"/>
		<s:textfield name="user.birth" label="生日"/>
		<s:submit value="提交"/>
	</s:form>
</body>
</html>
