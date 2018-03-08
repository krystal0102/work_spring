package com.koitt.model;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component			
public class RunScheduler {
	
	@Autowired
	private JobLauncher jobLauncher;
	
	@Autowired
	private Job job;
	
	// 0 0 16 ? * * * 매일 오후 16시마다
	@Scheduled(cron="0 0 16 ? * *")
	public void run() {
		try {
			
			JobParameters param = new JobParametersBuilder()
					.addString("date", new Date().toString()).toJobParameters();
			
			JobExecution execution = jobLauncher.run(job, param);
			System.out.println("종료상테: " + execution.getStatus());
			System.out.println("발생한 예외들: " + execution.getAllFailureExceptions() );
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


}
