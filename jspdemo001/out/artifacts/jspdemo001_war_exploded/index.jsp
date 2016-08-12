<%@ page import="Demo.util.common" %><%--
  Created by IntelliJ IDEA.
  User: smq
  Date: 16/8/12
  Time: 下午2:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>DemoTitle</title>
  </head>
  <body>
 <h1> hello World!</h1>

<form name="fm001" action="/Web003" method="post">
  登录编码:
  <input type="text" name="first_name">
  <br>
  登录口令:
  <input type="text" name="second_name" >
  <br>
  <input type="submit" value="提交" />
</form>
 <hr><h3>当前时间:
  <%out.println(Demo.util.common.GetCurrentDateTime());%></h3>
  </body>
</html>
