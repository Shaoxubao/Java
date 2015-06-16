<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>报告列表</title>
</head>
<body bgcolor="#CCCC99">
    <div align="center">报告列表</div>
    <table width="1300" align="center" border="1">
      <tr>
        <td>检品编号</td><td>检品名称</td><td>检品规格</td>
        <td>检品数量</td><td>检品来源</td><td>是否被检</td>
        <td>是否合格</td><td>检验人</td><td>检验日期</td>
      </tr>
      <c:if test="${pagers.total le 0 }">
        <tr>
          <td colspan="9">目前还没有报告数据</td>
        </tr>
      </c:if>

      <c:if test="${pagers.total gt 0 }">
          <c:forEach items="${pagers.datas }" var="s">
            <tr>
              <td>${s.sampleNo }</td>
              <td>${s.sampleName }</td>
              <td>${s.sampleSpecs }</td>
              <td>${s.amount }</td>
              <td>${s.source }</td>
              <td>${s.isChecked }</td>
              <td>${s.isStandard }</td>
              <td>${s.checker }</td>
              <td>${s.checkDate }</td>
            </tr>
          </c:forEach>
            <tr>
              <td colspan="9">
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