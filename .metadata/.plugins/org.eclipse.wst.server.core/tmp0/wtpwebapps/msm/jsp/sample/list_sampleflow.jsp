<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>检品检验流程</title>
</head>
<body bgcolor="#CCCC99">
    <div align="center">检品检验流程</div>
    <table width="1600" align="center" border="1">
      <tr>
        <td>检品编号</td><td>检品名称</td>
        <td>主检科室收到日期</td><td>主检科室发出日期</td>
        <td>会检科室收到日期</td><td>会检科室发出日期</td>
        <td>科室主任审校收到日期</td><td>科室主任审校发出日期</td>
        <td>业务管理室收到日期</td><td>业务管理室发出日期</td>
        <td>审签收到日期</td><td>审签发出日期</td>
        <td>最终检验报告收到日期</td><td>最终检验报告发出日期</td>
        <td>校对收到日期</td><td>校对发出日期</td>
        <td>打印收到日期</td><td> 打印发出日期</td>
      </tr>
      <c:if test="${pagers.total le 0 }">
        <tr>
          <td colspan="18">目前还没有用户数据</td>
        </tr>
      </c:if>

      <c:if test="${pagers.total gt 0 }">
          <c:forEach items="${pagers.datas }" var="s">
            <tr>
              <td>${s.sampleNo }</td>
              <td>${s.sampleName }</td>
              <td>${s.mianRev }</td>
              <td>${s.mianSend }</td>
              <td>${s.secondRev }</td>
              <td>${s.secondSend }</td>
              <td>${s.zhurenRev }</td>
              <td>${s.zhurenSend }</td>
              <td>${s.ywssqRev }</td>
              <td>${s.ywssqSend }</td>
              <td>${s.headRev }</td>
              <td>${s.headSend }</td>
              <td>${s.fachuRev }</td>
              <td>${s.fachuSend }</td>
              <td>${s.jiaoduiRev }</td>
              <td>${s.jiaoduiSend }</td>
              <td>${s.printRev }</td>
              <td>${s.printSend }</td>
            </tr>
          </c:forEach>
            <tr>
              <td colspan="18">
                <jsp:include page="/inc/pager.jsp">
                  <jsp:param value="samples" name="url"/>
                  <jsp:param value="${pagers.total }" name="items"/>
                </jsp:include>
              </td>
            </tr>
        </c:if>

    </table>

</body>
</html>