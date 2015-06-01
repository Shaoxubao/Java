<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>检品检验人员</title>
</head>
<body bgcolor="＃E8E8FF">
    <h1>检品检验人员在线...</h1>
    <div>
      <ul>
        <li>检品检验管理</li>
        <ul>
          <li><a href="<%=request.getContextPath()%>/samplem/show" target="main">检品信息</a></li>
          <li><a href="<%=request.getContextPath()%>/samplem/deletesample" target="main">检品标准</a></li>
          <li><a href="<%=request.getContextPath()%>/reference/list_ref" target="main">对照品信息</a></li>
          <li><a href="<%=request.getContextPath()%>/check/commit" target="main">检验记录提交</a></li>
        </ul>
      </ul>
    </div>
</body>
</html>