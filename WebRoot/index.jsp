<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html>
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="<%=path %>/resources/bs/css/bootstrap.min.css">
    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="<%=path %>/resources/bs/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="<%=path %>/resources/bs/js/jquery-3.1.0.js"></script>
    <script type="text/javascript" src="<%=path %>/resources/bs/js/bootstrap.min.js"></script>
  </head>
  <body>
   <div style="margin:30px 0 0 200px">
	<ul class="nav nav-pills">
	    <li class="active"><a href="#">首页</a></li>
	  	<li><a href="add.jsp">添加</a></li>
	  	<li><a href="#">查询</a></li>
	</ul>
   </div>
   <div>
  	<table class="table table-hover" style="width:1200px;margin:auto">
  	  <caption><h1><span style="margin-left:500px">账户管理</span></h1></caption>
  	  <thead>
       <tr class="success">
	     <th>编码</th>
		 <th>名称</th>
		 <th>创建时间</th>
		 <th>最后登录时间</th>
		 <th>账号类型</th>
		 <th>状态</th>
		 <th>备注</th>
		 <th>操作</th>
	   </tr>
	 </thead>
	 <tbody>
	 <c:forEach items="${accountList }" var="item" varStatus="index">
	   <tr>
	     <td>${item.comCode}</td>
		 <td>${item.cname}</td>
		 <td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
		 <td><fmt:formatDate value="${item.lastLoginTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
		 <td>${item.accountType}</td>
		 <td>${item.state}</td>
		 <td>${item.remark}</td>
		 <td>
		 <div class="btn-group">
		     <button type="button" class="btn btn-default">修改</button>
		     <button type="button" class="btn btn-default">删除</button>
         </div>
       </td>
	   </tr>
	   </c:forEach>
	 </tbody>
	</table>
  </div>
  <div align="center">
  <nav>
  <ul class="pagination pagination-lg">
    <li class="disabled"><a href="#">&laquo;</a></li>
    <li class="active"><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">&raquo;</a></li>
  </ul>
</nav>
</div>
  </body>
</html>
