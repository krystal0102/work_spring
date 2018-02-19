<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head><title>도서 목록</title></head>
<body>
	<h1>도서 목록</h1>
	<a href="book-add.do">도서 정보 등록하기</a>
	<table>
		<thead>
			<tr>
				<th>도서 번호</th>
				<th>제    목</th>
				<th>저    자</th>
				<th>출 판 사</th>
				<th>가    격</th>
				<th>설    명</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items='${ list }' var="book">
				<tr>
					<td>${ book.isbn }</td>
					<td><a href="book-detail.do?isbn=${ book.isbn }">${ book.title }</a></td>
					<td>${ book.author }</td>
					<td>${ book.publisher }</td>
					<td>${ book.price }</td>
					<td>${ book.description }</td>
				</tr>
			</c:forEach>	
		</tbody>
	</table>
	
	<a href="book-list.do">도서 목록으로 이동</a>
</body>
</html>