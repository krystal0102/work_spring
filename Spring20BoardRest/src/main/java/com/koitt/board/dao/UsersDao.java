package com.koitt.board.dao;

import java.util.List;

import com.koitt.board.model.Users;
import com.koitt.board.model.UsersException;

public interface UsersDao {

	public List<Users> selectAll() throws UsersException;

	public Users select(Integer no) throws UsersException;

	public void insert(Users users) throws UsersException;

	public void deleteUserTypes(Integer no) throws UsersException;

	public void update(Users users) throws UsersException;

	// 이메일로 사용자의 모든 정보 가져오기
	public Users selectByEmail(String email) throws UsersException;

	// users_authority 테이블에 정보를 입력하기
	public void insertAuthority(Users users) throws UsersException;

	// 최근 등록한 사용자의 번호를 가져오기
	public Integer selectLastInsertId() throws UsersException;

	// 사용자 전체 삭제
	public void deleteAll() throws UsersException;

	// 유저 유저번호를 이용해 삭제 
	public void delete(Integer no) throws UsersException;

	// 사용자 수 가져오기
	public Integer getCount() throws UsersException;

	// 유저번호로 조회에서 유저 권한 삭제
	public void deleteUserAuthority(Integer no) throws UsersException;
	
	public void deleteUserBoard(Integer no) throws UsersException;

	// users_authority 테이블 전체 삭제
	public void deleteAllUsersAuthority() throws UsersException;

	// users_authority 테이블 행의 수 가져오기
	public Integer getCountUsersAuthority() throws UsersException;
}













