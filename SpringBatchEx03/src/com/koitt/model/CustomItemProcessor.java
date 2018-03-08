package com.koitt.model;

import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Board, Board>{

	public CustomItemProcessor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Board process(Board item) throws Exception {
		/*
		 * csv에 빈 문자열이 아닌 NULL 문자열로 출력하기 위해
		 * Processor에서 데이터를 제공/처리한다
		 */
		if (item.getAttachment() == null) {
			item.setAttachment("NULL");
		}
		
		return item;		// ItemWriter로 전달하기 위해 return
	}


}
