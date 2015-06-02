<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>检品检验结果提交</title>
</head>
<body bgcolor="#CCCC99">
    <div align="center">检验结果提交</div>
    <sf:form method="post" modelAttribute="sample">
        <table align="center" width="500" border="1">
            <tr>
                <td>检品编码:</td><td><sf:input path="sampleNo" /><sf:errors path="sampleNo"/></td>
            </tr>
            <tr>
                <td>检品名称：</td><td><sf:input path="sampleName" /><sf:errors path="sampleName"/></td>
            </tr>
            <tr>
                <td>检品种类：</td><td><sf:input path="sampleKind" /><sf:errors path="sampleKind"/></td>
            </tr>
            <tr>
                <td>主检科室:</td><td><sf:input path="mianSection" /><sf:errors path="mianSection"/></td>
            </tr>
            <tr>
                <td>会检科室:</td><td><sf:input path="secondSection" /><sf:errors path="secondSection"/></td>
            </tr>
            <tr>
                <td>生产单位:</td><td><sf:input path="produce" /><sf:errors path="produce"/></td>
            </tr>
            <tr>
                <td>检品规格:</td><td><sf:input path="specs" /><sf:errors path="specs"/></td>
            </tr>
            <tr>
                <td>检品数量:</td><td><sf:input path="amount" /><sf:errors path="amount"/></td>
            </tr>
            <tr>
                <td>是否被检:</td><td><sf:input path="isChecked" /><sf:errors path="isChecked"/></td>
            </tr>
            <tr>
                <td>是否通过:</td><td><sf:input path="isCheckPassed" /><sf:errors path="isCheckPassed"/></td>
            </tr>
            <tr>
                <td>收检日期:</td><td><sf:input path="receiveDate" /><sf:errors path="receiveDate"/></td>
            </tr>
            <tr>
                <td>报告日期:</td><td><sf:input path="conclusionDate" /><sf:errors path="conclusionDate"/></td>
            </tr>
            <tr>
              <td colspan="2">
                <input type="submit" value="结果提交"/>
              </td>
            </tr>
        </table>
    </sf:form>
</body>
</html>