<%@ page language="java" import="java.util.*,ntu.cq.bean.Record"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
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


<title>智慧门禁进出情况</title>

<meta name="keywords" content="智慧门禁，简单你的生活">
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
	List<Record> list=new ArrayList<Record>();
	list=(List<Record>)request.getAttribute("list");
	Integer Did=(Integer)request.getAttribute("Did");
	String info=(String)request.getAttribute("info");
%>
</head>

<body class="gray-bg">


	<div class="row" id="row" name="${info }">
		<div class="col-sm-12">
			<div class="wrapper wrapper-content">
				<div class="wrapper wrapper-content animated fadeInRight"
					style="position:relative;z-index:100;">
					<div class="row">
						<div class="col-sm-5" style="width:100%;">
							<div class="ibox float-e-margins" style="width:100%;">
								<div class="ibox-content" style="width:100%;">

									<div class="form-group" id="data_5"
										style="width:50%;float:left;">
										<label class="font-noraml">日期选择</label>
										<div class="input-daterange input-group" id="datepicker">
											<input type="text" class="input-sm form-control" name="start"
												id="start" value="2018-01-01" /> <span
												class="input-group-addon">到</span> <input type="text"
												class="input-sm form-control" name="end" id="end"
												value="2018-01-01" />
										</div>
									</div>
									<div class="form-group" style="width:50%;float:left;">
										<button type="button" class="btn btn-outline btn-primary"
											style="margin-top:20px;" id="determine" value="${Did }">确定</button>
									</div>
									<div style="clear:both;"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row animated fadeInRight">
					<div class="col-sm-12">
						<div class="ibox float-e-margins">
							<div class="" id="ibox-content">



								<!-- 颜色：navy-bg lazur-bg blue-bg yellow-bg-->
								<!-- 图标：工作：fa-briefcase  文件：fa-file-text 咖啡：fa-coffee 电话：fa-phone 医生fa-user-md-->
								<div id="record">
									<c:forEach items="${list }" var="record" varStatus="state">

										<div class="vertical-timeline-block">
											<div class="vertical-timeline-icon ${record.color }">
												<i class="fa ${record.pic }"></i>
											</div>
											<div class="vertical-timeline-content">
												<span id="dir"><h2>${record.ddir }</h2></span> <span
													id="datetime"> ${record.date } </span>，${record.role } <span
													id="Rname"> ${record.name } </span>于门禁 <span id="Dno">${record.dno }
												</span>处 <span id="Dir">${record.ddir } </span>小区 <a
													href="servlet/Rinfo?id=${record.id }&info=${info }"
													class="btn btn-sm btn-primary my_top"> 查看用户信息</a>
											</div>
										</div>
									</c:forEach>
									<c:if test="${fn:length(list)<=0 }">
									<span style="color:#F00"> 	&nbsp; 	&nbsp; 	&nbsp; 	&nbsp;此门禁暂无出行记录</span>
									</c:if>
								</div>
							</div>
						</div>

					</div>




				</div>
			</div>
		</div>
	</div>
	</div>
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
		// 添加全局站点信息
		var BASE_URL = 'js/plugins/webuploader';

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
		$('#haha').click(function() {
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

		function setDiv(item) {
			var div = '<div class="vertical-timeline-block" id="record">'
					+ '<div class="vertical-timeline-icon '
					+ item.color
					+ '">'
					+ '<i class="fa '
					+ item.pic
					+ '"></i></div>'
					+ '<div class="vertical-timeline-content">'
					+ '<span id="dir"><h2>'
					+ item.Ddir
					+ '</h2></span>'
					+ '<span id="datetime">'
					+ item.datetm
					+ '</span>，'
					+ item.role
					+ ' <span id="Rname">'
					+ item.name
					+ '</span>于门禁 <span id="Dno">'
					+ item.Dno
					+ ' </span>处<span id="Dir">'
					+ item.Ddir
					+ '</span>小区'
					+ '<a href="servlet/Rinfo?id='
					+ item.id
					+ '&info='
					+ item.info
					+ '" class="btn btn-sm btn-primary my_top"> 查看用户信息</a></div></div>'
			return div
		}

		//提交查询
		$(function() {
			$("#determine")
					.click(
							function() {

								//获取select选择的信息
								var Did = $("#determine").val();
								var start = $("#start").val();
								var end = $("#end").val();
								var info = $("#row").attr("name");
								//改变值时向StudentManagerServlet发送请求

								var url = "${pageContext.request.contextPath}/servlet/DTimeLineServlet?info="+info;
								//设置参数
								var params = {
									"Did" : Did + "",
									"start" : start,
									"end" : end
								};
								//发送请求
								$
										.post(
												url,
												params,
												function(workspaces) {
													var html = '';
													document
															.getElementById('record').innerHTML = html;
													for (var i = 0; i < workspaces.length; i++) {
														html += setDiv(workspaces[i]);
													}
													if (workspaces.length <= 0) {
														html += '<span style="color:#F00"> 	&nbsp; 	&nbsp; 	&nbsp; 	&nbsp;在该时间段内次门禁暂无出行记录</span>'
													}
													document
															.getElementById('record').innerHTML = html;
												}, "json");
							})

		})
	</script>









</body>

</html>