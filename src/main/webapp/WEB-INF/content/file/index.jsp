<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
</head>
<body>
	<s:actionmessage/>
	<s:form action="addPicPro" enctype="multipart/form-data" method="POST">
		<s:fielderror name="file"></s:fielderror>
		<s:file name="pict" label="选择文件" />
		<s:submit value="提交" />
	</s:form>
</body>
</html>
