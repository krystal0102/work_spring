package com.koitt.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.model.Board;

@Repository
public class BoardDao {
	
	@Autowired
	private SqlSessionFactory factory;
	
	public Board getBoard(int no) {
		SqlSession session = factory.openSession();
		Board brd = session.selectOne("com.koitt.model.Board.select", no);
		
		session.close();
		
		return brd;
	}

}
