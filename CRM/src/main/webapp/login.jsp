<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
    var loginError=""+'${nor}';
    if(loginError!=""){
        alert(loginError);
        
        loginError="";
        }
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
 <style>
    #div1 {
       position: relative;
       top: 200px;
       left: 500px;
        height: 250px;
        width: 300px;
        border: 2px solid black;
        
    }
    </style>
</head>
<body>
   <p></p>
   <div id="div1">
   <img alt="" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1544419241703&di=12bae2b028832e6904f6a147eec3ae1e&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2F342ac65c10385343608c0e1a9813b07eca80884e.jpg" style="height: 140px;width: 300px">
   <s:form  action="Loginaction" method="post">
     <s:textfield name="username" label="账号" placeholder="用户名"></s:textfield>
     <s:password name="password" label="密码" placeholder="密码"></s:password>
     <s:submit value="登录"/>
   </s:form>
   </div>
</body>
</html>