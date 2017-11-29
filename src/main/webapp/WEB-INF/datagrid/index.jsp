<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<link href="${pageContext.request.contextPath}/easyui/themes/bootstrap/easyui.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-1.10.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/js/easyui-lang-zh_CN.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/datagrid2excel.js"></script>
<style type="text/css">
	html,body{
		width:100%;
		height:100%;
	}
</style>
<title>列出所有用户</title>
 <script language="JavaScript" type="text/javascript">  
		 $(function(){
				var datac = [];
		      $.ajax({
		          url: '../json/listAllBook',
		//          async : false,
		          success : function(data){
		              console.log(data)
		              datac = data.bookList;
		              var settings = {
		                      data : datac,
		                      scrollbarSize : 5,
		                      singleSelect : false,
		                      columns : [ [ {
		                          field : 'author',
		                          title : '作者',
		                          width : 100
		                      }, {
		                          field : 'bookName',
		                          title : 'shuming',
		                          width : 100,
		                          hidden : true
		                      }, {
		                          field : 'id',
		                          title : '最大夜间流量占比',
		                          width : 100,
		                          sortable : true,
		                          formatter : function(value,row,index){
		                              if(value != '') {
		                                  return value + '%';
		                              } 
		                              return '';
		                          }
		                      }, {
		                          field : 'price',
		                          title : '最小夜间流量占比时间',
		                          width : 100,
		                          formatter : function(value,row,index){
		                              return '<span style="background-color:red;">' + value + '</span>';
		                          }
		                      }] ]
		                  };
		                  /* 初始化datagrid */
		                  var optionSet = {
		                      striped : true,
		                      fitColumns : true,
		//                      rownumbers : true,
		                      // singleSelect: true,
		                      loadMsg : '加载中...',
		                      pagination : false,
		                      remoteSort : false,
		                      scrollbarSize : 6,
		                      fit : true
		                  }
		                  var option = $.extend({}, optionSet, settings);
		                  $('#myDiv').datagrid(option);
		          }
		      });
		      $("#btnExport").click(function () {  
	                $("#parentId").table2excel({  
	                    filename : "你想说啥" + new Date().getTime() , //文件名称  
	                    exclude_img: true,  
	                    exclude_links: true,  
	                    exclude_inputs: true  
	  
	                });  
	            });  
		})
    </script> 
</head>
<body>
<div class="container">
<div class="row" id="parentId">
	<table  style="height:90%;width:100%;" class="abc" id="myDiv"></table >
</div></div>
<button id="datagrid_header">获取header</button>
<button id="datagrid_body">获取body</button>
   <button type="button" id="btnExport" >导出Excel</button>  
</body>
</html>