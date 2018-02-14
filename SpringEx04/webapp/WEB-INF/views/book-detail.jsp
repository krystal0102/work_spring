<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>도서 정보 상세보기</title></head>
<body>
	<h1>도서 정보 상세보기</h1>
	<dl>
		<dt>번  호</dt><dd>${ book.isbn }</dd>
		<dt>제  목</dt><dd>${ book.title }</dd>
		<dt>저  자</dt><dd>${ book.author }</dd>
		<dt>출판사</dt><dd>${ book.publisher }</dd>
		<dt>가  격</dt><dd>${ book.price }</dd>
		<dt>설  명</dt><dd>${ book.descripntion }</dd>	
	</dl>
	
	<a href="book-list.do">도서 목록으로 이동</a>
	<a href="book-remove.do?isbn=${ book.isbn }">삭제하기</a>
	<a href="book-modify.do?isbn=${ book.isbn }">수정하기</a>

</body>
</html>