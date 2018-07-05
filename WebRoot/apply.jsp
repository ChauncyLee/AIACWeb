<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<title>智慧门禁 - 审核清单</title>
<meta name="keywords" content="智慧门禁，简单生活">
<meta name="description" content="智慧门禁采用人脸识别技术，简单你的生活">

<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
<link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">

<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content  animated fadeInRight">
		<div class="row">
			<div class="col-sm-4" style="width:50%;">
				<div class="ibox">
					<div class="ibox-content">
						<h3>待审核住户</h3>

						<ul class="sortable-list connectList agile-list">
							<c:forEach items="${residentList }" var="r" varStatus="state">
								<li class="success-element">小区住户${r.rname }提出申请
									<div class="agile-detail">
										<a href="servlet/Rinfo?id=${r.rid }&info=R" class="pull-right btn btn-xs btn-white">详情</a>
										<a href="servlet/ConfirmApply?id=${r.rid }&info=R"
											class="pull-right btn btn-xs btn-primary"
											style="margin-right:10px;">确定</a><i
										class="fa fa-clock-o"></i>
									</div>
								</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-sm-4" style="width:50%;">
				<div class="ibox">
					<div class="ibox-content">
						<h3>待审核访客</h3>
						<ul class="sortable-list connectList agile-list">
							<c:forEach items="${visitorList }" var="v" varStatus="state">
								<li class="success-element">访客${v.vname }提出申请
									<div class="agile-detail">
										<a href="servlet/Rinfo?id=${v.vid }&info=V" class="pull-right btn btn-xs btn-white">详情</a> <a
											href="servlet/ConfirmApply?id=${v.vid }&info=V" class="pull-right btn btn-xs btn-primary"
											style="margin-right:10px;">确定</a> <i
										class="fa fa-clock-o"></i>
									</div>
								</li>
							</c:forEach>	
						</ul>
					</div>
				</div>
			</div>
			<!-- <div class="col-sm-4">
				<div class="ibox">
					<div class="ibox-content">
						<h3>已审核</h3>
						<p class="small">
							<i class="fa fa-hand-o-up"></i> 在列表之间拖动任务面板
						</p>
						<ul class="sortable-list connectList agile-list">
							<li class="warning-element">A1栋222室杨金达住户提出申请
								<div class="agile-detail">
									<a href="#" class="pull-right btn btn-xs btn-white">详情</a> <i
										class="fa fa-clock-o"></i> 2017.9.8
								</div>
							</li>
							
						</ul>
					</div>
				</div>
			</div> -->

		</div>


	</div>

	<!-- 全局js -->
	<script src="js/jquery.min.js?v=2.1.4"></script>
	<script src="js/bootstrap.min.js?v=3.3.6"></script>
	<script src="js/jquery-ui-1.10.4.min.js"></script>

	<!-- 自定义js -->
	<script src="js/content.js?v=1.0.0"></script>

	<script>
		$(document).ready(function() {
			$(".sortable-list").sortable({
				connectWith : ".connectList"
			}).disableSelection();

		});
	</script>



</body>

</html>
