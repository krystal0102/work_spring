package com.koitt.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.koitt.book.service.UsersService;

@Controller
public class IndexWebController {

	@RequestMapping(value= {"/", "/index.do"}, method=RequestMethod.GET)
	public String index() {
		return "index";
	}
}