<%@ page language="java" import="java.util.*,ntu.cq.bean.Building"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
<title>使用webuploader上传</title>
<!-- 1.引入文件 -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/webuploader.css" rel="external nofollow" >
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/webuploader.js"></script>
</head>
<body>


 <!-- 2.创建页面元素 -->
 <div id="upload">
  <div id="filePicker">文件上传</div>
<span style="color:#F00" class="errorMsg">${flag }</span>
<span style="color:#F00" class="errorMsg">${id }</span>
 </div>
 <!-- 3.添加js代码 -->
 <script type="text/javascript">
  var uploader = WebUploader.create(
   {
    swf:"${pageContext.request.contextPath }/js/Uploader.swf",
    server:"${pageContext.request.contextPath }/FileUploadServlet",
    pick:"#filePicker",
    auto:true
   }  
  );
 </script>
</body>
</html>