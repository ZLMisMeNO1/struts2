<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看书籍</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/jquery-1.10.1.js"></script>
<script type="text/javascript">
	var listByCates = function(ele){
		$.post("listBooksByCate",{cate:$(ele).val()},function(data){
			var sli = "";
			$.each(data.bookList,function(n,v){
				sli += '<tr><td>'+v.id+'</td><td>'+v.bookName+'</td><td>'+v.author+'</td><td>'+v.price+'</td></tr>';
			})
			$('#show').empty().append(sli);
		},"json")
	}
</script>
</head>
<body>
<s:action name="listCates" var="listCates"/>
请选择图书：
<s:select theme="simple" list="#listCates.cates"
	onchange="listByCates(this)"
 ></s:select>
<table width="500" border="1">
	<tr>
		<th>id</th>
		<th>名</th>
		<th>作者</th>
		<th>价格</th>
	</tr>
	<tbody  id="show">
	
	</tbody>
</table>
</body>
</html>
