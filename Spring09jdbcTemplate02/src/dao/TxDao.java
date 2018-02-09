package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.Job;

// Transaction 을 사용하려면 Dao 클래스에 @Repository 를 작성해야 한다
@Repository
public class TxDao {

	@Autowired // xml 파일에서 autowire = "byType" 한 것과 동일하게 동작
	private JdbcTemplate template;
	
	public void insert(Job job) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO job (job_id, job_title, min_salary, max_salary) ");
		sql.append("VALUES (?, ?, ?, ?, ?)" );
		
		template.update(sql.toString(), job.getJobId(), job.getJobTitle(), job.getJobTitle(), job.getMinSalary(), job.getMaxSalary());
	}
	
	
	public void update(Job job) {
		String sql = "UPDATE job SET job_title = ?, min_salary = ?, max_salary = ? "
					+ "WHERE job_id = ?";
		template.update(sql, job.getJobTitle(), job.getMaxSalary(), job.getMinSalary(), job.getJobId());
	}

}
