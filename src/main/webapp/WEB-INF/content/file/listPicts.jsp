<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有文件</title>
</head>
<body>
	<h1>所有文件</h1>
	<s:select list="picts" 
	listValue="fileName"
	listKey="newFileName"
	label="所有图片"
	onchange="document.getElementById('show').src = '../upload/' + this.value;"></s:select>
	
	<img alt="暂无图片" id="show" />
</body>
</html>
