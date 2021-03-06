<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>检验报告注册页面</title>
</head>
<body bgcolor="#CCCC99">
    <div align="center">检验报告注册</div>
    <sf:form method="post" modelAttribute="reportResult">
        <table align="center" width="500" border="1">
            <tr>
                <td>检品编码:</td><td><sf:input path="sampleNo" /><sf:errors path="sampleNo"/></td>
            </tr>
            <tr>
                <td>检品名称：</td><td><sf:input path="sampleName" /><sf:errors path="sampleName"/></td>
            </tr>
            <tr>
                <td>检品规格：</td><td><sf:input path="sampleSpecs" /><sf:errors path="sampleSpecs"/></td>
            </tr>
            <tr>
                <td>检品数量:</td><td><sf:input path="amount" /><sf:errors path="amount"/></td>
            </tr>
            <tr>
                <td>检品来源:</td><td><sf:input path="source" /><sf:errors path="source"/></td>
            </tr>
            <tr>
                <td>是否被检:</td><td><sf:input path="isChecked" /><sf:errors path="isChecked"/></td>
            </tr>
            <tr>
                <td>是否合格:</td><td><sf:input path="isStandard" /><sf:errors path="isStandard"/></td>
            </tr>
            <tr>
                <td>检验人:</td><td><sf:input path="checker" /><sf:errors path="checker"/></td>
            </tr>
            <tr>
                <td>检验日期:</td><td><sf:input path="checkDate" /><sf:errors path="checkDate"/></td>
            </tr>

            <tr>
              <td colspan="2">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" name="add" value="报告注册"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset"  name="ret" value="报告重置"/>
              </td>
            </tr>

        </table>
    </sf:form>
</body>
</html>