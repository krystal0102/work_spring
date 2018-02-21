package com.koitt.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.board.model.Users;
import com.koitt.board.model.UsersException;

@Repository
public class UsersDaoImpl implements UsersDao {

	private static final String MAPPERS_NS = Users.class.getName();

	@Autowired
	private SqlSession session;
	
	public UsersDaoImpl() {}

	@Override
	public List<Users> selectAll() throws UsersException {
		List<Users> list = null;

		try {

			list = session.selectList(MAPPERS_NS + ".select-all-users");

		} catch(Exception e) {
			throw new UsersException(e.getMessage());
		}

		return list;
	}

	@Override
	public Users select(Integer no) {

		return null;
	}

	@Override
	public void insert(Users user) {


	}

	@Override
	public void delete(Integer no) {

	}

	@Override
	public void deleteUserType(Integer no) {

	}

	@Override
	public void update(Users users) {

	}

}
