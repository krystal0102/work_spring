package com.koitt.book.service;

import java.util.List;

import com.koitt.book.model.Book;
import com.koitt.book.model.BookException;

public interface BookService {

	// 도서 정보 추가
	public void add(Book book) throws BookException;

	// 도서 번호 이용하여 상세 정보 가져오기
	public Book detail(String isbn) throws BookException;

	// 전체 도서 목록 불러오기
	public List<Book> list() throws BookException;

	// 도서 정보 수정하기
	public void modify(Book book) throws BookException;

	// 도서 정보 삭제하기
	public void remove(String isbn) throws BookException;


}
