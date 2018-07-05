<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="keywords" content="智慧门禁，简单生活">
    <meta name="description" content="智慧门禁采用人脸识别技术，简单你的生活">
    <title>添加信息</title>
    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/plugins/webuploader/webuploader.css">
    <link rel="stylesheet" type="text/css" href="css/demo/webuploader-demo.css">
    
</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight ">
        <div class="row ">
            <div class="col-sm-6" style="width:100%;;">
                <div class="ibox float-e-margins" >
                    <div class="ibox-title">
                        <h5>添加门禁</h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                           
                            
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content" style="min-height:500px">
                        <form class="form-horizontal m-t" id="commentForm" action="servlet/AddDoor" method="post"> 
                            <div class="form-group">
                            <span style="color:#F00" class="errorMsg" id="errorMsg"><%=request.getAttribute("msg") == null ? "" : request
					.getAttribute("msg")%> </span>
                                <label class="col-sm-3 control-label">门禁编号：</label>
                                <div class="col-sm-8">
                                    <input id="Dno" placeholder="填写数字编号（如：1）" name="Dno"  type="text" class="form-control" required="" aria-required="true">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">门禁方向：</label>
                                <div class="col-sm-8">
                                    <select class="form-control" name="Ddir" id="Ddir">
										<option>请选择</option>
										<option value="in">入口</option>
										<option value="out">出口</option>
									</select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">状态：</label>
                                <div class="col-sm-8">
                                    <input id="Dstatus" type="text" readonly="readonly" value="初始化为关闭" class="form-control" name="Dstatus" required="" aria-required="true">
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <div class="col-sm-4 col-sm-offset-3">
                                    <button class="btn btn-primary" type="submit">提交</button>
                                </div>
                                <span style="color:#F00" class="errorMsg" id="errorMsg"><%=request.getAttribute("result") == null ? "" : request
					.getAttribute("result")%> </span>
                            </div>
                        </form>
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

    <!-- jQuery Validation plugin javascript-->
    <script src="js/plugins/validate/jquery.validate.min.js"></script>
    <script src="js/plugins/validate/messages_zh.min.js"></script>

    <script src="js/demo/form-validate-demo.js"></script>

<!-- Web Uploader -->
	<script type="text/javascript">
		// 添加全局站点信息
		var BASE_URL = 'js/plugins/webuploader';

		$(function() {
			$("#Dno")
					.change(
							function() {
								//获取input的信息
								var value = $("#Dno").val();
								//改变值时向StudentManagerServlet发送请求
								var url = "${pageContext.request.contextPath}/servlet/IfDoorServlet";
								//设置参数
								var params = {
									"Dno" : value
								};
								//发送请求
								$.post(url, params, function(workspaces) {
								$("#errorMsg").text("");
									var msg = workspaces.message;
									$("#errorMsg").text(msg);
								}, "json");
							})

		})
	</script>






</body>

</html>