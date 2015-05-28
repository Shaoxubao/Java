<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户个人信息</title>
</head>
<body marginheight="30">
  <sf:form method="post" modelAttribute="user">
      <table width="400" align="center" border="1">
          <tr>
            <td>请输入用户工号：</td><td><sf:input path="staffId"/><sf:errors path="staffId"/></td>
            <td><input type="submit" name="search" value="用户查询"/></td>
          </tr>
      </table>
   </sf:form>
</body>
</html>