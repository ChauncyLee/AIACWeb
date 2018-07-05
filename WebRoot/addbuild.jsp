<%@ page language="java" import="java.util.*,ntu.cq.bean.Building"
	pageEncoding="utf-8"%>
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
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="keywords" content="智慧门禁，简单生活">
<meta name="description" content="智慧门禁采用人脸识别技术，简单你的生活">
<title>添加住户</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
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
		<div class="col-sm-6" style="width:100%;">
			<div class="ibox float-e-margins">
				<div class="ibox-title">
					<h5>添加楼栋</h5>
					<div class="ibox-tools">
						<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
						</a> <a class="close-link"> <i class="fa fa-times"></i>
						</a>
					</div>
				</div>
				<div class="ibox-content" style="min-height:500px">

					<form class="form-horizontal m-t" id="commentForm" action="servlet/AddBuilding" method="post">
						<div class="form-group">
							<span style="color:#F00" class="errorMsg" id="errorMsg"><%=request.getAttribute("msg") == null ? "" : request
					.getAttribute("msg")%> </span>
							<label class="col-sm-3 control-label">楼栋号</label>
							<div class="col-sm-8">
								<input id="Bname" type="text" class="form-control" name="Bname">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">楼层数</label>
							<div class="col-sm-8">
								<input id="Bfloor" type="number" class="form-control" name="Bfloor">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">每层户数</label>
							<div class="col-sm-8">
								<input id="fnum" type="number" class="form-control" name="fnum">
							</div>
						</div>
						<!-- <div class="form-group">
							<label class="col-sm-3 control-label">说明：</label>
							<div class="col-sm-8">
								<textarea id="ccomment" name="comment" class="form-control"
									required="" aria-required="true"></textarea>
							</div>
						</div> -->
						<div class="form-group">
							<div class="col-sm-4 col-sm-offset-3">
								<button class="btn btn-primary" type="submit">提交</button>
							</div>
							<span style="color:#F00" class="errorMsg" id="errorMsg"><%=request.getAttribute("result") == null ? "" : request
					.getAttribute("result")%> </span>
						</div>
						
					</form>


				</div>
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

		$(function() {
			$("#Bname")
					.change(
							function() {
								//获取input的信息
								var value = $("#Bname").val();
								//改变值时向StudentManagerServlet发送请求
								var url = "${pageContext.request.contextPath}/servlet/IfBuildingServlet";
								//设置参数
								var params = {
									"Bname" : value
								};
								//发送请求
								$.post(url, params, function(workspaces) {
								$("#errorMsg").text("");
									var msg = workspaces.message;
									$("#errorMsg").text(msg);
								}, "json");
							})

		})
	</script>
	<script src="js/plugins/webuploader/webuploader.min.js"></script>

	<script src="js/demo/webuploader-demo.js"></script>



</body>

</html>