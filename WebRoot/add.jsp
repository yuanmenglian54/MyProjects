<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html>
<html>
  <head>
    <title>My JSP 'add.jsp' starting page</title>
	<!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="<%=path %>/resources/bs/css/bootstrap.min.css">
    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="<%=path %>/resources/bs/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="<%=path %>/resources/bs/js/jquery-3.1.0.js"></script>
    <script type="text/javascript" src="<%=path %>/resources/bs/js/bootstrap.min.js"></script>
  </head>
  
  <body>
   <div style="margin:30px 0 0 550px">
  	<ul class="nav nav-pills">
	  <li><a href="http://localhost:8080/Account/queryAccounts.action">首页</a>
	  </li>
	  	<li  class="active"><a href="#">添加</a></li>
	  	<li><a href="#">查询</a></li>
	</ul>
  </div>
	<hr style="width:700px"/>
  <div style="margin:30px 0 0 400px">
  <form action="<%=path%>/queryAccounts.action" method="post">
	<div class="input-group input-group-lg">
	  <span class="input-group-addon" style="width:150px">编码</span>
	  <input type="text" class="form-control" placeholder="Coding" name="comCode" style="width:300px">
   </div>
   <div class="input-group input-group-lg">
	  <span class="input-group-addon" style="width:150px">名称</span>
	  <input type="text" class="form-control" placeholder="Username" name="cname" style="width:300px">
   </div>
   <div class="input-group input-group-lg">
	  <span class="input-group-addon" style="width:150px">创建时间</span>
	  <input type="text" class="form-control" placeholder="createTime" name="createTime" style="width:300px">
   </div>
   <div class="input-group input-group-lg">
	  <span class="input-group-addon" style="width:150px">最后登录时间</span>
	  <input type="text" class="form-control" placeholder="loginTime" name="lastLoginTime" style="width:300px">
   </div>
   <div class="input-group input-group-lg">
	  <span class="input-group-addon" style="width:150px">账号类型</span>
	  <input type="text" class="form-control" placeholder="Type" name="accountType" style="width:300px">
   </div>
   <div class="input-group input-group-lg">
	  <span class="input-group-addon" style="width:150px">状态</span>
	  <input type="text" class="form-control" placeholder="Status" name="state" style="width:300px">
   </div>
   <div class="input-group input-group-lg" style="float:left">
	  <span class="input-group-addon" style="width:150px">备注</span>
	  <input type="text" class="form-control" placeholder="Remark" name="remark" style="width:300px">
   </div>
    <div class="btn-group">
    <button type="button" class="btn btn-default" style="width:70px;left:10px;top:2px;height:45px">添加</button>
  </div>
 </form>
 </div>
  </body>
</html>
