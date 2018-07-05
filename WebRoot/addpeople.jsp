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

<%
	List<Building> list=new ArrayList<Building>();
	list=(List<Building>)request.getAttribute("list");
%>
</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight ">
		<div class="row ">
			<div class="col-sm-6" style="width:100%;">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>添加住户</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a> <a class="close-link"> <i class="fa fa-times"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content" style="min-height:500px">


						<form class="form-horizontal m-t" id="commentForm"
							action="servlet/AddPeople" method="post">
							<div class="form-group">
								<label class="col-sm-3 control-label">手机号：</label>
								<div class="col-sm-8">
									<input id="tel" name="tel" phonenum"" minlength="11"
										type="text" class="form-control" required=""
										aria-required="true">
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">姓名：</label>
								<div class="col-sm-8">
									<input id="name" name="name" minlength="" type="text"
										class="form-control" required="" aria-required="true">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">昵称：</label>
								<div class="col-sm-8">
									<input id="Uname" name="Uname" minlength="" type="text"
										class="form-control" required="" aria-required="true">
								</div>
								<span style="color:#F00" class="errorMsg" id="errorMsg"></span>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">性别：</label>
								<div class="col-sm-8">
									<select class="form-control" name="gender" id="gender">
										<option value="M">男</option>
										<option value="F">女</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">出生日期：</label>
								<div class="col-sm-8">
									<input id="dob" type="text" class="form-control" name="dob"
										required="" aria-required="true">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">角色：</label>
								<div class="col-sm-8">
									<select class="form-control" name="role" id="role">
										<option>请选择</option>
										<option value="H">户主</option>
										<option value="F">家庭成员</option>
										<option value="R">租户</option>
										<option value="V">访客</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">楼栋号：</label>
								<div class="col-sm-8">
									<select class="form-control" name="Bname" id="Bname">
										<option>请选择</option>
										<%
											for(int i=0;i<list.size();i++){
																												Building bd=new Building();
																												bd=list.get(i);
										%>
										<option value="<%=bd.getBid()%>" name="<%=bd.getBid()%>"><%=bd.getBname()%></option>
										<%
											}
										%>
									</select>
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">房间号：</label>
								<div class="col-sm-8">
									<select class="form-control" name="houseno" id="houseno">
									</select>
								</div>
							</div>
							<div id="screen"></div>




							<div class="form-group">
								<div class="col-sm-4 col-sm-offset-3">
									<button class="btn btn-primary" type="submit">下一步</button>
								</div>
							</div>
						</form>


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

		$(function() {
			$("#Bname")
					.change(
							function() {
								//获取select选择的信息
								var value = $("select:eq(2) option:selected")
										.val();
								//改变值时向StudentManagerServlet发送请求
								var url = "${pageContext.request.contextPath}/servlet/GetHouseByBid";
								//设置参数
								var params = {
									"Bid" : value
								};
								//发送请求
								$
										.post(
												url,
												params,
												function(workspaces) {
													$("#houseno").children()
															.remove();
													var $option = $("<option>请选择</option>");
													$("#houseno").append(
															$option);
													for (var i = 0; i < workspaces.length; i++) {
														var Haddr = workspaces[i].Haddr;
														var Hid = workspaces[i].Hid;
														$option = $("<option value='"+Hid+"'>"
																+ Haddr
																+ "</option>");
														$("#houseno").append(
																$option);
													}
												}, "json");
							})

		})

		$(function() {
			$("#Uname")
					.change(
							function() {
								//获取select选择的信息
								var value = $("#Uname").val();
								//改变值时向StudentManagerServlet发送请求
								var url = "${pageContext.request.contextPath}/servlet/GetUnameRe";
								//设置参数
								var params = {
									"uname" : value
								};
								//发送请求
								$.post(url, params, function(workspaces) {
									$("#errorMsg").text("");
									var msg = workspaces.message;
									$("#errorMsg").text(msg);

								}, "json");
							})

		})

		function setDivv() {
			var div = '<div class="form-group">'
					+ '<label class="col-sm-3 control-label">访问起始时间：</label>'
					+ '<div class="col-sm-8">'
					+ '<input id="vdate" type="text" class="form-control"'
										+'name="vdate" required="" aria-required="true">'
					+ '</div>'
					+ '</div>'
					+ '<div class="form-group">'
					+ '<label class="col-sm-3 control-label">访问结束时间：</label>'
					+ '<div class="col-sm-8">'
					+ '<input id="edate" type="text" class="form-control"'
										+'name="edate" required="" aria-required="true">'
					+ '</div>' + '</div>'
			return div
		}

		function setDivr() {
			var div = '<div class="form-group">'
					+ '<label class="col-sm-3 control-label">身份证号：</label>'
					+ '<div class="col-sm-8">'
					+ '<input id="idc" minlength="18" type="text" class="form-control"'
										+'name="idc" required="" aria-required="true">'
					+ '</div>'
					+ '</div>'
					+ '<div class="form-group">'
					+ '<label class="col-sm-3 control-label">密码：</label>'
					+ '<div class="col-sm-8">'
					+ '<input id="password" name="password" minlength="6"'
										+'type="password" class="form-control" required=""'
										+'aria-required="true">'
					+ '</div>' + '</div>'
			return div
		}

		$(function() {
			$("#role").change(function() {
				//获取select选择的信息
				var value = $("select:eq(1) option:selected").val();
				var html = '';
				if (value == 'V') {
					html += setDivv();
				} else if (value == 'H' || value == 'F' || value == 'R') {
					html += setDivr();
				}
				document.getElementById('screen').innerHTML = html;
			})

		})
	</script>
	<script src="js/plugins/webuploader/webuploader.min.js"></script>

	<script src="js/demo/webuploader-demo.js"></script>



</body>

</html>