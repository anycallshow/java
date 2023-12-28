<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿 클래스로 폼정보 넘기기</title>
</head>
<body>
<form action="HelloServlet" method="post">
 이름 : <input type="text" name="Name"><br> 
 학번 : <input type="text" name="Number"><br> 
 대학 : <input type="text" name="Subuni"><br> 
 <input type="submit" value="확인"> 
 <input type="reset" value="취소">
</form>
</body>
</htm>