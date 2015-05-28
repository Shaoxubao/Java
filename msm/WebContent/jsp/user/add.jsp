<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户添加</title>
</head>
<body marginheight="30">
  <sf:form method="post" modelAttribute="user">
    <table width="400" align="center" border="1">
        <tr>
          <td>工&nbsp;号：</td><td><sf:input path="staffId"/><sf:errors path="staffId"/></td>
        </tr>
        <tr>
          <td>用户名：</td><td><sf:input path="userName"/><sf:errors path="userName"/></td>
        </tr>
        <tr>
          <td>密&nbsp;码：</td><td><sf:password path="password"/><sf:errors path="password"/></td>
        </tr>
        <tr>
          <td>部&nbsp;门：</td><td><sf:input path="userDepart"/><sf:errors path="userDepart"/></td>
        </tr>
        <tr>
          <td>职&nbsp;位：</td><td><sf:input path="userPosition"/><sf:errors path="userPosition"/></td>
        </tr>
        <tr>
          <td>电&nbsp;话：</td><td><sf:input path="telephone"/><sf:errors path="telephone"/></td>
        </tr>
      <tr>
        <td colspan="2">
          &nbsp;&nbsp;&nbsp;&nbsp;
          <input type="submit" name="add" value="用户添加"/>
          &nbsp;
          <input type="reset"  name="ret" value="用户重置"/>
        </td>
      </tr>
    </table>
  </sf:form>
</body>
</html>