package com.koitt.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.board.model.Authority;
import com.koitt.board.model.UsersException;

@Repository
public class AuthorityDaoImpl implements AuthorityDao {
	
	private static final String MAPPERS_NS = Authority.class.getName();
	
	@Autowired
	private SqlSession session;
	
	@Override
	public Authority select(Integer id) throws UsersException {
		
		Authority authority = null;
		
		try {
			authority = session.selectOne(MAPPERS_NS + ".select-authority", id );
		} catch (Exception e) {
			throw new UsersException(e.getMessage());
		}
		return authority;
	}

}
