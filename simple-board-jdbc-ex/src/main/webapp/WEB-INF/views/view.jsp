<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>content_view.jsp</title>
</head>
<body>
<table width="600" cellpadding="0"  cellspacing="0" border="1">
	<tr>
		<td>번호</td>
		<td>${view.mId}</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>
			<input type="text" name="mName" value="${view.mName}">
		</td>
	</tr>
	<tr>
		<td>내용</td>
		<td>
			<textarea rows="10" name="mContent"> ${view.mContent}</textarea>
		</td>
	</tr>
		
	<tr>
		<td colspan="2">
			<a href="list">목록보기</a>		
		</td>
	</tr>
</table>
</body>
</html>