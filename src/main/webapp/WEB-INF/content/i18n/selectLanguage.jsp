<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<!-- s:bean : 根据类名创建一个对象 ,var 起的名字 ,name 类名-->
<s:bean var="huitailang" name="cn.osbullshit.struts2.i18n.language.Locales"/>
<!-- select标签会自动生成一个下拉列表框  
	每个key-value对生成一个option
	21:57
-->
<%-- <s:debug /> --%>
<!-- 列出所有程序所支持的语言 -->
<s:select list="#huitailang.locales" 
	listKey="value"
	listValue="key"
/>