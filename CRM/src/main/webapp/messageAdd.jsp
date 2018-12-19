<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>邮件发送</title>
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
			<h3 style="position: relative; left: 120px;">邮件发送</h3>
		</div>
		<div class="clearfix visible-xs-block"></div>
	</div>
	<div class="row">
		<div class="col-xs-6 col-sm-1"></div>
		<div class="col-xs-6 col-sm-10">
			<form action="noticeAdd" method="post">


				<table id="tfhover" class="tftable" border="1">
					<tr>
						<th>主题</th>
						<th><input type="text"></th>
					</tr>
					<tr>
						<td>发件人</td>
						<td><input type="text" readonly  unselectable="on" ></td>
					</tr>
					<tr>
						<td>收件人</td>
						<td><input type="text"></td>
					</tr>
					<tr>
						<td colspan="2" style="text-align: center;">内容</td>
						
					</tr>
					
					<tr>
						<td colspan="2"><input type="text" size="100%" style="height: 130px; width: 100%"></td>
						
					</tr>
				</table>
				<br>

				<div style="text-align: center;">
					<input class="btn btn-success" type="submit" value="发送">
					&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type="button"
						class="btn btn-info" onclick="javascript:window.history.back(-1);"
						value="取消">
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