package com.koitt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.koitt.dao.BoardDao;
import com.koitt.dao.BoardDao2;
import com.koitt.model.Board;

public class TestDrive {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("/com/koitt/config/config.xml");
		
		BoardDao dao01 = context.getBean(BoardDao.class);
		Board brd01 = dao01.getBoard(1);
		System.out.println(brd01);
		
		BoardDao2 dao02 = context.getBean(BoardDao2.class);
		Board brd02 = dao02.getBoard(3);
		System.out.println(brd02);
	
	}

}
