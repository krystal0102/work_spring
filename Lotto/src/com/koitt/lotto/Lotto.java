package com.koitt.lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {

		Lotto lotto = new Lotto();
		
		Random rd = new Random();
		
								// TreeSet을 사용하면 정렬도 가능
		Set<Integer> set = new HashSet<Integer>();
		
		while (set.size() < 6) {
			int num = rd.nextInt(45) + 1;
			set.add(num);
		}
		
		for (Integer n : set) {
			System.out.print(n + " ");
		}
		

		System.out.println(lotto.num());

	}
	
	
	String num() {


		// 중복 없는 로또 번호 출력하기
		Set<Integer> lottoSet = new HashSet<Integer>();
		while( lottoSet.size() < 6 ) {
			Double i = Math.random() * 45 + 1;
			lottoSet.add(i.intValue());
		}
		List<Integer> list = new ArrayList<Integer>(lottoSet);
		Collections.sort(list);
		return list.toString();
		
	}

}
