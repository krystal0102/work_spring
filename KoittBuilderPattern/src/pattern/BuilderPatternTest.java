package pattern;

import java.util.Date;

public class BuilderPatternTest {
	
	public static void main(String[] args) {
		
		StringBuilder builder01 = new StringBuilder();
		builder01
		.append("안녕하세요,")
		.append(" 반갑습니다");
		
		System.out.println(builder01);
		
/*		String name = "안녕하세요";
		String nice = "반갑습니다.";
		String time = "오랜만이네요.";
		
		System.out.println(name);
		System.out.println(nice);
		System.out.println(time);*/
		
		UserBuilder builder02 = new UserBuilder().setAge(10).setDob(new Date()).setEmail("bogum04@gmail.com").setName("박복엄");
		System.out.println(builder02);
		
		
	}

}
