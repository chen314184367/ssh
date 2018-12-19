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
<title>用户编辑</title>
<!-- Row Highlight Javascript -->

<style type="text/css">
table.tftable {
	font-size: 12px;
	color: #333333;
	width: 100%;
	border-width: 1px;
	border-color: #ebab3a;
	border-collapse: collapse;
}

table.tftable th {
	font-size: 12px;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #ebab3a;
}

table.tftable tr {
	background-color: #ffffff;
}

table.tftable td {
	font-size: 12px;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #ebab3a;
}
</style>
</head>
<body>
	<div class="row">
		<div class="col-xs-6 col-sm-12">
			<h3 style="position: relative; left: 120px;">用户编辑</h3>
		</div>
		<div class="clearfix visible-xs-block"></div>
	</div>
	<div class="row">
		<div class="col-xs-6 col-sm-1"></div>
		<div class="col-xs-6 col-sm-10">
		<s:form action="userUpdate" method="post">

				<table id="tfhover" class="tftable" border="1">
					<tr>
						<th style="width: 100px;">用户名</th>
						<th style="width: 400px;"><input type="text" name="u.username" value="${us.username }"
							placeholder="用户名"></th>
						<th style="width: 100px;">密码</th>
						<th style="width: 400px;"><input type="password" name="u.password" value="${us.password }"
							placeholder="密码"></th>

					</tr>
					<tr>
						<td>部门</td>
						<td><select style="width: 50px; height: 25px" name="u.departmentId" >
								<option value="1">1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
						</select></td>
						<td>角色</td>
						<td><select style="width: 50px; height: 25px" name="u.roleId">
								<option value="1">1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
						</select></td>

					</tr>
					<tr>
						<td>性别</td>
						<td style="font-size: 20px;">&nbsp;男<input type="radio"
							value="ture" name="u.isMale"> &nbsp;&nbsp;&nbsp; 女<input
							type="radio" value="false" name="u.isMale">
						</td>
						<td>手机号</td>
						<td><input type="text" placeholder="手机号" name="u.mobile" value="${us.mobile }"></td>
					</tr>
					<tr>
						<td>地址</td>
						<td><input type="text" placeholder="地址" name="u.address" value="${us.address }"></td>
						<td>年龄</td>
						<td><input type="text" placeholder="年龄" name="u.age" value="${us.age }"></td>
					</tr>
					<tr>
						<td>固定电话</td>
						<td><input type="text" placeholder="固定电话" name="u.tel" value="${us.tel }"></td>
						<td>身份证号</td>
						<td><input type="text" placeholder="身份证号码" name="u.idNum" value="${us.idNum }"></td>
					</tr>
					<tr>
						<td>电子邮箱</td>
						<td><input type="text" placeholder="电子邮箱" name="u.email" value="${us.email }"></td>
						<td>婚姻状况</td>
						<td><select style="width: 50px; height: 25px" name="u.marry" >
								<option value="1">离异</option>
								<option>已婚</option>
								<option>未婚</option>
						</select></td>
					</tr>
					<tr>
						<td>爱好</td>
						<td><input type="text" placeholder="爱好" name="u.hobby" value="${us.hobby }"></td>
						<td>学历</td>
						<td><select style="width: 50px; height: 25px" name="u.education">
								<option value="1">1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
						</select></td>
					</tr>
					<tr>
						<td>工资卡号</td>
						<td><input type="text" placeholder="工资卡号" name="u.cardNum" value="${us.cardNum }"></td>
						<td>民族</td>
						<td><input type="text" placeholder="民族" name="u.nation" value="${us.nation }"></td>
					</tr>
				

					<tr>
						<td style="height: 130px; font-size: 36px">备注</td>
						<td colspan="3"><input type="text" placeholder="备注" name="u.remark" value="${us.remark }"
							size="100%" style="height: 130px; width: 100%"></td>

					</tr>
				</table>
				<br>
                          <input type="hidden" name="u.userId" value="${us.userId }">
				<div style="text-align: center;">
					<input class="btn btn-success" type="submit" value="保存">
					&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type="button" class="btn btn-info" onclick="javascript:window.history.back(-1);"
						value="返回">
				</div>

			</s:form>

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
