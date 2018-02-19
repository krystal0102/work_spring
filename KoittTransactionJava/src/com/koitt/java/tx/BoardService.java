package com.koitt.java.tx;

import java.sql.Connection;
import java.sql.SQLException;

public class BoardService {
	
	private BoardDao dao = new BoardDao();
	
	/*
	 * 	롤백(RollBack) : SQL문 실행 전 상태로 되돌리는 것
	 * 					(Drop, Alter문은 테이블을 변경하거나 삭제하는것이므로 롤백이 불가함!)
		트랜잭션(Transaction) : 여러 개의 SQL문을 하나의 작업 단위로 묶은 것
		트랙잭션 처리 : 여러 개의 SQL문을 하나의 작업 단위로 묶었는데 문제가 발생한다면 롤백을 호출하여 이전 상태로 되돌리도록 처리하는 것
		
	*/ 
	
	public void add(Board board) {
		Connection conn = null;
		
		try {
			//////////////////////////////////////////////////// 트랜잭션 처리영역 시작 ///////////////////////////////////////////////////////////
			conn = DBUtil.getInstance().getConnection();
			
			// 자동 Commit 을 막기 위해 false 설정
			// Commit : 테이블에 최종적으로 SQL실행한 결과를 반영하는 것
			// false로 설정했기 때문에 우리가 직접 Commit을 호출해야한다
			conn.setAutoCommit(false);
			Integer no = dao.getBoardNo(conn);
			board.setNo(no);
			dao.insert(conn, board);
			
			// 마지막으로 SQL 실행한 결과를 반영
			conn.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			if (conn != null) {
				try {
					conn.setAutoCommit(true);		// 기존 SQL문들을 이용한 메소드들은 true가 기본값이었기 때문에 true로 복귀시켜준다
					
					
					////////////////////////////////////////////////////트랜잭션 처리영역 끝부분 ///////////////////////////////////////////////////////////
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
