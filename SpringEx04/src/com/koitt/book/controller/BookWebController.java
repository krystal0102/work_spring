package com.koitt.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.koitt.book.model.Book;
import com.koitt.book.model.BookException;
import com.koitt.book.service.BookService;

@Controller
public class BookWebController {

	@Autowired
	private BookService service;

	@RequestMapping("/book-list.do")
	public String list(Model model) {
		List<Book> list  = null;

		try {
			list = service.list();
		} catch (BookException e) {
			model.addAttribute("error", "server");
		}

		model.addAttribute("list", list);

		return "book-list";
	}


	// 도서 상세 정보 화면
	@RequestMapping(value="/book-detail.do", method=RequestMethod.GET)
	public String detail(Model model, @RequestParam(value="isbn", required=true) String isbn) {
		Book book = null;

		try {
			book = service.detail(isbn);
		} catch (BookException e) {
			model.addAttribute("error", "server");
		}
		model.addAttribute("book", book);

		return "book-detail";
	}

	// 도서 정보 작성 화면
	@RequestMapping(value="/book-add.do", method=RequestMethod.GET)
	public String add() {
		return "book-add";
	}

	// 정보 작성 후 글 목록 이동
	@RequestMapping(value="/book-add.do", method=RequestMethod.POST)
	public String add(Model model, Book book) {
		try {
			service.add(book);

		} catch(BookException e) {
			model.addAttribute("error", "server");
		}
		return "redirect:book-list.do";
	}

	// 정보 삭제 확인 화면
	@RequestMapping(value="/book-remove.do", method=RequestMethod.GET)
	public String removeConfirm(Model model, @RequestParam(value="isbn", required=true) String isbn) {
		model.addAttribute("isbn", isbn);

		return "book-remove-confirm";
	}

	// 정보 삭제 후 도서 목록 화면으로 이동
	@RequestMapping(value="/book-remove.do", method=RequestMethod.POST)
	public String remove(Model model, String isbn) {
		try {
			service.remove(isbn);
		} catch (BookException e) {
			model.addAttribute("error", "server");
		}
		return "redirect:book-list.do";
	}


	// 정보 수정 화면
	@RequestMapping(value="/book-modify.do", method=RequestMethod.GET)
	public String modify(Model model, @RequestParam(value="isbn", required=true) String isbn) {
		Book book = null;

		try {
			book = service.detail(isbn);
		} catch(BookException e) {
			model.addAttribute("error", "server");
		}

		model.addAttribute("book", book);

		return "book-modify";
	}

	// 정보 수정 후 도서 목록 화면으로 이동
	@RequestMapping(value="/book-modify.do", method=RequestMethod.POST)
	public String modify(Model model, Book book) {
		try {
			service.modify(book);
		} catch(BookException e) {
			model.addAttribute("error", "server");
		}
		return "redirect:book-list.do";
	}




}
