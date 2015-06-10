<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>检品检验流程表</title>
</head>
<body bgcolor="#CCCC99">
    <div align="center">检品检验流程表</div>
    <sf:form method="post" modelAttribute="sampleFlow">
        <table align="center" width="600" border="1">
            <tr>
                <td>检品编码:</td><td><sf:input path="sampleNo" /><sf:errors path="sampleNo"/></td>
            </tr>
            <tr>
                <td>检品名称：</td><td><sf:input path="sampleName" /><sf:errors path="sampleName"/></td>
            </tr>
            <tr>
                <td>主检科室收到日期：</td><td><sf:input path="mianRev" /><sf:errors path="mianRev"/></td>
            </tr>
            <tr>
                <td>主检科室发出日期:</td><td><sf:input path="mianSend" /><sf:errors path="mianSend"/></td>
            </tr>
            <tr>
                <td>会检科室收到日期:</td><td><sf:input path="secondRev" /><sf:errors path="secondRev"/></td>
            </tr>
            <tr>
                <td>会检科室发出日期:</td><td><sf:input path="secondSend" /><sf:errors path="secondSend"/></td>
            </tr>
            <tr>
                <td>科室主任审校收到日期:</td><td><sf:input path="zhurenRev" /><sf:errors path="zhurenRev"/></td>
            </tr>
            <tr>
                <td>科室主任审校发出日期:</td><td><sf:input path="zhurenSend" /><sf:errors path="zhurenSend"/></td>
            </tr>
            <tr>
                <td>业务管理室审签收到日期:</td><td><sf:input path="ywssqRev" /><sf:errors path="ywssqRev"/></td>
            </tr>
            <tr>
                <td>业务管理室审签发出日期:</td><td><sf:input path="ywssqSend" /><sf:errors path="ywssqSend"/></td>
            </tr>
            <tr>
                <td>受权签字人审签收到日期:</td><td><sf:input path="headRev" /><sf:errors path="headRev"/></td>
            </tr>
            <tr>
                <td>受权签字人审签发出日期:</td><td><sf:input path="headSend" /><sf:errors path="headSend"/></td>
            </tr>
             <tr>
                <td>校对收到日期:</td><td><sf:input path="jiaoduiRev" /><sf:errors path="jiaoduiRev"/></td>
            </tr>
            <tr>
                <td>校对发出日期:</td><td><sf:input path="jiaoduiSend" /><sf:errors path="jiaoduiSend"/></td>
            </tr>
             <tr>
                <td>最终检验报告收到日期:</td><td><sf:input path="fachuRev" /><sf:errors path="fachuRev"/></td>
            </tr>
            <tr>
                <td>最终检验报告发出日期:</td><td><sf:input path="fachuSend" /><sf:errors path="fachuSend"/></td>
            </tr>
             <tr>
                <td>打印收到日期:</td><td><sf:input path="printRev" /><sf:errors path="printRev"/></td>
            </tr>
            <tr>
                <td>打印发出日期:</td><td><sf:input path="printSend" /><sf:errors path="printSend"/></td>
            </tr>

            <tr>
              <td colspan="2">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" name="add" value="检品检验流程提交"/>
              </td>
            </tr>

        </table>
    </sf:form>
</body>
</html>