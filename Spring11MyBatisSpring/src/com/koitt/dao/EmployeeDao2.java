package com.koitt.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.model.Employee;

@Repository
public class EmployeeDao2 {
	
	@Autowired
	private SqlSession session;
	
	public Employee getEmployee(int empno) {
		Employee emp = session.selectOne("com.koitt.model.Employee.select", empno);
		/*문제 발생
		싱글턴으로 객체 생성했기 때문에 오로지 하나만 존재하는 객체고,
		이 객체를 닫는 다면 다음번 호룰 시 오로지 selectOne이 동작하지 않기때문에 SqlSaeeion 객체를 닫으면 안된다
		닫으면 문제 발생*/
		// session.close():
		return emp;
	}
	

}
