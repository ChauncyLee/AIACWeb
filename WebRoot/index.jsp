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
<meta name="renderer" content="webkit">

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>智慧门禁-主页</title>

<meta name="keywords" content="智慧门禁，简单出行">
<meta name="description" content="智慧门禁采用人脸识别技术，简单你的生活">

<!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->

<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
<link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css?v=4.1.0" rel="stylesheet">
</head>

<body class="fixed-sidebar full-height-layout gray-bg"
	style="overflow:hidden">
	<div id="wrapper">
		<!--左侧导航开始-->
		<nav class="navbar-default navbar-static-side"
			style="background:rgba(32,136,201,0.8);" role="navigation">
		<div class="nav-close">
			<i class="fa fa-times-circle"></i>
		</div>
		<div class="sidebar-collapse">
			<ul class="nav" id="side-menu">
				<li class="nav-header">
					<div class="dropdown profile-element">
						<span> <img alt="image" class="img-circle"
							src="img/profile_small.jpg" />
						</span> <a data-toggle="dropdown" class="dropdown-toggle" href="#"> <span
							class="clear"> <span class="block m-t-xs"> <strong
									class="font-bold">admin</strong>
							</span> <span class="text-muted text-xs block">超级管理员<!--  <b
									class="caret"></b> -->
							</span>
						</span>
						</a>
					</div>
				</li>
				<li><a class="J_menuItem" href="servlet/ToIndex"> <i
						class="fa fa-home"></i> <span class="nav-label">首页</span>
				</a></li>
				<li><a class="J_menuItem"> <i class="fa fa-columns"></i> <span
						class="nav-label">住户管理</span> <span class="fa arrow"></span>
				</a>
					<ul class="nav nav-second-level">
						<li><a class="J_menuItem"
							href="servlet/BuildingSearchServlet">住户信息</a></li>
						<li><a class="J_menuItem"
							href="servlet/GetBuildingNumServiet?to=people" data-index="0">添加住户</a></li>
						<li><a class="J_menuItem" href="servlet/GetBnameServlet">添加楼栋</a></li>
					</ul></li>
				<li><a class="J_menuItem"> <i class="fa fa-magic"></i> <span
						class="nav-label">门禁管理</span> <span class="fa arrow"></span>
				</a>
					<ul class="nav nav-second-level">
						<li><a class="J_menuItem" href="servlet/ToDoorControl"
							data-index="0">门禁信息</a></li>
						<li><a class="J_menuItem" href="adddoor.jsp" data-index="0">添加门禁</a>
						</li>

					</ul></li>
				<li><a class="J_menuItem"> <i class="fa fa-table"></i> <span
						class="nav-label">出入管理</span> <span class="fa arrow"></span>
				</a>
					<ul class="nav nav-second-level">
						<li><a class="J_menuItem"
							href="servlet/GetBuildingNumServiet?to=time" data-index="0">进出情况查询</a></li>
						<li><a class="J_menuItem" href="servlet/ViewStranger"
							data-index="0">未认证人员记录</a></li>

					</ul></li>

				<li><a class="J_menuItem" href="servlet/ToExamine"> <i
						class="fa fa-envelope"></i> <span class="nav-label">审核管理</span>
				</a></li>
				<li><a class="J_menuItem" href="faq.jsp"> <i
						class="fa fa-flask"></i> <span class="nav-label">寻求帮助</span>
				</a></li>

			</ul>
		</div>
		</nav>
		<!--左侧导航结束-->
		<!--右侧部分开始-->
		<div id="page-wrapper" class="gray-bg dashbard-1">
			<div class="row border-bottom">
				<nav class="navbar navbar-static-top" role="navigation"
					style="margin-bottom: 0">
				<div class="navbar-header">
					<a class="navbar-minimalize minimalize-styl-2 btn btn-primary ">
						<i class="fa fa-bars"></i>
					</a>
				</div>
				<ul class="nav navbar-top-links navbar-right">
					<li class="dropdown"><a class="dropdown-toggle count-info"
						data-toggle="dropdown" href="#"> <i class="fa fa-envelope"></i>
							<span class="label label-warning">3</span>
					</a>
						<ul class="dropdown-menu dropdown-messages">
							<li class="m-t-xs">
								<div class="dropdown-messages-box">
									<a href="profile.html" class="pull-left"> <img alt="image"
										class="img-circle" src="img/a7.jpg">
									</a>
									<div class="media-body">
										<strong>A1栋222室杨金达住户提出申请</strong> <br> <small
											class="text-muted"
											style="margin-top:10px;display:inline-block">一天前
											2018.02.23</small>
									</div>
								</div>
							</li>
							<li class="divider"></li>
							<li>
								<div class="dropdown-messages-box">
									<a href="profile.html" class="pull-left"> <img alt="image"
										class="img-circle" src="img/a4.jpg">
									</a>
									<div class="media-body ">
										<strong>A2栋222室李春桥提出申请</strong> <br> <small
											class="text-muted"
											style="margin-top:10px;display:inline-block"> 今天</small>
									</div>
								</div>
							</li>
							<li class="divider"></li>
							<li>
								<div class="text-center link-block">
									<a class="J_menuItem" href="mailbox.html"> <i
										class="fa fa-envelope"></i> <strong> 查看所有消息</strong>
									</a>
								</div>
							</li>
						</ul></li>


					<li class="dropdown hidden-xs"><a class="right-sidebar-toggle"
						aria-expanded="false"> <i class="fa fa-tasks"></i> 主题
					</a></li>
				</ul>
				</nav>
			</div>
			<div class="row content-tabs">
				<button class="roll-nav roll-left J_tabLeft">
					<i class="fa fa-backward"></i>
				</button>
				<nav class="page-tabs J_menuTabs">
				<div class="page-tabs-content">
					<a href="javascript:;" class="active J_menuTab"
						data-id="index_v1.html">首页</a>
				</div>
				</nav>
				<button class="roll-nav roll-right J_tabRight">
					<i class="fa fa-forward"></i>
				</button>
				<div class="btn-group roll-nav roll-right">
					<button class="dropdown J_tabClose" data-toggle="dropdown">
						关闭操作 <span class="caret"></span>

					</button>
					<ul role="menu" class="dropdown-menu dropdown-menu-right">
						<li class="J_tabShowActive"><a>定位当前选项卡</a></li>
						<li class="divider"></li>
						<li class="J_tabCloseAll"><a>关闭全部选项卡</a></li>
						<li class="J_tabCloseOther"><a>关闭其他选项卡</a></li>
					</ul>
				</div>
				<a href="servlet/ExitServlet" class="roll-nav roll-right J_tabExit">
					<i class="fa fa fa-sign-out"></i> 退出
				</a>
			</div>
			<div class="row J_mainContent" id="content-main">
				<iframe class="J_iframe" name="iframe0" width="100%" height="100%"
					src="servlet/ToIndex?v=4.0" frameborder="0" data-id="index_v1.html"
					seamless></iframe>
			</div>
			<div class="footer">
				<div class="pull-right">
					&copy; 2018 evian
				</div>
			</div>
		</div>
		<!--右侧部分结束-->
		<!--右侧边栏开始-->
		<div id="right-sidebar">
			<div class="sidebar-container">

				<ul class="nav nav-tabs navs-3">

					<li style="width:100%;"><a data-toggle="tab" href="#tab-1">
							<i class="fa fa-gear"></i> 主题
					</a></li>

				</ul>

				<div class="tab-content">
					<div id="tab-1" class="tab-pane active">
						<div class="sidebar-title">
							<h3>
								<i class="fa fa-comments-o"></i> 主题设置
							</h3>
							<small> <i class="fa fa-tim"> </i>
								你可以从这里选择和预览主题的布局和样式，这些设置会被保存在本地，下次打开的时候会直接应用这些设置。
							</small>
						</div>
						<div class="skin-setttings">
							<div class="title">主题设置</div>
							<div class="setings-item">
								<span>收起左侧菜单</span>
								<div class="switch">
									<div class="onoffswitch">
										<input type="checkbox" name="collapsemenu"
											class="onoffswitch-checkbox" id="collapsemenu"> <label
											class="onoffswitch-label" for="collapsemenu"> <span
											class="onoffswitch-inner"></span> <span
											class="onoffswitch-switch"></span>
										</label>
									</div>
								</div>
							</div>
							<div class="setings-item">
								<span>固定顶部</span>

								<div class="switch">
									<div class="onoffswitch">
										<input type="checkbox" name="fixednavbar"
											class="onoffswitch-checkbox" id="fixednavbar"> <label
											class="onoffswitch-label" for="fixednavbar"> <span
											class="onoffswitch-inner"></span> <span
											class="onoffswitch-switch"></span>
										</label>
									</div>
								</div>
							</div>
							<div class="setings-item">
								<span> 固定宽度 </span>

								<div class="switch">
									<div class="onoffswitch">
										<input type="checkbox" name="boxedlayout"
											class="onoffswitch-checkbox" id="boxedlayout"> <label
											class="onoffswitch-label" for="boxedlayout"> <span
											class="onoffswitch-inner"></span> <span
											class="onoffswitch-switch"></span>
										</label>
									</div>
								</div>
							</div>
							<div class="title">皮肤选择</div>
							<div class="setings-item  nb default-skin">
								<span class="skin-name "> <a href="#" class="s-skin-1">
										默认皮肤 </a>
								</span>
							</div>
							<div class="setings-item  blue-skin nb">
								<span class="skin-name "> <a href="#" class="s-skin-0">
										黑色主题 </a>
								</span>
							</div>

							<div class="setings-item yellow-skin nb">
								<span class="skin-name "> <a href="#" class="s-skin-3">
										黄色/紫色主题 </a>
								</span>
							</div>
						</div>
					</div>

				</div>

			</div>
		</div>
		<!--右侧边栏结束-->
	</div>
	<!-- 全局js -->
	<script src="js/jquery.min.js?v=2.1.4"></script>
	<script src="js/bootstrap.min.js?v=3.3.6"></script>
	<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
	<script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
	<script src="js/plugins/layer/layer.min.js"></script>
	<!-- 自定义js -->
	<script src="js/hplus.js?v=4.1.0"></script>
	<script type="text/javascript" src="js/contabs.js"></script>
	<!-- 第三方插件 -->
	<script src="js/plugins/pace/pace.min.js"></script>
</body>

</html>