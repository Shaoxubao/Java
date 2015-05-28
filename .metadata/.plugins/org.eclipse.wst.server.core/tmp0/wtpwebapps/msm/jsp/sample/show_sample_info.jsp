<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>检品详细信息</title>
</head>
<body marginheight="100">
    <h1>检品[${sample.sampleName }]详细信息:</h1>
    <sf:form method="post" modelAttribute="sample">
        <table width="400" align="center" border="1">
            <tr>
              <td>检品编码：</td><td>${sample.sampleNo }</td>
            </tr>
             <tr>
              <td>检品名称：</td><td>${sample.sampleName }</td>
            </tr>
            <tr>
              <td>检品种类：</td><td>${sample.sampleKind }</td>
            </tr>
            <tr>
              <td>主检科室：</td><td>${sample.mianSection }</td>
            </tr>
            <tr>
              <td>会检科室：</td><td>${sample.secondSection }</td>
            </tr>
            <tr>
              <td>生产单位：</td><td>${sample.produce }</td>
            </tr>
            <tr>
              <td>检品规格：</td><td>${sample.specs }</td>
            </tr>
            <tr>
              <td>检品数量：</td><td>${sample.amount }</td>
            </tr>
            <tr>
              <td>是否被检：</td><td>${sample.isChecked }</td>
            </tr>
            <tr>
              <td>是否通过：</td><td>${sample.isCheckPassed }</td>
            </tr>
            <tr>
              <td>收检日期：</td><td>${sample.receiveDate }</td>
            </tr>
            <tr>
              <td>报告日期：</td><td>${sample.conclusionDate }</td>
            </tr>
        </table>
    </sf:form>
</body>
</html>