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

    <title>门禁管理</title>
    <meta name="keywords" content="智慧门禁，简单生活">
    <meta name="description" content="智慧门禁采用人脸识别技术，简单你的生活">

    <link rel="shortcut icon" href="favicon.ico">
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-4">
                <div class="ibox">
                    <div class="ibox-title">
                        <h5>
                            <a href="">一号楼</a>
                        </h5>
                    </div>
                    <div class="ibox-content">
                        <div class="team-members">
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a1.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a2.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a3.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a5.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                        </div>
                        <div>
                            <span>当前楼栋居住率</span>
                            <div class="stat-percent">48%</div>
                            <div class="progress progress-mini">
                                <div style="width: 48%;" class="progress-bar"></div>
                            </div>
                        </div>
                        <div class="row  m-t-sm">
                            <div class="col-sm-4">
                                <div class="font-bold">楼层数</div>
                                12
                            </div>
                            <div class="col-sm-4">
                                <div class="font-bold">住户数</div>
                                300
                            </div>
                            <div class="col-sm-4 text-right">
                                <div class="font-bold">访客数</div>
                                &yen;200,913
                            </div>
                        </div>

                    </div>
                </div>
                <div class="ibox">
                    <div class="ibox-title">
                        <h5>
                            <a href="">一号楼</a>
                        </h5>
                    </div>
                    <div class="ibox-content">
                        <div class="team-members">
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a1.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a2.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a3.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a5.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                        </div>
                        <div>
                            <span>当前楼栋居住率</span>
                            <div class="stat-percent">48%</div>
                            <div class="progress progress-mini">
                                <div style="width: 48%;" class="progress-bar"></div>
                            </div>
                        </div>
                        <div class="row  m-t-sm">
                            <div class="col-sm-4">
                                <div class="font-bold">楼层数</div>
                                12
                            </div>
                            <div class="col-sm-4">
                                <div class="font-bold">住户数</div>
                                300
                            </div>
                            <div class="col-sm-4 text-right">
                                <div class="font-bold">访客数</div>
                                &yen;200,913
                            </div>
                        </div>

                    </div>
                </div>
                <div class="ibox">
                    <div class="ibox-title">
                        <h5>
                            <a href="">一号楼</a>
                        </h5>
                    </div>
                    <div class="ibox-content">
                        <div class="team-members">
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a1.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a2.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a3.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a5.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                        </div>
                        <div>
                            <span>当前楼栋居住率</span>
                            <div class="stat-percent">48%</div>
                            <div class="progress progress-mini">
                                <div style="width: 48%;" class="progress-bar"></div>
                            </div>
                        </div>
                        <div class="row  m-t-sm">
                            <div class="col-sm-4">
                                <div class="font-bold">楼层数</div>
                                12
                            </div>
                            <div class="col-sm-4">
                                <div class="font-bold">住户数</div>
                                300
                            </div>
                            <div class="col-sm-4 text-right">
                                <div class="font-bold">访客数</div>
                                &yen;200,913
                            </div>
                        </div>

                    </div>
                </div>
                <div class="ibox">
                    <div class="ibox-title">
                        <h5>
                            <a href="">一号楼</a>
                        </h5>
                    </div>
                    <div class="ibox-content">
                        <div class="team-members">
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a1.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a2.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a3.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a5.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                        </div>
                        <div>
                            <span>当前楼栋居住率</span>
                            <div class="stat-percent">48%</div>
                            <div class="progress progress-mini">
                                <div style="width: 48%;" class="progress-bar"></div>
                            </div>
                        </div>
                        <div class="row  m-t-sm">
                            <div class="col-sm-4">
                                <div class="font-bold">楼层数</div>
                                12
                            </div>
                            <div class="col-sm-4">
                                <div class="font-bold">住户数</div>
                                300
                            </div>
                            <div class="col-sm-4 text-right">
                                <div class="font-bold">访客数</div>
                                &yen;200,913
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="ibox">
                    <div class="ibox-title">
                        <h5>
                            <a href="">一号楼</a>
                        </h5>
                    </div>
                    <div class="ibox-content">
                        <div class="team-members">
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a1.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a2.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a3.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a5.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                        </div>
                        <div>
                            <span>当前楼栋居住率</span>
                            <div class="stat-percent">48%</div>
                            <div class="progress progress-mini">
                                <div style="width: 48%;" class="progress-bar"></div>
                            </div>
                        </div>
                        <div class="row  m-t-sm">
                            <div class="col-sm-4">
                                <div class="font-bold">楼层数</div>
                                12
                            </div>
                            <div class="col-sm-4">
                                <div class="font-bold">住户数</div>
                                300
                            </div>
                            <div class="col-sm-4 text-right">
                                <div class="font-bold">访客数</div>
                                &yen;200,913
                            </div>
                        </div>

                    </div>
                </div>
                <div class="ibox">
                    <div class="ibox-title">
                        <h5>
                            <a href="">一号楼</a>
                        </h5>
                    </div>
                    <div class="ibox-content">
                        <div class="team-members">
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a1.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a2.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a3.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a5.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                        </div>
                        <div>
                            <span>当前楼栋居住率</span>
                            <div class="stat-percent">48%</div>
                            <div class="progress progress-mini">
                                <div style="width: 48%;" class="progress-bar"></div>
                            </div>
                        </div>
                        <div class="row  m-t-sm">
                            <div class="col-sm-4">
                                <div class="font-bold">楼层数</div>
                                12
                            </div>
                            <div class="col-sm-4">
                                <div class="font-bold">住户数</div>
                                300
                            </div>
                            <div class="col-sm-4 text-right">
                                <div class="font-bold">访客数</div>
                                &yen;200,913
                            </div>
                        </div>

                    </div>
                </div>
                <div class="ibox">
                    <div class="ibox-title">
                        <h5>
                            <a href="">一号楼</a>
                        </h5>
                    </div>
                    <div class="ibox-content">
                        <div class="team-members">
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a1.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a2.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a3.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a5.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                        </div>
                        <div>
                            <span>当前楼栋居住率</span>
                            <div class="stat-percent">48%</div>
                            <div class="progress progress-mini">
                                <div style="width: 48%;" class="progress-bar"></div>
                            </div>
                        </div>
                        <div class="row  m-t-sm">
                            <div class="col-sm-4">
                                <div class="font-bold">楼层数</div>
                                12
                            </div>
                            <div class="col-sm-4">
                                <div class="font-bold">住户数</div>
                                300
                            </div>
                            <div class="col-sm-4 text-right">
                                <div class="font-bold">访客数</div>
                                &yen;200,913
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="ibox">
                    <div class="ibox-title">
                        <h5>
                            <a href="">一号楼</a>
                        </h5>
                    </div>
                    <div class="ibox-content">
                        <div class="team-members">
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a1.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a2.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a3.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a5.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                        </div>
                        <div>
                            <span>当前楼栋居住率</span>
                            <div class="stat-percent">48%</div>
                            <div class="progress progress-mini">
                                <div style="width: 48%;" class="progress-bar"></div>
                            </div>
                        </div>
                        <div class="row  m-t-sm">
                            <div class="col-sm-4">
                                <div class="font-bold">楼层数</div>
                                12
                            </div>
                            <div class="col-sm-4">
                                <div class="font-bold">住户数</div>
                                300
                            </div>
                            <div class="col-sm-4 text-right">
                                <div class="font-bold">访客数</div>
                                &yen;200,913
                            </div>
                        </div>

                    </div>
                </div>
                <div class="ibox">
                    <div class="ibox-title">
                        <h5>
                            <a href="">一号楼</a>
                        </h5>
                    </div>
                    <div class="ibox-content">
                        <div class="team-members">
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a1.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a2.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a3.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a5.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                        </div>
                        <div>
                            <span>当前楼栋居住率</span>
                            <div class="stat-percent">48%</div>
                            <div class="progress progress-mini">
                                <div style="width: 48%;" class="progress-bar"></div>
                            </div>
                        </div>
                        <div class="row  m-t-sm">
                            <div class="col-sm-4">
                                <div class="font-bold">楼层数</div>
                                12
                            </div>
                            <div class="col-sm-4">
                                <div class="font-bold">住户数</div>
                                300
                            </div>
                            <div class="col-sm-4 text-right">
                                <div class="font-bold">访客数</div>
                                &yen;200,913
                            </div>
                        </div>

                    </div>
                </div>
                <div class="ibox">
                    <div class="ibox-title">
                        <h5>
                            <a href="">一号楼</a>
                        </h5>
                    </div>
                    <div class="ibox-content">
                        <div class="team-members">
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a1.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a2.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a3.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a5.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                            <a href="#">
                                <img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                        </div>
                        <div>
                            <span>当前楼栋居住率</span>
                            <div class="stat-percent">48%</div>
                            <div class="progress progress-mini">
                                <div style="width: 48%;" class="progress-bar"></div>
                            </div>
                        </div>
                        <div class="row  m-t-sm">
                            <div class="col-sm-4">
                                <div class="font-bold">楼层数</div>
                                12
                            </div>
                            <div class="col-sm-4">
                                <div class="font-bold">住户数</div>
                                300
                            </div>
                            <div class="col-sm-4 text-right">
                                <div class="font-bold">访客数</div>
                                &yen;200,913
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="contact-box">
                    <div style="height:99px;">
                        <p class="my_add">
                            <a href="">
                                添加门禁
                            </a>
                        </p>
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



</body>

</html>