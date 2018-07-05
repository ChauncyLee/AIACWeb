<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<title>帮助页面</title>
<meta name="keywords" content="智慧门禁，简单生活">
<meta name="description" content="智慧门禁采用人脸识别技术，简单你的生活">

<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
<link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">

<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
	<div class="row">
		<div class="col-sm-12">
			<div class="wrapper wrapper-content animated fadeInUp">

				<div class="ibox-content m-b-sm border-bottom">
					<div class="text-center p-lg">
						<h2>如果没有找到您需要的问题</h2>
						<h3>您可以加微信1249417038询问</h3>
						<!-- <button title="Create new cluster" class="btn btn-primary btn-sm"><i class="fa fa-plus"></i> <span class="bold">在线提问</span> -->
						<!-- </button>按钮 -->
					</div>
				</div>

				<div class="faq-item">
					<div class="row">
						<div class="col-md-7">
							<a data-toggle="collapse" href="faq.html#faq1"
								class="faq-question">如何删除住户</a> <small><strong>智慧门禁</strong>
								<i class="fa fa-clock-o"></i> 今天15:34</small>
						</div>
						<div class="col-md-3">
							<span class="small font-bold">住户</span>
							<div class="tag-list">
								<span class="tag-item">添加</span> <span class="tag-item">删除</span>
							</div>
						</div>
						<div class="col-md-2 text-right">
							<span class="small font-bold">投票 </span> <br />42
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12">
							<div id="faq1" class="panel-collapse collapse faq-answer">
								<p>
									打开住户管理页面，点击住户信息，从楼栋信息里找到住户，点击住户的门牌号信息，按下删除住户选项。
								</p>
							</div>
						</div>
					</div>
				</div>
				<div class="faq-item">
					<div class="row">
						<div class="col-md-7">
							<a data-toggle="collapse" href="faq.html#faq2"
								class="faq-question">如何添加住户</a> <small><strong>智慧门禁</strong>
								<i class="fa fa-clock-o"></i> 今天15:34</small>
						</div>
						<div class="col-md-3">
							<span class="small font-bold">楼栋</span>
							<div class="tag-list">
								<span class="tag-item">添加</span> <span class="tag-item">删除</span>
							</div>
						</div>
						<div class="col-md-2 text-right">
							<span class="small font-bold">投票 </span> <br />24
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12">
							<div id="faq2" class="panel-collapse collapse faq-answer">
								<p>
									打开住户管理页面，点击添加住户就可以添加住户信息。
								</p>
							</div>
						</div>
					</div>
				</div>
				<div class="faq-item">
					<div class="row">
						<div class="col-md-7">
							<a data-toggle="collapse" href="faq.html#faq3"
								class="faq-question">如何添加楼栋</a> <small><strong>智慧门禁</strong>
								<i class="fa fa-clock-o"></i> 今天15:34</small>
						</div>
						<div class="col-md-3">
							<span class="small font-bold">楼栋</span>
							<div class="tag-list">
								<span class="tag-item">信息</span> <span class="tag-item">理财</span>
							</div>
						</div>
						<div class="col-md-2 text-right">
							<span class="small font-bold">投票 </span> <br />22
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12">
							<div id="faq3" class="panel-collapse collapse faq-answer">
								<p>打开住户管理页面，点击添加楼栋就可以添加楼栋信息。</p>
							</div>
						</div>
					</div>
				</div>
				<div class="faq-item">
					<div class="row">
						<div class="col-md-7">
							<a data-toggle="collapse" href="faq.html#faq4"
								class="faq-question">如何查看是否有陌生人进入
</a> <small><strong>智慧门禁</strong>
								<i class="fa fa-clock-o"></i> 今天15:34</small>
						</div>
						<div class="col-md-3">
							<span class="small font-bold">查看</span>
							<div class="tag-list">
								<span class="tag-item">陌生人</span> <span class="tag-item">理财</span>
							</div>
						</div>
						<div class="col-md-2 text-right">
							<span class="small font-bold">投票 </span> <br />65
						</div>
					</div>
					
				</div>
				<div class="faq-item">
					<div class="row">
						<div class="col-md-7">
							<a data-toggle="collapse" href="faq.html#faq5"
								class="faq-question">如何查看住户访客的进入</a> <small><strong>智慧门禁</strong>
								<i class="fa fa-clock-o"></i> 今天15:34</small>
						</div>
						<div class="col-md-3">
							<span class="small font-bold">查看</span>
							<div class="tag-list">
								<span class="tag-item">访客</span> <span class="tag-item">理财</span>
							</div>
						</div>
						<div class="col-md-2 text-right">
							<span class="small font-bold">投票 </span> <br />76
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12">
							<div id="faq5" class="panel-collapse collapse faq-answer">
								<p>打开出入管理页面，点击进出情况，就可以清晰看见何时何门禁出住户访客的进出情况。</p>
							</div>
						</div>
					</div>
				</div>
				<div class="faq-item">
					<div class="row">
						<div class="col-md-7">
							<a data-toggle="collapse" href="faq.html#faq6"
								class="faq-question">如何改变门禁开关状态</a> <small><strong>智慧门禁</strong>
								<i class="fa fa-clock-o"></i> 今天15:34</small>
						</div>
						<div class="col-md-3">
							<span class="small font-bold">门禁</span>
							<div class="tag-list">
								<span class="tag-item">开关</span> <span class="tag-item">理财</span>
							</div>
						</div>
						<div class="col-md-2 text-right">
							<span class="small font-bold">投票 </span> <br />11
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12">
							<div id="faq6" class="panel-collapse collapse faq-answer">
								<p>打开门禁管理页面，点击门禁信息，选择门禁，点击切换状态。</p>
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


	<script>
		$(document).ready(function() {

			$('#loading-example-btn').click(function() {
				btn = $(this);
				simpleLoad(btn, true)

				// Ajax example
				//                $.ajax().always(function () {
				//                    simpleLoad($(this), false)
				//                });

				simpleLoad(btn, false)
			});
		});

		function simpleLoad(btn, state) {
			if (state) {
				btn.children().addClass('fa-spin');
				btn.contents().last().replaceWith(" Loading");
			} else {
				setTimeout(function() {
					btn.children().removeClass('fa-spin');
					btn.contents().last().replaceWith(" Refresh");
				}, 2000);
			}
		}
	</script>

	<script type="text/javascript"
		src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
	<!--统计代码，可删除-->

</body>

</html>
