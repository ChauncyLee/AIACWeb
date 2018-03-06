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

    <title>智慧门禁 - 审核清单</title>
    <meta name="keywords" content="智慧门禁，简单生活">
    <meta name="description" content="智慧门禁采用人脸识别技术，简单你的生活">

    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content  animated fadeInRight">
        <div class="row">
            <div class="col-sm-4">
                <div class="ibox">
                    <div class="ibox-content">
                        <h3>待审核住户</h3>
                        <p class="small"><i class="fa fa-hand-o-up"></i> 在列表之间拖动任务面板</p>
                        <ul class="sortable-list connectList agile-list">
                            <li class="warning-element">
                                A1栋222室杨金达住户提出申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2017.9.8
                                </div>
                            </li>
                            <li class="success-element">
                                A2栋302室李春桥住户提出申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2015.05.12
                                </div>
                            </li>
                            <li class="info-element">
                                A3栋205室程湉湉住户提出申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2015.09.10
                                </div>
                            </li>
                            <li class="danger-element">
                                A4栋111室吴培兴住户提出申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2015.06.10
                                </div>
                            </li>
                            <li class="warning-element">
                                A5栋444室戴清杨住户提出申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2015.09.09
                                </div>
                            </li>
                            <li class="info-element">
                                A6栋221室曹凯博住户提出申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2015.09.10
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="ibox">
                    <div class="ibox-content">
                        <h3>待审核访客</h3>
                        <p class="small"><i class="fa fa-hand-o-up"></i> 在列表之间拖动任务面板</p>
                        <ul class="sortable-list connectList agile-list">
                            <li class="success-element">
                                A1栋222室杨金达住户提出访客yjd申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2015.09.01
                                </div>
                            </li>
                            <li class="success-element">
                                A2栋302室李春桥住户提出访客lcq申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2015.05.12
                                </div>
                            </li>
                            <li class="warning-element">
                                A3栋205室程湉湉住户提出访客ctt申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2015.09.10
                                </div>
                            </li>
                            <li class="warning-element">
                                A4栋111室吴培兴住户提出访客wpx申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2015.09.09
                                </div>
                            </li>
                            <li class="info-element">
                                A5栋444室戴清杨住户提出访客dqy申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2015.08.04
                                </div>
                            </li>
                            <li class="success-element">
                                A6栋221室曹凯博住户提出访客曹凯博申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2015.05.12
                                </div>
                            </li>
                            <li class="danger-element">
                                A7栋221室范星月住户提出访客fxy申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <a href="#" class="pull-right btn btn-xs btn-primary" style="margin-right:10px;">确定</a>
                                    <i class="fa fa-clock-o"></i> 2015.11.04
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="ibox">
                    <div class="ibox-content">
                        <h3>已审核</h3>
                        <p class="small"><i class="fa fa-hand-o-up"></i> 在列表之间拖动任务面板</p>
                        <ul class="sortable-list connectList agile-list">
                            <li class="warning-element">
                                A1栋222室杨金达住户提出申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <i class="fa fa-clock-o"></i> 2017.9.8
                                </div>
                            </li>
                            <li class="success-element">
                                A2栋302室李春桥住户提出申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <i class="fa fa-clock-o"></i> 2015.05.12
                                </div>
                            </li>
                            <li class="info-element">
                                A3栋205室程湉湉住户提出申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <i class="fa fa-clock-o"></i> 2015.09.10
                                </div>
                            </li>
                            <li class="danger-element">
                                A4栋111室吴培兴住户提出申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <i class="fa fa-clock-o"></i> 2015.06.10
                                </div>
                            </li>
                            <li class="warning-element">
                                A5栋444室戴清杨住户提出申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <i class="fa fa-clock-o"></i> 2015.09.09
                                </div>
                            </li>
                            <li class="info-element">
                                A6栋221室曹凯博住户提出申请
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">详情</a>
                                    <i class="fa fa-clock-o"></i> 2015.09.10
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

        </div>


    </div>

    <!-- 全局js -->
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.6"></script>
    <script src="js/jquery-ui-1.10.4.min.js"></script>

    <!-- 自定义js -->
    <script src="js/content.js?v=1.0.0"></script>

    <script>
        $(document).ready(function () {
            $(".sortable-list").sortable({
                connectWith: ".connectList"
            }).disableSelection();

        });
    </script>

   

</body>

</html>
