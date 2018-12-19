<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户视图</title>
<style type="text/css">
.tftable {
	font-size: 12px;
	color: #333333;
	width: 100%;
	border-width: 1px;
	border-color: #729ea5;
	border-collapse: collapse;
}

.tftable th {
	font-size: 12px;
	background-color: #acc8cc;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #729ea5;
	text-align: left;
}

.tftable tr {
	background-color: #ffffff;
}

.tftable td {
	font-size: 12px;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #729ea5;
}
</style>
</head>
<body>
	<div class="row">
		<div class="col-xs-6 col-sm-12">
			<h3 style="position: relative; left: 120px;">用户列表</h3>
		</div>
		<div class="clearfix visible-xs-block"></div>
	</div>
	<div class="row">
		<div class="col-xs-6 col-sm-9">
			<div style="position: relative; left: 120px;">
				<form action="userSearch" method="post">
					搜索内容：<input type="text" id="input01" name="usercontext"> 用户名：<select
						style="" name="usertype">
						<option value="username">用户名</option>
						<option value="roleId">角色</option>
						<option value="departmentId">部门</option>
						<option value="email">邮箱</option>
						<option value="mobile">手机号</option>
					</select> &nbsp;&nbsp;&nbsp; <input type="submit" value="搜索" class="btn btn-default">
				</form>
			</div>
		</div>
		<div class="col-xs-6 col-sm-3">
			<a class="btn btn-primary" href="userAdd.jsp" role="button">添加用户</a>
		</div>
		<div class="clearfix visible-xs-block"></div>
	</div>
    <div class="row"><div class="clearfix visible-xs-block"></div>
		<div class="col-xs-6 col-sm-12" style="height: 10px;"></div> </div>
	<div class="row">
		<div class="clearfix visible-xs-block"></div>
		<div class="col-xs-6 col-sm-1"></div>
		<div class="col-xs-6 col-sm-10">
			<table class="tftable" border="1">
				<tr>
					<th>序号</th>
					<th>用户名</th>
					<th>部门</th>
					<th>角色</th>
					<th>手机号</th>
					<th>邮箱</th>
					<th>更新时间</th>
					<th>操作</th>
				</tr>
				<s:iterator value="#list">
				<tr>
					<td> <s:property value="userId"/> </td>
					<td><s:property value="username"/> </td>
					<td><s:property value="departmentId"/> </td>
					<td><s:property value="roleId"/> </td>
					<td><s:property value="mobile"/> </td>
					<td><s:property value="email"/> </td>
					<td><s:property value="updateTime"/> </td>
					<td><a style="position: relative;left: 20px;" href="userUpdateReady?u.userId=<s:property value="userId"/>"><span class="glyphicon glyphicon-pushpin" style="color:blue;font-size:25px;"></span></a>
					<a style="position: relative;left: 50px;" href="userDelete?u.userId=<s:property value="userId"/>"><span class="glyphicon glyphicon-remove" style="color:red;font-size:25px;"></span></a></td>
				</tr>
				</s:iterator>
			</table>
		</div>
		<div class="col-xs-6 col-sm-1"></div>
	</div>
</body>
<script type="text/javascript" src="static/JS/jquery.min.js"></script>
<!-- 栅格系统引入 -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</html>