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
	public Users select(Integer no) throws UsersException {
		Users users = null;
		
		try {
			users = session.selectOne(MAPPERS_NS + ".select-users", no);
		} catch (Exception e) {
			throw new UsersException(e.getMessage());
		}
		
		return users;
	}
	
	@Override
	public Users selectByEmail(String email) throws UsersException {
		Users users = null;
		
		try {
			users = session.selectOne(MAPPERS_NS + ".select-users-by-email", email);
		} catch(Exception e) {
			throw new UsersException(e.getMessage());
		}
		
		return users;
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
	public void update(Users users) throws UsersException {
		try {
			session.update(MAPPERS_NS + ".update-users", users);
		} catch (Exception e) {
			throw new UsersException(e.getMessage());
		}

	}

	@Override
	public void insertAuthority(Users users) throws UsersException {
		try {
			session.insert(MAPPERS_NS + ".insertAuthority", users); 
		} catch(Exception e) {
			throw new UsersException(e.getMessage());
		}
	}

	@Override
	public Integer selectLastInsertId() throws UsersException {
		Integer lastInsertId = null;
		try {
			lastInsertId = session.selectOne(MAPPERS_NS + ".select-last-insert-id");
		} catch (Exception e) {
			throw new UsersException(e.getMessage());
		}
		return lastInsertId;
	}

	

}
