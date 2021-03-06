<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>도서 정보 등록</title></head>
<body>
	<h1>도서 정보 등록</h1>
	<form action="book-add.do" method="post" enctype="multipart/form-data">
	
		<div>
			<label>번  호<input type="text" name="user_no"></label>
		</div>
		
		<div>
			<label>제  목<input type="text" name="title"></label>
		</div>
		
		<div>
			<label>저  자<input type="text" name="author"></label>
		</div>
		
		<div>
			<label>출판사<input type="text" name="publisher"></label>
		</div>
		
		<div>
			<label>가  격<input type="number" name="price"></label>
		</div>
		
		<div>
			<label>설  명</label>
			<textarea name="description"></textarea>
		</div>
		
		<div>첨부파일<input type="file" name="attachment"></div>
		
		<input type="submit" value="등록">
		<input type="reset" value="입력한 내용 지우기">
		<a href="book-list.do">도서 목록으로 이동</a>
		
	</form>

</body>
</html>