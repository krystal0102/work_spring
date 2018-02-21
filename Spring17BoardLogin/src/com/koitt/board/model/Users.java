package com.koitt.board.model;

import java.io.Serializable;
import java.util.List;

public class Users implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer no;
	private String email;
	private String password;
	private String name;
	private List<Board> boardList;		// 해당 사용자의 게시물 목록
	
	// 사용자 한명은 게시물을 여러개 가질 수 있는 일대다(1:N)관계 이므로 위와 같이 List로 필드를 표현한다.
	
	// 기본생성자
	public Users() { }
	
	// 모든 필드 초기화하는 생성자
	public Users(Integer no, String email, String password, String name) {
		super();
		this.no = no;
		this.email = email;
		this.password = password;
		this.name = name;
	}
	
	// getter setter
	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Board> getBoardList() {
		return boardList;
	}

	public void setBoardList(List<Board> boardList) {
		this.boardList = boardList;
	}

	
	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Users)) {
			return false;
		}
		
		Users other = (Users) obj;
		if (this.no.equals(other.no)) {
			return true;
		}
		
		return false;
	}
	
	
	// hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardList == null) ? 0 : boardList.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	
	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Users [no=");
		builder.append(no);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", name=");
		builder.append(name);
		builder.append(", boardList=");
		builder.append(boardList);
		builder.append("]");
		return builder.toString();
	}
	


}
