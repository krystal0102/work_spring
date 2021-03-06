package com.koitt.valid;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotNull				// NULL 값을 허용하지 않는다
	@Length(max=10)			// 길이가 최대 10까지만 허용
	private String name;
	
	@Range(min=19, max=50)	// 19부터 50까지만 입력가능
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
