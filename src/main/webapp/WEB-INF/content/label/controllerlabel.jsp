<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>控制标签</title>
</head>
<body>
	<s:set var="userAge" value="36" />
	
	<s:if test="#userAge > 60" >
		老年人
	</s:if>
	<s:elseif test="#userAge > 40">
		中年人
	</s:elseif>
	<s:else> 
		儿童
	</s:else>
	<ul>
	<s:iterator value='{"孙悟空","白骨精","唐僧"}'
		var="name">
		<li>${name}
	</s:iterator>
	</ul>
</body>
</html>
