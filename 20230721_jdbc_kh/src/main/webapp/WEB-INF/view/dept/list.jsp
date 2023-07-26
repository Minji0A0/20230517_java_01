<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 등록</title>
</head>
<body>
	<h2>학생 등록</h2>
	<div class="container">
	<!-- <a href="%requesdt.getContextPath() %> /student/insert"> 학생등록</a> -->
<!-- 	</div>
	<div> -->
	<form action="<%=request.getContextPath() %>/student/insert.do" method="get">
	<table>
	<tr>
	<th>학생번호</th>
	<td><input type="text" name="studentNo"></td>
	</tr>
	
	
	
	</table>
	<input type="search" name="searchWord">
	<input type="submit" value="찾기">
	</form></div>
	
	
	
	<%
	//JSP tag - java문법%>
	
	
	
	
	
	
</body>
</html>