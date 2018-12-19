<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发布公告</title>
<style type="text/css">
table.tftable {
	font-size: 12px;
	color: #333333;
	width: 100%;
	border-width: 1px;
	border-color: #729ea5;
	border-collapse: collapse;
}

table.tftable th {
	font-size: 12px;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #729ea5;
	text-align: left;
}

table.tftable tr {
	background-color: #d4e3e5;
}

table.tftable td {
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
			<h3 style="position: relative; left: 120px;">发布公告</h3>
		</div>
		<div class="clearfix visible-xs-block"></div>
	</div>
	<div class="row">
		<div class="col-xs-6 col-sm-1"></div>
		<div class="col-xs-6 col-sm-10">
			<form action="noticeAdd" method="post">


				<table id="tfhover" class="tftable" border="1">
					<tr>
						<th style="width: 200px;">发布时间</th>
						<th><input type="date" placeholder="发布时间" name="pubTime" ></th>
						<th style="width: 200px;">截止时间</th>
						<th><input type="date" placeholder="截止时间" name="expireTime"></th>
					</tr>
					<tr>
						<td>主题</td>
						<td><input type="text" placeholder="主题" name="n.subject"></td>
						<td>通知范围</td>
						<td><select style="width: 50px;height: 25px" name="n.receiveId">
								<option value="0">全部</option>
								<option>部门</option>
								<option>员工</option>
						</select></td>
					</tr>
					<tr>
						<td style="height: 300px; font-size: 36px;">公告内容</td>
						<td colspan="3"><input type="text" placeholder="内容描述" size="100%" name="n.text"
							style="height: 300px; width: 100%"></td>

					</tr>
				</table>
				<br>
 
				<div style="text-align: center;">
					<input class="btn btn-success" type="submit" value="添加">
					&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type="button" class="btn btn-info" onclick="javascript:window.history.back(-1);"
						value="返回">
				</div>
			</form>
		</div>
		<div class="col-xs-6 col-sm-1"></div>
		<div class="clearfix visible-xs-block"></div>
	</div>
</body>
<script type="text/javascript" src="static/JS/jquery.min.js"></script>
<!-- 栅格系统引入 -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</html>