<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>智游客户关系管理系统</title>
<link rel="stylesheet" href="static/layui/css/layui.css">
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">智游客户关系管理系统</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item"><a href="#">工作台</a></li>
				<li class="layui-nav-item"><a href="#">报表</a></li>
				<li class="layui-nav-item"><a href="#">客户信息</a></li>
				<li class="layui-nav-item"><a href="#">员工信息</a></li>
				<li class="layui-nav-item"><a href="#">公告信息</a></li>
				<li class="layui-nav-item"><a href="#">发件箱</a></li>
			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1544456382035&di=4831582c75ed4a475c1545bcf890f129&imgtype=0&src=http%3A%2F%2Fqq.5068.com%2Fuploads%2Fallimg%2F140616%2F11540G018-9.png"
						class="layui-nav-img">Admin
				</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="#">基本资料</a>
						</dd>
						<dd>
							<a href="#">安全设置</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="expect">退出</a></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item layui-nav-itemed"><a class=""
						href="javascript:;">管理员</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="noticeView" target="iframe_a">公告管理</a>
							</dd>
							<dd>
								<a href="departmentView" target="iframe_a">部门管理</a>
							</dd>
							<dd>
								<a href="roleView" target="iframe_a">角色管理</a>
							</dd>
							<dd>
								<a href="userView" target="iframe_a">用户管理</a>

							</dd>
						</dl></li>

					<li class="layui-nav-item"><a href="messageView" target="iframe_a">站内邮件</a></li>
					<li class="layui-nav-item"><a href="#">客户管理</a></li>
					<li class="layui-nav-item"><a href="#">内部信息</a></li>
				</ul>
			</div>
		</div>

		<div class="layui-body">
			<!-- 内容主体区域 -->
			<iframe name="iframe_a" style="height: 100%; width: 100%;"></iframe>

		</div>


	</div>
	
	<script src="static/layui/layui.js"></script>
	<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var element = layui.element;

		});
	</script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
<script type="text/javascript">
    var loginError=""+'${nor}';
    if(loginError!=""){
        alert(loginError);
        
        loginError="";
        }
</script>

</html>