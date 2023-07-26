<%@page import="kh.test.jdbckh.student.model.vo.StudentVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 리스트</title>
</head>
<body>
	<h2>학생 리스트</h2>
	<div>
	<form action="<%=request.getContextPath() %>/student/list" method="get" %>
			<input type="search" name="searchWord">
			<input type="submit" value="찾기">
	</form>
	</div>
	
	
	<%
	// JSP tag - java 문법
//	String a = (String) request.getAttribute("aaa");
//	String b = (String) request.getAttribute("bbb");
	//int c = (int)request.getAttribute("ccc");
	List<StudentVo> volist = (List<StudentVo>)request.getAttribute("studentList");
	String searchWord = (String)request.getAttribute("searchWord");
	if(searchWord != null){
		%>
		<h3><%=searchWord %> 검색결과</h3>
		<h5><a href="<%=request.getContextPath() %>/student/list">전체보기</a></h5>
		<%
	}
	if(volist == null || volist.size() == 0){
//	if (volist.size()<1){
		%>
		<h2>결과물이 없습니다.</h2>
		<%
	} else {
	%>
	<%-- <%= a %> --%>
	<%-- <%= b %> --%>
	<%-- <%= c %> --%>
	<%-- <%= volist %> --%>
	<table border="1">
		<tr>
			<td>학번</td>
			<td>이름</td>
			<td>주소</td>
			<td>입학일</td>
		</tr>
		<%
		for (int i= 0; i < volist.size(); i++) {
			StudentVo vo = volist.get(i);
		%>
		<tr>
			<td><a href="<%=request.getContextPath()%>/student/get?sno=<%=vo.getStudentNo() %>"><%=vo.getStudentNo() %></a></td>
			<td> <%=vo.getStudentName() %></td>
			<td> <%=vo.getStudentAddress() %></td>
			<td> <%=vo.getEntranceDate() %></td>
		</tr>

		<%
		}
		%>

	</table> 
	
 	<%
 	}
  	%>
</body>
</html>