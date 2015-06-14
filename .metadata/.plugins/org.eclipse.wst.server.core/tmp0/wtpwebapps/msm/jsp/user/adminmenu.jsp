<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员在线</title>

<script type="text/javascript" src="../../js/jquery.min.js"></script>
<link href="../../css/style.css" rel="stylesheet" type="text/css" />

</head>
<body bgcolor="＃E8E8FF">

<script type="text/javascript">
$(function () {
	$(".ny_zblb1 ul li").click(function(){
		var thisSpan=$(this);
		$(".ny_zblb1 ul li ul").prev("a").removeClass("cur");
		$("ul", this).prev("a").addClass("cur");
		$(this).children("ul").slideDown("fast");
		$(this).siblings().children("ul").slideUp("fast");
	})
});
</script>

 <div class="ny_zbbt"><span>管理员在线...</span></div>
  <div class="ny_zblb1">
    <ul class="clearfix">
      <li>
      	  <a class="cur" href="javascript:void(0)">用户管理</a>
	      <ul style="display:block;">
	        <li><a href="<%=request.getContextPath()%>/user/add" target="main">增加用户</a></li>
	        <li><a href="<%=request.getContextPath()%>/user/delete" target="main">删除用户</a></li>
	        <li><a href="<%=request.getContextPath()%>/user/update" target="main">修改用户个人信息</a></li>
	        <li><a href="<%=request.getContextPath()%>/user/users" target="main">查看所有用户列表</a></li>
	        <li><a href="<%=request.getContextPath()%>/user/show" target="main">查询用户个人信息</a></li>
	        <!-- <li><a href="<%=request.getContextPath()%>/user/show" target="main">修改用户个人密码</a></li>-->
	      </ul>
      </li>
	  <li>
	      <a class="cur" href="javascript:void(0)">检品管理</a>
	      <ul style="display:block;">
	        <li><a href="<%=request.getContextPath()%>/samplem/samples" target="main">查看所有检品</a></li>
	        <li><a href="<%=request.getContextPath()%>/samplem/unchecked" target="main">未检查检品列表</a></li>
	        <li><a href="<%=request.getContextPath()%>/samplem/checked" target="main">已检查检品列表</a></li>
	        <li><a href="<%=request.getContextPath()%>/samplem/checkpassed" target="main">已通过检查列表</a></li>
	        <li><a href="<%=request.getContextPath()%>/samplem/checkunpassed" target="main">未通过检查列表</a></li>
	      </ul>
	  </li>
      <li>
      	  <a class="cur" href="javascript:void(0)">检验流程</a>
	      <ul style="display:block;">
	      	<li><a href="<%=request.getContextPath()%>/samplem/sampleflow" target="main">检品检验流程查看</a></li>
	      </ul>
      </li>
    </ul>
  </div>

</body>
</html>