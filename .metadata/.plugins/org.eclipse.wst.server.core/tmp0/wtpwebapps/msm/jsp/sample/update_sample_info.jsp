<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>检品更新</title>
</head>
<body bgcolor="#CCCC99">
    <div align="center">检品更新</div>
    <table width="1300" align="center" border="1">
      <tr>
        <td>检品编号</td><td>检品名称</td><td>检品种类</td>
        <td>主检科室</td><td>会检科室</td><td>生产单位</td>
        <td>检品规格</td><td>检品数量</td><td>是否被检</td>
        <td>是否通过</td><td>收检日期</td><td>报告日期</td><td>更新</td>
      </tr>
      <c:if test="${pagers.total le 0 }">
        <tr>
          <td colspan="13">目前还没有用户数据</td>
        </tr>
      </c:if>

      <c:if test="${pagers.total gt 0 }">
          <c:forEach items="${pagers.datas }" var="s">
            <tr>
              <td>${s.sampleNo }</td>
              <td>${s.sampleName }</td>
              <td>${s.sampleKind }</td>
              <td>${s.mianSection }</td>
              <td>${s.secondSection }</td>
              <td>${s.produce }</td>
              <td>${s.specs }</td>
              <td>${s.amount }</td>
              <td>${s.isChecked }</td>
              <td>${s.isCheckPassed }</td>
              <td>${s.receiveDate }</td>
              <td>${s.conclusionDate }</td>
              <td><a href="${s.sampleNo }/update">更新</a></td>
            </tr>
          </c:forEach>
            <tr>
              <td colspan="13">
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