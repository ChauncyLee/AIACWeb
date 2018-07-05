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

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>H+ 后台主题UI框架 - 首页示例二</title>
<meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
<meta name="description"
	content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
<link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">

<!-- Morris -->
<link href="css/plugins/morris/morris-0.4.3.min.css" rel="stylesheet">

<!-- Gritter -->
<link href="js/plugins/gritter/jquery.gritter.css" rel="stylesheet">

<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content">
		<div class="row">
			<div class="col-sm-3">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>出入记录数</h5>
					</div>
					<div class="ibox-content">
						<h1 class="no-margins">${reRecords }</h1>
						<div class="stat-percent font-bold text-success">
							住户 <i class="fa fa-bolt"></i>
						</div>
						<small>当日</small>
					</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>出入记录数</h5>
					</div>
					<div class="ibox-content">
						<h1 class="no-margins">${viRecords }</h1>
						<div class="stat-percent font-bold text-info">
							访客 <i class="fa fa-bolt"></i>

						</div>
						<small>当日</small>
					</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>访客人数</h5>
					</div>
					<div class="ibox-content">
						<h1 class="no-margins">${viCount }</h1>
						<div class="stat-percent font-bold text-navy">
							实时<i class="fa fa-bolt"></i>
						</div>
						<small>访客</small>
					</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>未认证人员记录</h5>
					</div>
					<div class="ibox-content">
						<h1 class="no-margins">${unpermit }</h1>
						<div class="stat-percent font-bold text-danger">
							未认证<i class="fa fa-bolt"></i>

						</div>
						<small>审核</small>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>最近进出</h5>
						<!-- <div class="pull-right">
                            <div class="btn-group">
                                <button type="button" class="btn btn-xs btn-white active">天</button>
                                <button type="button" class="btn btn-xs btn-white">月</button>
                                <button type="button" class="btn btn-xs btn-white">年</button>
                            </div>
                        </div> -->
					</div>
					<div class="ibox-content">
						<div class="row">
							<div class="col-sm-9">
								<div class="flot-chart">
									<div class="flot-chart-content" id="flot-dashboard-chart"></div>
								</div>
							</div>
							<div class="col-sm-3">
								<ul class="stat-list">
									<li>
										<h2 class="no-margins">${liveResident }</h2> <small>住户数</small>
										<div class="stat-percent">
											${l }% <i class="fa fa-level-up text-navy"></i>
										</div>
										<div class="progress progress-mini">
											<div style="width:${l }%;" class="progress-bar"></div>
										</div>
									</li>
									<li>
										<h2 class="no-margins ">${rentResident }</h2> <small>租户数</small>
										<div class="stat-percent">
											${r }% <i class="fa fa-level-down text-navy"></i>
										</div>
										<div class="progress progress-mini">
											<div style="width: ${r }%;" class="progress-bar"></div>
										</div>
									</li>
									<li>
										<h2 class="no-margins "> ${applyCount }</h2> <small>待审核人数</small>
										<!-- <div class="stat-percent">
											22% <i class="fa fa-bolt text-navy"></i>
										</div>
										<div class="progress progress-mini">
											<div style="width: 22%;" class="progress-bar"></div>
										</div> -->
									</li>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>


		<div class="row">
			<div class="col-sm-4" style="width:50%;">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>住户进出</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a> <a class="close-link"> <i class="fa fa-coffe"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<div class="feed-activity-list">
							
							
							<div class="vertical-timeline-block">
								<div class="vertical-timeline-icon yellow-bg"
									style="margin-top:20px;">
									<i class="fa fa-phone"></i>
								</div>

								<div class="vertical-timeline-content">
									<h2>离开</h2>
									<span>上午</span> <span>08：30</span>，住户 <span>曹凯博</span>于门禁 <span>1</span>处进入小区
									</span>

								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-4" style="width:50%;">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>访客进出</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a> <a class="close-link"> <i class="fa fa-coffe"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<div class="feed-activity-list">
							
							<div class="vertical-timeline-block">
								<div class="vertical-timeline-icon yellow-bg"
									style="margin-top:20px;">
									<i class="fa fa-phone"></i>
								</div>

								<div class="vertical-timeline-content">
									<h2>离开</h2>
									<span>上午</span> <span>08：30</span>，访客 <span>程湉湉</span>于门禁 <span>1</span>处进入小区
									</span>

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



	<!-- Flot -->
	<script src="js/plugins/flot/jquery.flot.js"></script>
	<script src="js/plugins/flot/jquery.flot.tooltip.min.js"></script>
	<script src="js/plugins/flot/jquery.flot.spline.js"></script>
	<script src="js/plugins/flot/jquery.flot.resize.js"></script>
	<script src="js/plugins/flot/jquery.flot.pie.js"></script>
	<script src="js/plugins/flot/jquery.flot.symbol.js"></script>

	<!-- Peity -->
	<script src="js/plugins/peity/jquery.peity.min.js"></script>
	<script src="js/demo/peity-demo.js"></script>

	<!-- 自定义js -->
	<script src="js/content.js?v=1.0.0"></script>


	<!-- jQuery UI -->
	<script src="js/plugins/jquery-ui/jquery-ui.min.js"></script>

	<!-- Jvectormap -->
	<script src="js/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="js/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>

	<!-- EayPIE -->
	<script src="js/plugins/easypiechart/jquery.easypiechart.js"></script>

	<!-- Sparkline -->
	<script src="js/plugins/sparkline/jquery.sparkline.min.js"></script>

	<!-- Sparkline demo data  -->
	<script src="js/demo/sparkline-demo.js"></script>

	<script>
		$(document)
				.ready(
						function() {
							$('.chart').easyPieChart({
								barColor : '#f8ac59',
								//                scaleColor: false,
								scaleLength : 5,
								lineWidth : 4,
								size : 80
							});

							$('.chart2').easyPieChart({
								barColor : '#1c84c6',
								//                scaleColor: false,
								scaleLength : 5,
								lineWidth : 4,
								size : 80
							});

							var data2 = [ [ gd(2018, 3, 1), 358 ],
									[ gd(2018, 3, 2),  265],
									[ gd(2018, 3, 3), 289 ],
									[ gd(2018, 3, 4), 335 ],
									[ gd(2018, 3, 5), 268 ],
									[ gd(2018, 3, 6), 235 ],
									[ gd(2018, 3, 7), 586 ],
									[ gd(2018, 3, 8), 314 ],
									[ gd(2018, 3, 9), 265 ],
									[ gd(2018, 3, 10), 438 ],
									[ gd(2018, 3, 11), 356 ],
									[ gd(2018, 3, 12), 326 ],
									[ gd(2018, 3, 13), 302 ],
									[ gd(2018, 3, 14), 266 ],
									[ gd(2018, 3, 15), 358 ],
									[ gd(2018, 3, 16), 403 ],
									[ gd(2018, 3, 17), 120 ],
									[ gd(2018, 3, 18), 430 ],
									[ gd(2018, 3, 19), 389 ],
									[ gd(2018, 3, 20), 406 ],
									[ gd(2018, 3, 21), 568 ],
									[ gd(2018, 3, 22), 231 ],
									[ gd(2018, 3, 23), 562 ],
									[ gd(2018, 3, 24), 256 ],
									[ gd(2018, 3, 25), 346 ],
									[ gd(2018, 3, 26), 336 ],
									[ gd(2018, 3, 27), 453 ],
									[ gd(2018, 3, 28), 450 ],
									[ gd(2018, 3, 29), 89 ],
									[ gd(2018, 3, 30), 253 ],
									[ gd(2018, 3, 31), 550 ] ];

							var data3 = [ [ gd(2018, 3, 1), 800 ],
									[ gd(2018, 3, 2), 500 ],
									[ gd(2018, 3, 3), 600 ],
									[ gd(2018, 3, 4), 700 ],
									[ gd(2018, 3, 5), 500 ],
									[ gd(2018, 3, 6), 456 ],
									[ gd(2018, 3, 7), 800 ],
									[ gd(2018, 3, 8), 589 ],
									[ gd(2018, 3, 9), 467 ],
									[ gd(2018, 3, 10), 876 ],
									[ gd(2018, 3, 11), 689 ],
									[ gd(2018, 3, 12), 700 ],
									[ gd(2018, 3, 13), 500 ],
									[ gd(2018, 3, 14), 600 ],
									[ gd(2018, 3, 15), 700 ],
									[ gd(2018, 3, 16), 786 ],
									[ gd(2018, 3, 17), 345 ],
									[ gd(2018, 3, 18), 888 ],
									[ gd(2018, 3, 19), 888 ],
									[ gd(2018, 3, 20), 888 ],
									[ gd(2018, 3, 21), 987 ],
									[ gd(2018, 3, 22), 444 ],
									[ gd(2018, 3, 23), 999 ],
									[ gd(2018, 3, 24), 567 ],
									[ gd(2018, 3, 25), 786 ],
									[ gd(2018, 3, 26), 666 ],
									[ gd(2018, 3, 27), 888 ],
									[ gd(2018, 3, 28), 900 ],
									[ gd(2018, 3, 29), 178 ],
									[ gd(2018, 3, 30), 555 ],
									[ gd(2018, 3, 31), 993 ] ];

							var dataset = [ {
								label : "总记录数",
								data : data3,
								color : "#1ab394",
								bars : {
									show : true,
									align : "center",
									barWidth : 24 * 60 * 60 * 600,
									lineWidth : 0
								}

							}, {
								label : "进入记录数",
								data : data2,
								yaxis : 2,
								color : "#464f88",
								lines : {
									lineWidth : 1,
									show : true,
									fill : true,
									fillColor : {
										colors : [ {
											opacity : 0.2
										}, {
											opacity : 0.2
										} ]
									}
								},
								splines : {
									show : false,
									tension : 0.6,
									lineWidth : 1,
									fill : 0.1
								},
							} ];

							var options = {
								xaxis : {
									mode : "time",
									tickSize : [ 3, "day" ],
									tickLength : 0,
									axisLabel : "Date",
									axisLabelUseCanvas : true,
									axisLabelFontSizePixels : 12,
									axisLabelFontFamily : 'Arial',
									axisLabelPadding : 10,
									color : "#838383"
								},
								yaxes : [ {
									position : "left",
									max : 1070,
									color : "#838383",
									axisLabelUseCanvas : true,
									axisLabelFontSizePixels : 12,
									axisLabelFontFamily : 'Arial',
									axisLabelPadding : 3
								}, {
									position : "right",
									clolor : "#838383",
									axisLabelUseCanvas : true,
									axisLabelFontSizePixels : 12,
									axisLabelFontFamily : ' Arial',
									axisLabelPadding : 67
								} ],
								legend : {
									noColumns : 1,
									labelBoxBorderColor : "#000000",
									position : "nw"
								},
								grid : {
									hoverable : false,
									borderWidth : 0,
									color : '#838383'
								}
							};

							function gd(year, month, day) {
								return new Date(year, month - 1, day).getTime();
							}

							var previousPoint = null, previousLabel = null;

							$
									.plot($("#flot-dashboard-chart"), dataset,
											options);

							var mapData = {
								"US" : 298,
								"SA" : 200,
								"DE" : 220,
								"FR" : 540,
								"CN" : 120,
								"AU" : 760,
								"BR" : 550,
								"IN" : 200,
								"GB" : 120,
							};

							$('#world-map').vectorMap({
								map : 'world_mill_en',
								backgroundColor : "transparent",
								regionStyle : {
									initial : {
										fill : '#e4e4e4',
										"fill-opacity" : 0.9,
										stroke : 'none',
										"stroke-width" : 0,
										"stroke-opacity" : 0
									}
								},

								series : {
									regions : [ {
										values : mapData,
										scale : [ "#1ab394", "#22d6b1" ],
										normalizeFunction : 'polynomial'
									} ]
								},
							});
						});
	</script>

	<script type="text/javascript"
		src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
	<!--统计代码，可删除-->

</body>

</html>
