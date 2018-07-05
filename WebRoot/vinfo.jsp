<%@ page language="java" import="java.util.*,ntu.cq.bean.Visitor"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>智慧门禁 - 个人资料</title>
<meta name="keywords" content="智慧门禁，简单生活">
<meta name="description" content="智慧门禁采用人脸识别技术，简单你的生活">



<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
<link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css?v=4.1.0" rel="stylesheet">

<link href="css/plugins/iCheck/custom.css" rel="stylesheet">

<link href="css/plugins/chosen/chosen.css" rel="stylesheet">

<link href="css/plugins/colorpicker/css/bootstrap-colorpicker.min.css"
	rel="stylesheet">

<link href="css/plugins/cropper/cropper.min.css" rel="stylesheet">

<link href="css/plugins/switchery/switchery.css" rel="stylesheet">

<link href="css/plugins/jasny/jasny-bootstrap.min.css" rel="stylesheet">

<link href="css/plugins/nouslider/jquery.nouislider.css"
	rel="stylesheet">

<link href="css/plugins/datapicker/datepicker3.css" rel="stylesheet">

<link href="css/plugins/ionRangeSlider/ion.rangeSlider.css"
	rel="stylesheet">
<link href="css/plugins/ionRangeSlider/ion.rangeSlider.skinFlat.css"
	rel="stylesheet">

<link
	href="css/plugins/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css"
	rel="stylesheet">

<link href="css/plugins/clockpicker/clockpicker.css" rel="stylesheet">

<link href="css/animate.css" rel="stylesheet">

<link href="css/plugins/sweetalert/sweetalert.css" rel="stylesheet">

<%
    	Visitor v=new Visitor();
    	v=(Visitor)request.getAttribute("v");
%>
</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content">
		<div class="row animated fadeInRight">

			<div class="col-sm-4">

				<div class="form-group" style="width:50%;float:left;">
					<label class="font-noraml">访客</label>
				</div>

				<div id="info">
					<div class="ibox float-e-margins">
						<div class="ibox-title">
							<h5>访客信息</h5>
						</div>
						<div>
							<div class="ibox-content no-padding border-left-right">
								<img alt="image" class="img-responsive"
									src="img/test02.jpg">
							</div>
							<div class="ibox-content profile-content">
								<span> <strong>姓名</strong>
								</span> <span style="margin-left:20px;">${v.vname }</span> <br>
								<span> <strong>性别</strong>
								</span> <span style="margin-left:20px;">${v.vgender=="F"?"女":"男" }</span>
								<br> <span> <strong>年龄</strong>
								</span> <span style="margin-left:20px;">${v.vage }</span> <br>
								<span> <strong>访问地址</strong>
								</span> <span style="margin-left:20px;">${v.bname } 	&nbsp; 	&nbsp;${v.haddr }</span>
								<br> <span> <strong>联系方式</strong>
								</span> <span style="margin-left:20px;">${v.vtel }</span> <br>
								<span> <strong>身份</strong>
								</span> <span style="margin-left:20px;">${v.vrole }</span><br>

									
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 全局js -->
	<script src="js/jquery.min.j
	s?v
	=2.1.4"></script>
	<script src="js/bootstrap.min.js?v=3.3.6"></script>
	<!-- 自定义js -->
	<script src="js/content.js?v=1.0.0"></script>
	<!-- Chosen -->
	<script src="js/plugins/chosen/chosen.jquery.js"></script>

	<!-- JSKnob -->
	<script src="js/plugins/jsKnob/jquery.knob.js"></script>

	<!-- Input Mask-->
	<script src="js/plugins/jasny/jasny-bootstrap.min.js"></script>

	<!-- Data picker -->
	<script src="js/plugins/datapicker/bootstrap-datepicker.js"></script>

	<!-- Prettyfile -->
	<script src="js/plugins/prettyfile/bootstrap-prettyfile.js"></script>


	<!-- Switchery -->
	<script src="js/plugins/switchery/switchery.js"></script>

	<!-- IonRangeSlider -->
	<script src="js/plugins/ionRangeSlider/ion.rangeSlider.min.js"></script>

	<!-- iCheck -->
	<script src="js/plugins/iCheck/icheck.min.js"></script>

	<!-- MENU -->
	<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

	<!-- Color picker -->
	<script src="js/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>

	<!-- Clock picker -->
	<script src="js/plugins/clockpicker/clockpicker.js"></script>

	<!-- Image cropper -->
	<script src="js/plugins/cropper/cropper.min.js"></script>

	<script src="js/demo/form-advanced-demo1.js"></script>

	<script src="js/plugins/sweetalert/sweetalert.min.js"></script>
	<script>
		
	</script>

	<!-- Peity -->
	<script s
		rc="js/
	plugins/peity/jquery.peity.min.js"></script>

	<!-- Peity -->
	<script src="js/demo/peity-demo.js"></script>
</body>

</html>