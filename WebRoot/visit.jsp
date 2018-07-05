<%@ page language="java" import="java.util.*,ntu.cq.bean.Visitor"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content">
		<div class="row animated fadeInRight">

			<div class="col-sm-4" style="width:100%;">
				
				<div class="form-group" style="width:0%;float:left;display:none;">
			<label class="font-noraml" id="hid" name="${hid }">访客</label>
				</div>
				

				<div id="info">
				<span style="color:#F00" class="errorMsg"><%=request.getAttribute("msg") == null ? "" : request
					.getAttribute("msg")%></span>
					<c:forEach items="${list }" var="v" varStatus="state">

						<div class="ibox float-e-margins" 	style="clear:none;width:30%;margin-right:3%;float:left;"> 
						<div class="ibox-title">
								<h5>访客信息</h5>
									<div class="col-sm-6">
									<c:if test="${v.vpic=='N'}">
										<button type="button" class="btn btn-primary btn-sm btn-block"  style="margin-bottom:0px;position:relative;top:-5px;"
											onclick="javascrtpt:window.location.href='servlet/ToUp?flag=V&id=${v.vid }&uname=${v.uname }'">
											<i class="fa fa-envelope"></i>添加认证照片
										</button>
									</c:if>
								</div>
							</div>
							<div>
								<div class="ibox-content no-padding border-left-right">
									<img alt="image" class="img-responsive"
										src="img/test02.jpg">
								</div>
								<div class="ibox-content profile-content">
									<span> <strong>姓名</strong>
									</span> <span style="margin-left:20px;">${v.vname }</span> <br> <span>
										<strong>性别</strong>
									</span> <span style="margin-left:20px;">${v.vgender=="F"?"女":"男" }</span>
									<br> <span> <strong>年龄</strong>
									</span> <span style="margin-left:20px;">${v.vage }</span> <br> <span>
										<strong>访问地址</strong>
									</span> <span style="margin-left:20px;">${v.bname } &nbsp;
										&nbsp;${v.haddr }</span> <br> <span> <strong>手机</strong>
									</span> <span style="margin-left:20px;">${v.vtel }</span> <br> <span>
										<strong>身份</strong>
									</span> <span style="margin-left:20px;"> 访客 </span><br> <span>
									</span>
									<div class="user-button">
										<div class="row">
											<div class="col-sm-6">
												<button type="button"
													class="btn btn-default btn-sm btn-block" name="访客" onclick="del(${v.vid})">
													<i class="fa fa-coffee" ></i> 删除访客
												</button>
											</div>
											<div class="col-sm-6">
												<button type="button"
													class="btn btn-primary btn-sm btn-block" name="访客" onclick="verify(${v.vid})">
													<i class="fa fa-envelope" ></i>修改信息
												</button>
											</div>
										</div>
									</div>
								</div>


							</div>
						</div>
					</c:forEach>
				</div>
			</div>
<div class="col-sm-6">
					<button type="button" class="btn btn-danger btn-sm btn-block"
					style="width:25%;"
						onclick="javascript:history.back(-1);">返回</button>
				</div>
		</div>
	</div>
	<!-- 全局js -->
	<script src="js/jquery.min.js?v=2.1.4"></script>
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
		$(document).ready(function() {
			// Local script for demo purpose only
			$('#lightVersion').click(function(event) {
				event.preventDefault()
				$('#ibox-content').removeClass('ibox-content');
				$('#vertical-timeline').removeClass('dark-timeline');
				$('#vertical-timeline').addClass('light-timeline');
			});

			$('#darkVersion').click(function(event) {
				event.preventDefault()
				$('#ibox-content').addClass('ibox-content');
				$('#vertical-timeline').removeClass('light-timeline');
				$('#vertical-timeline').addClass('dark-timeline');
			});

			$('#leftVersion').click(function(event) {
				event.preventDefault()
				$('#vertical-timeline').toggleClass('center-orientation');
			});

		});
		/* $('#haha').click(function() {
			swal({
				title : "您确定要按条件查询么？",
				text : "查询结果将于下面显示",
				type : "success",
				showCancelButton : true,
				confirmButtonColor : "#1ab394",
				confirmButtonText : "确定",
				closeOnConfirm : false
			}, function() {
				swal("查询成功！", "查询结果将在下面显示", "success");
			});
		});
 */
		
		function del(element) {
			swal(
					{
						title : "您确定要删除该用户吗？",
						text : "即将删除该用户",
						type : "warning",
						showCancelButton : true,
						confirmButtonColor : "#DD6B55",
						confirmButtonText : "确定",
						closeOnConfirm : false
					},
					function() {
					var Hid=$('#hid').attr("name");
					window.location.replace("servlet/DeleteVisite?Rid="+element+"&Hid="+Hid);
						
						
					});
		}
		function verify(element) {
					var Hid=$('#hid').attr("name");
					window.location.replace("servlet/UpdateResident?Rid="+element+"&Hid="+Hid);
						
		}
	</script>

	<!-- Peity -->
	<script src="js/plugins/peity/jquery.peity.min.js"></script>

	<!-- Peity -->
	<script src="js/demo/peity-demo.js"></script>
</body>

</html>