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
                <td>检品编码:</td><td>${sampleFlow.sampleNo}<sf:hidden path="sampleNo"/></td>
            </tr>
            <tr>
                <td>检品名称：</td><td>${sampleFlow.sampleName }<sf:hidden path="sampleName"/></td>
            </tr>
            <tr>
                <td>主检科室收到日期：</td><td>${sampleFlow.mianRev}<sf:hidden path="mianRev"/></td>
            </tr>
            <tr>
                <td>主检科室发出日期:</td><td>${sampleFlow.mianSend}<sf:hidden path="mianSend"/></td>
            </tr>
            <tr>
                <td>会检科室收到日期:</td><td>${sampleFlow.secondRev}<sf:hidden path="secondRev"/></td>
            </tr>
            <tr>
                <td>会检科室发出日期:</td><td>${sampleFlow.secondSend}<sf:hidden path="secondSend"/></td>
            </tr>
            <tr>
                <td>科室主任审校收到日期:</td><td>${sampleFlow.zhurenRev}<sf:hidden path="zhurenRev"/></td>
            </tr>
            <tr>
                <td>科室主任审校发出日期:</td><td>${sampleFlow.zhurenSend}<sf:hidden path="zhurenSend"/></td>
            </tr>
            <tr>
                <td>业务管理室收到日期:</td><td>${sampleFlow.ywssqRev}<sf:hidden path="ywssqRev"/></td>
            </tr>
            <tr>
                <td>业务管理室发出日期:</td><td>${sampleFlow.ywssqSend}<sf:hidden path="ywssqSend"/></td>
            </tr>
            <tr>
                <td>审签收到日期:</td><td><sf:input path="headRev"/><sf:errors path="headRev"/></td>
            </tr>
            <tr>
                <td>审签发出日期:</td><td><sf:input path="headSend"/><sf:errors path="headSend"/></td>
            </tr>
             <tr>
                <td>校对收到日期:</td><td>${sampleFlow.jiaoduiRev}<sf:hidden path="jiaoduiRev"/></td>
            </tr>
            <tr>
                <td>校对发出日期:</td><td>${sampleFlow.jiaoduiSend}<sf:hidden path="jiaoduiSend"/></td>
            </tr>
             <tr>
                <td>最终检验收到日期:</td><td>${sampleFlow.fachuRev}<sf:hidden path="fachuRev"/></td>
            </tr>
            <tr>
                <td>最终检验发出日期:</td><td>${sampleFlow.fachuSend}<sf:hidden path="fachuSend"/></td>
            </tr>
             <tr>
                <td>打印收到日期:</td><td>${sampleFlow.printRev}<sf:hidden path="printRev"/></td>
            </tr>
            <tr>
                <td>打印发出日期:</td><td>${sampleFlow.printSend}<sf:hidden path="printSend"/></td>
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