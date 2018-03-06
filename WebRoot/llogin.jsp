<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	  <script type="text/javascript" src="js/jquery.min.js"></script>  
	    <script type="text/javascript">  
    function upload(){  
        $.ajax({  
            type: "POST",  
            url: "servlet/LoginServlet",  
            data: $('#form').serialize(),  
            success: function(data){    
                    var da = eval("("+data+")");
                    if(da.message=="error"){
                    	alert("您输入的用户名密码有误，请重新输入。");
                    }else if(da.message=="ok"){
                    	/* window.location.href = "./index.html";//跳转到主页 */
                    }
            }  
        })  
    }  
    </script>  
  </head>
  
  <body>
     <form id="form">  
        UserName:<input type="text" name="username" id="username">  
        PassWord:<input type="password" name="password" id="password">  
        <button type="button" onclick="upload()">提交</button>  
    </form>  
  </body>
</html>
