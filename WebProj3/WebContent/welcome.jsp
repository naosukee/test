<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="utf-8"> 
<title>WELCOME</title> 
</head> 
<body> 
名前とパスワードを入力してください。 
<s:form method="post" action="LoginAction"> 
  <s:textfield name="username" label="ユーザー名" /> 
  <s:password name="password" label="パスワード" /> 
  <s:submit value="送信"/> 
</s:form> 
</body> 
=======
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>WELCOME</title>
</head>
<body>
名前とパスワードを入力してください。
<s:form method="post" action="LoginAction">
  <s:textfield name="username" label="ユーザー名" />
  <s:password name="password" label="パスワード" />
  <s:submit value="送信"/>
</s:form>
</body>
>>>>>>> 641accf1859d0ce9f4d092aa63acb4d5eda781a9
</html>