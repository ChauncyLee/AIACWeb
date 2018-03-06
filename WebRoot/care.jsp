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


    <title>智慧门禁 - 个人资料</title>
    <meta name="keywords" content="智慧门禁，简单生活">
    <meta name="description" content="智慧门禁采用人脸识别技术，简单你的生活">



    <link rel="shortcut icon" href="favicon.ico">
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">

    <link href="css/plugins/iCheck/custom.css" rel="stylesheet">

    <link href="css/plugins/chosen/chosen.css" rel="stylesheet">

    <link href="css/plugins/colorpicker/css/bootstrap-colorpicker.min.css" rel="stylesheet">

    <link href="css/plugins/cropper/cropper.min.css" rel="stylesheet">

    <link href="css/plugins/switchery/switchery.css" rel="stylesheet">

    <link href="css/plugins/jasny/jasny-bootstrap.min.css" rel="stylesheet">

    <link href="css/plugins/nouslider/jquery.nouislider.css" rel="stylesheet">

    <link href="css/plugins/datapicker/datepicker3.css" rel="stylesheet">

    <link href="css/plugins/ionRangeSlider/ion.rangeSlider.css" rel="stylesheet">
    <link href="css/plugins/ionRangeSlider/ion.rangeSlider.skinFlat.css" rel="stylesheet">

    <link href="css/plugins/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css" rel="stylesheet">

    <link href="css/plugins/clockpicker/clockpicker.css" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
  
    <link href="css/plugins/sweetalert/sweetalert.css" rel="stylesheet">


</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content">
        <div class="row animated fadeInRight">
            <div class="col-sm-4">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>住户信息</h5>
                    </div>
                    <div>
                        <div class="ibox-content no-padding border-left-right">
                            <img alt="image" class="img-responsive" src="img/profile_big.jpg">
                        </div>
                        <div class="ibox-content profile-content">
                            <span>
                                <strong>姓名</strong>
                            </span>
                            <span style="margin-left:20px;">杨金达</span>
                            <br>
                            <span>
                                <strong>性别</strong>
                            </span>
                            <span style="margin-left:20px;">男</span>
                            <br>
                            <span>
                                <strong>年龄</strong>
                            </span>
                            <span style="margin-left:20px;">18</span>
                            <br>
                            <span>
                                <strong>地址</strong>
                            </span>
                            <span style="margin-left:20px;">A1栋205室</span>
                            <br>
                            <span>
                                <strong>联系</strong>
                            </span>
                            <span style="margin-left:20px;">18115302787</span>
                            <br>
                            <span>
                                <strong>身份</strong>
                            </span>
                            <span style="margin-left:20px;">户主</span>
                            <br>
                            <span>
                                <strong>说明</strong>
                            </span>
                            <span style="margin-left:20px;">暂无</span>
                            <br>
                            <span>
                                <strong>一周</strong>
                            </span>
                            <div class="row m-t-lg">
                                <div class="col-sm-4">
                                    <span class="bar">5,3,9,6,5,9,7,3,5,2</span>
                                    <h5>
                                        <strong>29</strong> 进</h5>
                                </div>
                                <div class="col-sm-4">
                                    <span class="line">5,3,9,6,5,9,7,3,5,2</span>
                                    <h5>
                                        <strong>28</strong> 出</h5>
                                </div>
                                <div class="col-sm-4">
                                    <span class="bar">5,3,2,-1,-3,-2,2,3,5,2</span>
                                    <h5>
                                        <strong>57</strong> 总计</h5>
                                </div>
                            </div>
                            <div class="user-button">
                                <div class="row">
                                    <div class="col-sm-6">
                                        <button type="button" class="btn btn-default btn-sm btn-block">
                                            <i class="fa fa-coffee"></i> 删除住户</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <button type="button" class="btn btn-primary btn-sm btn-block">
                                            <i class="fa fa-envelope"></i>修改信息</button>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-8">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>进出情况</h5>
                        
                    </div>
                    <div class="ibox-content">

                        <div>
                                <div class="ibox float-e-margins" style="width:100%;">
                                        <div class="ibox-content" style="width:100%;">
                                            
                                            
                                            <div class="form-group" style="width:50%;float:left;">
                                                <label class="font-noraml">楼栋</label>
                                                <div class="input-group" style="position:relative;z-index:1000;">
                                                    <select data-placeholder="选择楼栋..." class="chosen-select" style="width:250px;position:relative;" tabindex="2">
                                                        <option value="">全部楼栋</option>
                                                        <option value="110000" hassubinfo="true">楼栋1</option>
                                                        <option value="120000" hassubinfo="true">楼栋2</option>
                                                        <option value="130000" hassubinfo="true">楼栋3</option>
                                                        <option value="140000" hassubinfo="true">楼栋4</option>
                                                        <option value="150000" hassubinfo="true">楼栋5</option>
                                                        <option value="210000" hassubinfo="true">楼栋6</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group" style="width:50%;float:left;">
                                                <label class="font-noraml">用户名</label>
                                                <div class="input-group">
                                                    <select data-placeholder="选择楼栋..." class="chosen-select" style="width:250px;" tabindex="2">
                                                        <option value="">全部住户</option>
                                                        <option value="110000" hassubinfo="true">杨金达</option>
                                                        <option value="120000" hassubinfo="true">李春桥</option>
                                                        <option value="130000" hassubinfo="true">曹凯博</option>
                                                        <option value="140000" hassubinfo="true">程湉湉</option>
                                                        <option value="150000" hassubinfo="true">吴培欣</option>
                                                        <option value="210000" hassubinfo="true">朱晓辉</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group" id="data_5" style="width:50%;float:left;">
                                                <label class="font-noraml">日期选择</label>
                                                <div class="input-daterange input-group" id="datepicker">
                                                    <input type="text" class="input-sm form-control" name="start" value="2018-01-01" />
                                                    <span class="input-group-addon">到</span>
                                                    <input type="text" class="input-sm form-control" name="end" value="2018-01-01" />
                                                </div>
                                            </div>
                                            <div class="form-group" style="width:50%;float:left;">
                                                <button type="button" class="btn btn-outline btn-primary" style="margin-top:20px;"id="haha">确定</button>
                                            </div>
                                            <div style="clear:both;"></div>
                                        </div>
                                    </div>
                                    <div class="row animated fadeInRight" >
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
                                                                </div>
                                                            </div>
                                                        </div>
                        
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                            <button class="btn btn-primary btn-block m">
                                <i class="fa fa-arrow-down"></i> 显示更多</button>

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
 <!-- Chosen -->
 <script src="js/plugins/chosen/chosen.jquery.js"></script>

 <!-- JSKnob -->
 <script src="js/plugins/jsKnob/jquery.knob.js"></script>

 <!-- Input Mask-->
 <script src="js/plugins/jasny/jasny-bootstrap.min.js"></script>

 <!-- Data picker -->
 <script src="js/plugins/datapicker/bootstrap-datepicker.js"></script>

 <!-- Prettyfile -->
 <script src="js/plugins/prettyfile/bootstrap-prettyfile.js"></script>


 <!-- Switchery -->
 <script src="js/plugins/switchery/switchery.js"></script>

 <!-- IonRangeSlider -->
 <script src="js/plugins/ionRangeSlider/ion.rangeSlider.min.js"></script>

 <!-- iCheck -->
 <script src="js/plugins/iCheck/icheck.min.js"></script>

 <!-- MENU -->
 <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

 <!-- Color picker -->
 <script src="js/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>

 <!-- Clock picker -->
 <script src="js/plugins/clockpicker/clockpicker.js"></script>

 <!-- Image cropper -->
 <script src="js/plugins/cropper/cropper.min.js"></script>

 <script src="js/demo/form-advanced-demo1.js"></script>
 
 <script src="js/plugins/sweetalert/sweetalert.min.js"></script>
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
     $('#haha').click(function () {
 swal({
     title: "您确定要按条件查询么？",
     text: "查询结果将于下面显示",
     type: "success",
     showCancelButton: true,
     confirmButtonColor: "#1ab394",
     confirmButtonText: "确定",
     closeOnConfirm: false
 }, function () {
     swal("查询成功！", "查询结果将在下面显示", "success");
 });
});


</script>

    <!-- Peity -->
    <script src="js/plugins/peity/jquery.peity.min.js"></script>

    <!-- Peity -->
    <script src="js/demo/peity-demo.js"></script>
</body>

</html>