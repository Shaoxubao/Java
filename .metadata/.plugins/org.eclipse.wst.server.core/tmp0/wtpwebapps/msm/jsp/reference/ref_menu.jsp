<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后勤保障人员</title>

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

	    <div class="ny_zbbt"><span>后勤保障人员</span></div>

	    <div class="ny_zblb1">
		      <ul class="clearfix">
		      	<li>
			        <a class="cur" href="javascript:void(0)">后勤保障管理</a>
			        <ul style="display:block;">
			          <li><a href="<%=request.getContextPath()%>/support/addref" target="main">对照品注册</a></li>
			          <li><a href="<%=request.getContextPath()%>/samplem/deletesample" target="main">对照品删除</a></li>
			          <li><a href="<%=request.getContextPath()%>/samplem/update" target="main">修改对照品信息</a></li>
			          <li><a href="<%=request.getContextPath()%>/support/refs" target="main">查看对照品列表</a></li>
			          <li><a href="<%=request.getContextPath()%>/samplem/show" target="main">查询对照品信息</a></li>
			          <li><a href="<%=request.getContextPath()%>/support/rules" target="main">药监规章制度</a></li>
			        </ul>
		        </li>
		      </ul>
	    </div>
</body>
</html>