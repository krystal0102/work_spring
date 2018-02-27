package com.koitt.book.dao;

import java.util.List;

import com.koitt.book.model.Book;
import com.koitt.book.model.BookException;

public interface BookDao {
	
	// 도서 정보 추가
	public void insert(Book book) throws BookException;
	
	// 도서 번호 이용하여 정보 가져오기
	public Book select(String isbn) throws BookException;
	
	// 전체 도서 목록 불러오기
	public List<Book> selectAll() throws BookException;
	
	// 도서 정보 수정하기
	public void update(Book book) throws BookException;
	
	// 도서 정보 삭제하기
	public void delete(String isbn) throws BookException;

}
