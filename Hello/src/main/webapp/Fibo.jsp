<%@ page import="java.io.*,java.util.*" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.IOException" %>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Fibonacci Sum</title>
</head>
<body>

<%!
		public int Fi(int en) {
		    if (en == 0) {
		        return 0;
		    } else if(en == 1){ 
		    	return 1;
		    } else{
		        return Fi(en - 1) + Fi(en - 2);
		    }
		}
%>

<%		
		long sum = 0;

%>
	
    <p>1���� 100������ �Ǻ���ġ ������ ��: <%= sum %></p>

</body>
</html>