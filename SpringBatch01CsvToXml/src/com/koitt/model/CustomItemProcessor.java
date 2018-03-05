package com.koitt.model;

import org.springframework.batch.item.ItemProcessor;

/*
 * ItemReader에서 읽은 데이터를 전달받아 중간에서 비지니스 로직이 필요할 경우 작성
 * (필요없다면 ItemProcessor는 생략가능)
 * 
 * 처리가 끝나면 ItemWriter에게 처리한 데이터를 전달
 * (단, 처리한 항목 개수가 commit-interval개 만큼 쌓이면 전달)
 */

										//<전달받은 파라미터 타입, 리턴할 파라미터 타입> : 다른 타입으로  writer에게 전달할 수 있으므로 제네릭을 이용해 명시
public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {
		// 여기서는 따로 데이터를 가공/처리 하지 않고 콘솔에 출력만 하는 예시
		System.out.println("처리 중인 항목: " + item);
		return item;
	}

	

}
