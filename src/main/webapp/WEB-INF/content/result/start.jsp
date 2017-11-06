<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>起始表单</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/result/end" 
		method="post">
			请输入参数:<input type="text" name="result" />
			<input type="submit" value="提交"/>
		</form>
</body>
</html>