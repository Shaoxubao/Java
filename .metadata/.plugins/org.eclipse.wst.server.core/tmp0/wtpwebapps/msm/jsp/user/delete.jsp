<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
  <table width="700" align="center" border="1">
    <tr>
      <td>用户工号</td><td>用户姓名</td><td>用户密码</td>
      <td>用户部门</td><td>用户职位</td><td>用户电话</td><td>操作</td>
    </tr>
    <c:if test="${pagers.total le 0 }">
      <tr>
        <td colspan="7">目前还没有用户数据</td>
      </tr>
    </c:if>
    <c:if test="${pagers.total gt 0 }">
      <c:forEach items="${pagers.datas }" var="u">
        <tr>
          <td>${u.staffId }</td>
          <td>${u.userName }</td>
          <td>${u.password }</td>
          <td>${u.userDepart }</td>
          <td>${u.userPosition }</td>
          <td>${u.telephone }</td>
          <td><a href="${u.staffId }/delete">删除</a></td>
        </tr>
    </c:forEach>
      <tr>
        <td colspan="7">
          <jsp:include page="/inc/pager.jsp">
            <jsp:param value="users" name="url"/>
            <jsp:param value="${pagers.total }" name="items"/>
          </jsp:include>
        </td>
      </tr>
    </c:if>
  </table>
  
</body>
</html>