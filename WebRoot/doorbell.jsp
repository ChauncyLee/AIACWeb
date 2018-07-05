<%@ page language="java" import="java.util.*,ntu.cq.bean.House"
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
<%
	List<House> list = new ArrayList<House>();
	list = (ArrayList<House>) request.getAttribute("list");
	String status = "";
%>
</head>

<body class="gray-bg">
	<div class="row wrapper wrapper-content animated fadeInRight">
		<div class="col-sm-4" style="width:100%;">
			<div class="ibox float-e-margins">
				<div class="ibox-title">
					<h5>门牌号信息</h5>

				</div>
				<div class="ibox-content">
					<p>绿色为有住户，灰色为无人居住，黄色为出租，红色为有未上传照片人员</p>

					<!-- U-btn-default：灰色；L-btn-primary：绿色；R-btn-warning：黄色 ； btn-danger：红色-->
					<p>
						<%
							for (int i = 0; i < list.size(); i++) {
								House house = list.get(i);
								if (house.getHstatus().equals("L")) {
								if(i==3)
									status = "btn-danger";
									else
									status = "btn-primary";
								} else if (house.getHstatus().equals("U")) {
									status = "btn-default";
								} else if (house.getHstatus().equals("R")) {
									status = "btn-warning";
								}
						%>
						<button type="button" class="btn btn-w-m <%=status%>"
							onclick="<%=house.getHstatus().equals("U") ? ""
						: "javascrtpt:window.location.href='servlet/ViewResidentServlet?hid="
								+ String.valueOf(house.getHid()) + "&flag=db"%>'">
							<%=house.getHaddr()%>
						</button>
						<%
							}
						%>
					</p>
				</div>
			</div>
		</div>
		

	</div>

	<!-- 全局js -->
	<script src="js/jquery.min.js?v=2.1.4"></script>
	<script src="js/bootstrap.min.js?v=3.3.6"></script>



	<!-- 自定义js -->
	<script src="js/content.js?v=1.0.0"></script>



	<script type="text/javascript"
		src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
	<!--统计代码，可删除-->

</body>
</html>