<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>对照品注册页面</title>
</head>
<body>
    <div align="center">对照品注册</div>
    <sf:form method="post" modelAttribute="referenceReg">
        <table align="center" width="500" border="1">
            <tr>
                <td>对照品编号：</td><td><sf:input path="referenNo" /><sf:errors path="referenNo"/></td>
            </tr>
            <tr>
                <td>对照品名称：</td><td><sf:input path="referenName" /><sf:errors path="referenName"/></td>
            </tr>
            <tr>
                <td>对照品规格:</td><td><sf:input path="referenSpecs" /><sf:errors path="referenSpecs"/></td>
            </tr>
            <tr>
                <td>对照品数量:</td><td><sf:input path="amount" /><sf:errors path="amount"/></td>
            </tr>
            <tr>
                <td>对照品来源:</td><td><sf:input path="source" /><sf:errors path="source"/></td>
            </tr>
            <tr>
                <td>接收者:</td><td><sf:input path="receiver" /><sf:errors path="receiver"/></td>
            </tr>
            <tr>
                <td>接收日期:</td><td><sf:input path="revceiveDate" /><sf:errors path="revceiveDate"/></td>
            </tr>
            <tr>
                <td>审核人:</td><td><sf:input path="checker" /><sf:errors path="checker"/></td>
            </tr>
            <tr>
                <td>审核日期:</td><td><sf:input path="checkDate" /><sf:errors path="checkDate"/></td>
            </tr>

            <tr>
              <td colspan="2">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" name="add" value="对照品添加"/>
                &nbsp;
                <input type="reset"  name="ret" value="对照品重置"/>
              </td>
            </tr>

        </table>
    </sf:form>
</body>
</html>