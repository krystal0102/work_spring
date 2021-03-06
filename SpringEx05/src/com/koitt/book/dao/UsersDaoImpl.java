package com.koitt.book.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.book.model.Users;
import com.koitt.book.model.UsersException;

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
	public void insert(Users users) throws UsersException {
		
		try {
			session.insert(MAPPERS_NS + ".insert-users", users);
			
		} catch(Exception e) {
			throw new UsersException(e.getMessage());
		}
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
