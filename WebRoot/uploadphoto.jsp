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
<span style="display:none" class="errorMsg" id ="flag" name="${flag }">${flag }</span>
<span style="display:none" class="errorMsg" id ="id" name="${id }">${id }</span>
<span style="display:none" class="errorMsg" id ="uname" name="${uname }">${uname }</span>

<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight ">
		<div class="row ">
			<div class="col-sm-6" style="width:100%;">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>上传本人照片</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a> <a class="close-link"> <i class="fa fa-times"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content" style="min-height:500px">

						<div class="page-container">

							<div id="uploader" class="wu-example">
								<div class="queueList">
									<div id="dndArea" class="placeholder"
										style="min-height: 250px;padding-top: 100px;">
										<div id="filePicker"></div>
										<p>或将照片拖到这里(请按照要求上传十张本人照片)</p>
									</div>
								</div>
								<div class="statusBar" style="display:none;">
									<div class="progress">
										<span class="text">0%</span> <span class="percentage"></span>
									</div>
									<div class="info"></div>
									<div class="btns">
										<div id="filePicker2"></div>
										<div class="uploadBtn">开始上传</div>
									</div>
								</div>
							</div>
						</div>

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
		(function() {
		var flag = $('#flag').attr("name");
		var id = $('#id').attr("name");
		var id = $('#uname').attr("name");
		
	
		})();
		
		
	</script>
	<script src="js/plugins/webuploader/webuploader.min.js"></script>

	<script src="js/demo/webuploader-demo.js"></script>



</body>

</html>