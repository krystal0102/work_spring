package com.koitt.model;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer no;
	private String title;
	private String content;
	private Date regDate;
	private Integer userNo;
	
	public Board() {}

	public Board(Integer no, String title, String content, Date regDate, Integer userNo) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.userNo = userNo;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Integer getUserNo() {
		return userNo;
	}

	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		result = prime * result + ((regDate == null) ? 0 : regDate.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((userNo == null) ? 0 : userNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if(!(obj instanceof Board)) {
			return false;
		}
		
		Board other = (Board) obj;
		if (this.no.equals(other.no)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("작성글[");
		builder.append(no);
		builder.append("] 제목: ");
		builder.append(title);
		builder.append(" / 내용: ");
		builder.append(content);
		builder.append(" / 등록일: ");
		builder.append(regDate);
		builder.append(" / [사용자번호 : ");
		builder.append(userNo);
		builder.append("]");
		return builder.toString();
	}

}
