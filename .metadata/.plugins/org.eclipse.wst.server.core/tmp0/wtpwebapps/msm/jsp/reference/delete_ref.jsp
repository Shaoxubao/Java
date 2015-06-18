<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>对照品列表</title>
</head>
<body bgcolor="#CCCC99">
    <div align="center">对照品列表</div>
    <table width="1300" align="center" border="1">
      <tr>
        <td>对照品编号</td><td>对照品名称</td><td>对照品规格</td>
        <td>对照品数量</td><td>对照品来源</td><td>接收者</td>
        <td>接收日期</td><td>审核人</td><td>审核日期</td><td>操作</td><td>选择</td>
      </tr>
      <c:if test="${pagers.total le 0 }">
        <tr>
          <td colspan="11">目前还没有用户数据</td>
        </tr>
      </c:if>

      <c:if test="${pagers.total gt 0 }">
          <c:forEach items="${pagers.datas }" var="s">
            <tr>
              <td>${s.referenNo }</td>
              <td>${s.referenName }</td>
              <td>${s.referenSpecs }</td>
              <td>${s.amount }</td>
              <td>${s.source }</td>
              <td>${s.receiver }</td>
              <td>${s.revceiveDate }</td>
              <td>${s.checker }</td>
              <td>${s.checkDate }</td>
              <td><a href="${s.referenNo }/delete">删除</a></td>
              <td><input name="bankList" type="checkbox" value="<c:out value='${s.referenNo}' />" /> </td>
            </tr>
          </c:forEach>

            <tr>
              <td colspan="11" align="right">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" name="add" value="对照品删除"/>
              </td>
            </tr>

            <tr>
              <td colspan="11">
                <jsp:include page="/inc/pager.jsp">
                  <jsp:param value="refs" name="url"/>
                  <jsp:param value="${pagers.total }" name="items"/>
                </jsp:include>
              </td>
            </tr>
        </c:if>

    </table>

</body>
</html>