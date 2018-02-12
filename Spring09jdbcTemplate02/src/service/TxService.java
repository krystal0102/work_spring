package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.TxDao;
import model.Job;

@Service  //Servic 클래스를 bean 객체로 만들고 싶을때는 @Service 애노테이션 사용
@Transactional
public class TxService {
	@Autowired
	private TxDao dao;
	
	//@Transactional 									// 해당 메소드는 트랜잭션 처리를 하겠다는 뜻
	public void save(Job job) {
		dao.update(job);
		//job.setJobId(job.getJobId() + "_");			// 첫번째 실행시 활성화
		job.setJobId(job.getJobId());				// 두번째 실행시 활성화(Transaction 테스트하기) : TestTx의 값을 첫번째 실행시의 id와 동일하게 바꿔주고, 							
		dao.insert(job);							// 최대값은 변경해줬을때 insert 메소드 오류 발생 -> 최대값이 변경값으로 바뀌게됨 - > transaction 처리로인해 오류나기 전의 본래값을 유지시켜줌
	}
	

}
