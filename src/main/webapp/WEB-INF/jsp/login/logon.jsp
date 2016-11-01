<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>please logon</title>
</head>
<body>
    <div>
    ${command}
    </div>
	<div>
	 	<form action="logon" method="post">
	 		用戶名<input type="text" name="username" /> <br />
	 		密碼<input type="password" name="password" /> <br />
	 		<input type="submit" name="submit" />
	 	</form>
	</div> 
</body>
</html>