<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>智慧门禁 - 登录</title>
<meta name="keywords" content="智慧门禁，简单生活">
<meta name="description" content="智慧门禁采用人脸识别技术，简单你的生活">

<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
<link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">

<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css?v=4.1.0" rel="stylesheet">
<!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
<script>
	if (window.top !== window.self) {
		window.top.location = window.location;
	}
</script>
</head>

<body class="gray-bg mybg">

	<div class="middle-box text-center loginscreen  animated fadeInDown">
		<div>
			<div>

				<h1 class="logo-name">D+</h1>

			</div>
			<h3>欢迎使用 FaceAC后台管理系统</h3>

			<form class="m-t" role="form" action="servlet/LoginServlet?"
				method="post">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="用户名"
						required="" name="username">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="密码"
						required="" name="password">
				</div>
				<input type="submit" value="登录" id="sub_btn"
					class="btn btn-primary block full-width m-b" />


				<p class="text-muted text-center">
					<a href="login.jsp#"><small>忘记密码了？</small></a> | <a
						href="register.jsp">注册一个新账号</a>
				</p>
				<span style="color:#F00" class="errorMsg"><%=request.getAttribute("msg") == null ? "" : request
					.getAttribute("msg")%></span>

			</form>
		</div>
	</div>

	<!-- 全局js -->
	<script src="js/jquery.min.js?v=2.1.4"></script>
	<script src="js/bootstrap.min.js?v=3.3.6"></script>

	<script type="text/javascript"
		src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
	<!--统计代码，可删除-->

</body>

</html>
