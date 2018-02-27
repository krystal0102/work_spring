package com.koitt.book.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.koitt.book.model.Authority;

public class Users implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer no;
	private String email;
	private String password;
	private String name;
	private String attachment; 			// 프로필 사진 파일명
	private List<Book> bookList;
	private Set<Authority> authorities;

	public Users() {}

	public Users(Integer no, String email, String password, String name, String attachment) {
		this.no = no;
		this.email = email;
		this.password = password;
		this.name = name;
		this.attachment = attachment;
	}

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

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public Set<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
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
		result = prime * result + ((bookList == null) ? 0 : bookList.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((attachment == null) ? 0 : attachment.hashCode());
		result = prime * result + ((authorities == null) ? 0 : authorities.hashCode());
		return result;
	}

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
		builder.append(", attachment=");
		builder.append(attachment);
		builder.append(", bookList=");
		builder.append(bookList);
		builder.append(", authorities=");
		builder.append(authorities);
		builder.append("]");
		return builder.toString();
	}

}
