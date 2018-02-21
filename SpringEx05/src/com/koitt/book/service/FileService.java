package com.koitt.book.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.koitt.book.model.Book;
import com.koitt.book.model.FileException;


public interface FileService<T> {

	// 파일 추가
	public String add(HttpServletRequest request, MultipartFile attachment) throws FileException;

	// 파일 다운로드
	public void download(HttpServletRequest request, HttpServletResponse response, String filename) throws FileException;

	// 파일 삭제
	public void remove(HttpServletRequest request, String filename) throws FileException;

	// 파일 저장 경로 + 이미지 파일명 가져오기
	public String getImgPath(HttpServletRequest request, String filename);

	// 파일 저장 폴더 경로 가져오기 (ContextPath + /upload)
	public String getUploadPath(HttpServletRequest request);

}
