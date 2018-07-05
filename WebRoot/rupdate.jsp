<%@ page language="java" import="java.util.*,ntu.cq.bean.Building"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="keywords" content="智慧门禁，简单生活">
<meta name="description" content="智慧门禁采用人脸识别技术，简单你的生活">
<title>添加住户</title>
<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
<link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css?v=4.1.0" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="css/plugins/webuploader/webuploader.css">
<link rel="stylesheet" type="text/css"
	href="css/demo/webuploader-demo.css">

</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight ">
		<div class="row ">
			<div class="col-sm-6" style="width:100%;">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>修改个人信息</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a> <a class="close-link"> <i class="fa fa-times"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content" style="min-height:500px">


						<form class="form-horizontal m-t" id="commentForm"
							action="servlet/ConfirmUpdater?" method="post">
							<div class="form-group">
								<label class="col-sm-3 control-label">编号：</label>
								<div class="col-sm-8">
									<input id="Rid" name="Rid" minlength="" type="text"
										class="form-control" required="" aria-required="true"
										value="${resident.rid }" readonly="true ">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">姓名：</label>
								<div class="col-sm-8">
									<input id="Rname" name="Rname" minlength="" type="text"
										class="form-control" required="" aria-required="true"
										value="${resident.rname }" readonly="true ">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">性别：</label>
								<div class="col-sm-8">
									<input id="gender" type="text" class="form-control" name="gender"
										required="" aria-required="true"
										value="${resident.rgender=='F'?'女':'男' }" readonly="true ">
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">年龄：</label>
								<div class="col-sm-8">
									<input id="age" type="text" class="form-control"
										name="age" required="" aria-required="true"
										value="${resident.rage }" readonly="true ">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">身份：</label>
								<div class="col-sm-8">
									<input id="role" type="text" class="form-control" name="role"
										required="" aria-required="true"
										value="${resident.RRole=='R'?'租户':'住户' }">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">手机号(用户名)：</label>
								<div class="col-sm-8">
									<input id="tel" name="tel" minlength="11" type="text"
										class="form-control" required="" aria-required="true"
										value="${resident.rtel }">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">密码：</label>
								<div class="col-sm-8">
									<input id="password" name="password" minlength="6"
										type="password" class="form-control" required=""
										aria-required="true">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">确认密码：</label>
								<div class="col-sm-8">
									<input id="repassword" name="repassword" minlength="6"
										type="password" class="form-control" required=""
										aria-required="true">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">楼栋：</label>
								<div class="col-sm-8">
									<input id="bname" name="bname" type="text"
										class="form-control" required="" aria-required="true"
										value="${resident.bname }">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">房间：</label>
								<div class="col-sm-8">
									<input id="haddr" name="haddr" type="text"
										class="form-control" required="" aria-required="true"
										value="${resident.haddr }">
								</div>
							</div>


							<div class="form-group">
								<div class="col-sm-4 col-sm-offset-3">
									<button class="btn btn-primary" type="submit">确认修改</button>
									<button type="button" class="btn btn-danger "
										onclick="javascript:history.back(-1);">返回</button>
								</div>
								<span style="color:#F00" class="errorMsg"><%=request.getAttribute("msg") == null ? "" : request
					.getAttribute("msg")%></span>
							</div>

						</form>


					</div>

				</div>
				<div class="ibox float-e-margins"></div>
			</div>


		</div>

	</div>


	<!-- 全局js -->
	<script src="js/jquery.min.js?v=2.1.4"></script>
	<script src="js/bootstrap.min.js?v=3.3.6"></script>

	<!-- 自定义js -->
	<script src="js/content.js?v=1.0.0"></script>

	<!-- jQuery Validation plugin javascript-->
	<script src="js/plugins/validate/jquery.validate.min.js"></script>
	<script src="js/plugins/validate/messages_zh.min.js"></script>

	<script src="js/demo/form-validate-demo.js"></script>

	<script type="text/javascript"
		src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
	<!--统计代码，可删除-->
	<!-- 全局js -->





	<!-- 自定义js -->



	<!-- Web Uploader -->
	<script type="text/javascript">
		// 添加全局站点信息
		var BASE_URL = 'js/plugins/webuploader';
	</script>
	<script src="js/plugins/webuploader/webuploader.min.js"></script>

	<script src="js/demo/webuploader-demo.js"></script>



</body>

</html>