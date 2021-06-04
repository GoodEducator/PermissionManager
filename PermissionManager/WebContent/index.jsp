<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="Designer" content="PremiumPixels.com">
<meta name="Author" content="$hekh@r d-Ziner, CSSJUNTION.com">
<link rel="stylesheet" type="text/css" href="./Simple Login Form_files/reset.css">
<link rel="stylesheet" type="text/css" href="./Simple Login Form_files/structure.css">
<title>Insert title here</title>
</head>
<body>
<form class="box login" action="login" method="post">
	<fieldset class="boxBody">
	  <label>Username</label>
	  <input type="text" tabindex="1" name="username">
	  <label><a class="rLink" tabindex="5">Forget your password?</a>Password</label>
	  <input type="password" tabindex="2" name="password">
	</fieldset>
	<footer>
<!--    <label><input type="checkbox" tabindex="3">Keep me logged in</label>-->	
	  <input type="submit" class="btnLogin" value="Login" tabindex="4">
	</footer>
</form>


</body>
</html>