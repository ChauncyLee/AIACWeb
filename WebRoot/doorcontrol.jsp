<%@ page language="java"
	import="java.util.*,ntu.cq.bean.Door,ntu.cq.bean.PassInfo"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
<title>门禁管理</title>
<meta name="keywords" content="智慧门禁，简单生活">
<meta name="description" content="智慧门禁采用人脸识别技术，简单你的生活">

<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
<link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">

<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css?v=4.1.0" rel="stylesheet">
<link href="css/plugins/sweetalert/sweetalert.css" rel="stylesheet">

<%
	List<Door> list=new ArrayList<Door>();
	List<PassInfo> listinfo=new ArrayList<PassInfo>();
	list=(List<Door>)request.getAttribute("list");
	listinfo=(List<PassInfo>)request.getAttribute("listinfo");
	Door door=new Door();
	PassInfo pi=new PassInfo();
%>
</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight">
		<div class="row">
			<div class="col-sm-4" style="width:100%;">

				<%
					for(int i=0;i<list.size();i++){
						door=list.get(i);
						pi=listinfo.get(i);
						float per=((float)(pi.getRnum()+pi.getVnum()+pi.getPnum()))/((float)(pi.getPnum()+pi.getRnum()+pi.getUnum()+pi.getVnum()));
						Integer p=Math.round(per*100);
				%>
				<div class="ibox" style="width:30%;margin-right:3%;clear:none;float:left;">
					<div class="ibox-title" name="<%=door.getDstatus()%>"
						id="flag<%=door.getDid()+""%>">
						<span id="status<%=door.getDid()+""%>"
							class="label label-<%=door.getDstatus().equals("offline")?"danger":"primary"%> pull-right">
							<%=door.getDstatus().equals("offline")?"CLOSE":"OPEN"%></span>
						<h5>
							门禁<%=door.getDno()%></h5>
					</div>
					<div class="ibox-content">

						<div class="myclose">
							<button type="button" class="btn btn-outline btn-warning myclose"
								name="<%=door.getDid()%>" id="change" value="<%=door.getDid()%>"
								onclick="verify(this)">切换状态</button>
						</div>
						<div class="row  m-t-sm">
							<div class="col-sm-4">
								<div class="font-bold">通过率</div>
								<%=p%>%
							</div>
							<div class="col-sm-4">
								<div class="font-bold">陌生人(人次)</div>
								<%=pi.getUnum()%>
							</div>
							<div class="col-sm-4 text-right">
								<div class="font-bold"><a href="servlet/DoorRecord?Did=<%=door.getDid() %>&info=V">访客</a>/<a href="servlet/DoorRecord?Did=<%=door.getDid() %>&info=R">住户</a>(人次)</div>
								<%=pi.getVnum()+"/"+pi.getRnum()%>
							</div>
						</div>
					</div>
				</div>
				<%
					}
				%>

			</div>

		</div>


	</div>


	<!-- 全局js -->
	<script src="js/jquery.min.js?v=2.1.4"></script>
	<script src="js/bootstrap.min.js?v=3.3.6"></script>

	<!-- 自定义js -->
	<script src="js/content.js?v=1.0.0"></script>
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
		function verify(element) {
			swal(
					{
						title : "您确定要切换门禁状态么？",
						text : "门禁状态即将切换",
						type : "warning",
						showCancelButton : true,
						confirmButtonColor : "#DD6B55",
						confirmButtonText : "确定",
						closeOnConfirm : false
					},
					function() {
						//通过响应事件传参数获取change的值
						var value = element.value;
						var status = $("#flag" + value).attr("name");
						//点击确定时向ChangeDoorStatus发送请求
						var url = "${pageContext.request.contextPath}/servlet/ChangeDoorStatus";
						//设置参数
						var params = {
							"Did" : value,
							"Dstatus" : status
						};
						//发送请求
						var mess;
						var te;
						var sta;
						var stat;
						$.post(url, params, function(workspaces) {
							mess = workspaces[0].message;
							te = workspaces[1].message;
							stat = workspaces[2].message;
							sta = workspaces[3].message;
							$("#status" + value).text(te);
							$("#flag" + value).attr("name", stat);
							$("#status" + value).attr("class", sta);
						}, "json");
						swal("门禁状态切换成功", "门禁状态已经定位", "success");
					});
		}
	</script>


</body>

</html>