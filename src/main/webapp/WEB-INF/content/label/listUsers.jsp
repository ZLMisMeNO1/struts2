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

   <s:label>通过s:iterator访问</s:label>
	<ul>
		<s:iterator value="listUsers">
			<li><s:property/></li>
		</s:iterator>
	</ul>
	 <s:label>通过s:action访问</s:label>
	 <s:action name="listUser" namespace="/label"></s:action>
</body>
</html>
