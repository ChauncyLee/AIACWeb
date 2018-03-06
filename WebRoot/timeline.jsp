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

</head>

<body class="gray-bg">
    <div class="row">
        <div class="col-sm-12">
            <div class="wrapper wrapper-content">
                <div class="row animated fadeInRight">
                    <div class="col-sm-12">
                        <div class="ibox float-e-margins">

                            <div class="" id="ibox-content">

                                <div id="vertical-timeline" class="vertical-container light-timeline">
                                    <div class="vertical-timeline-block">
                                        <div class="vertical-timeline-icon navy-bg">
                                            <i class="fa fa-briefcase"></i>
                                        </div>

                                        <div class="vertical-timeline-content">
                                            <h2>进入</h2>
                                            <span>上午</span>
                                            <span>08：30</span>，住户
                                            <span>杨金达</span>于门禁
                                            <span>4</span>处进入小区
                                            </span>
                                            <a href="#" class="btn btn-sm btn-primary my_top"> 更多信息</a>
                                            <!-- <span class="vertical-date">
                                        今天 <br>
                                        <small>2月3日</small>
                                    </span> -->
                                        </div>
                                    </div>

                                    <div class="vertical-timeline-block">
                                        <div class="vertical-timeline-icon blue-bg">
                                            <i class="fa fa-file-text"></i>
                                        </div>

                                        <div class="vertical-timeline-content">
                                            <h2>离开</h2>
                                            <span>上午</span>
                                            <span>08：30</span>，住户
                                            <span>杨金达</span>于门禁
                                            <span>4</span>处进入小区
                                            </span>
                                            <a href="#" class="btn btn-sm btn-primary my_top"> 更多信息</a>

                                        </div>
                                    </div>

                                    <div class="vertical-timeline-block">
                                        <div class="vertical-timeline-icon lazur-bg">
                                            <i class="fa fa-coffee"></i>
                                        </div>

                                        <div class="vertical-timeline-content">
                                            <h2>离开</h2>
                                            <span>上午</span>
                                            <span>08：30</span>，住户
                                            <span>杨金达</span>于门禁
                                            <span>4</span>处进入小区
                                            </span>
                                            <a href="#" class="btn btn-sm btn-primary my_top"> 更多信息</a>
                                        </div>
                                    </div>

                                    <div class="vertical-timeline-block">
                                        <div class="vertical-timeline-icon yellow-bg">
                                            <i class="fa fa-phone"></i>
                                        </div>

                                        <div class="vertical-timeline-content">
                                            <h2>离开</h2>
                                            <span>上午</span>
                                            <span>08：30</span>，住户
                                            <span>杨金达</span>于门禁
                                            <span>4</span>处进入小区
                                            </span>
                                            <a href="#" class="btn btn-sm btn-primary my_top"> 更多信息</a>
                                        </div>
                                    </div>

                                    <div class="vertical-timeline-block">
                                        <div class="vertical-timeline-icon lazur-bg">
                                            <i class="fa fa-user-md"></i>
                                        </div>

                                        <div class="vertical-timeline-content">
                                            <h2>离开</h2>
                                            <span>上午</span>
                                            <span>08：30</span>，住户
                                            <span>杨金达</span>于门禁
                                            <span>4</span>处进入小区
                                            </span>
                                            <a href="#" class="btn btn-sm btn-primary my_top"> 更多信息</a>
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


    <script>
        $(document).ready(function () {

            // Local script for demo purpose only
            $('#lightVersion').click(function (event) {
                event.preventDefault()
                $('#ibox-content').removeClass('ibox-content');
                $('#vertical-timeline').removeClass('dark-timeline');
                $('#vertical-timeline').addClass('light-timeline');
            });

            $('#darkVersion').click(function (event) {
                event.preventDefault()
                $('#ibox-content').addClass('ibox-content');
                $('#vertical-timeline').removeClass('light-timeline');
                $('#vertical-timeline').addClass('dark-timeline');
            });

            $('#leftVersion').click(function (event) {
                event.preventDefault()
                $('#vertical-timeline').toggleClass('center-orientation');
            });


        });
    </script>

    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
    <!--统计代码，可删除-->
</body>

</html>