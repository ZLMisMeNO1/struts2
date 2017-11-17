<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>控制标签</title>
<s:head />
</head>
<body>
	<s:form action=""> 
		<s:textfield name="user" label="用户名" />
		<s:password name="pass" label="密码"/>
		<s:file name="image" label="上传头像"/>
		<s:textarea cols="8" rows="3"></s:textarea>
		<s:checkbox name="男" label="是否已婚"/>
	</s:form>
	<s:set value="{'小学','初中','高中','大学','硕士','博士'}" var="xueli" />
	<s:set value="{'小学','初中','高中','大学','硕士','博士'}" var="xueli2" />
	<s:checkboxlist list="#xueli" name="xueli" label="学历"></s:checkboxlist>
	<br>
	<s:select list="#xueli" label="学历2" title="硕士" headerValue="硕士">
	
		<%-- <s:optgroup list="#xueli" label="再次选择"
		></s:optgroup> --%>
	</s:select>
	<br>
	<s:radio list="#xueli" name="xu" label="学历3"/>
	<s:debug/>
	<s:combobox list="#xueli" name="b"></s:combobox>
	<br>
	<s:doubleselect doubleList="#xueli" list="#xueli" doubleName=""></s:doubleselect>
</body>
</html>
