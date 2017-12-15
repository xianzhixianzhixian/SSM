<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>SSM整合开发首页面</title>
	</head>
	<body>
		<form action="${pageContext.request.contextPath }/test/register.do" method="POST">
			姓名：<input type="text" name="name"/><br>
			年龄：<input type="text" name="age"/><br>
			<input type="submit" value="注册"/>
		</form>
	</body>
</html>