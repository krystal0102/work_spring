package annotation02;

import java.lang.reflect.Field;

import org.omg.CORBA.portable.ValueInputStream;

public class Validator {
	
	public boolean validate(Object obj) throws IllegalArgumentException, IllegalAccessException {
		
		// 검증 기준에 통과했는지 여부를 저장하는 변수
		boolean pass = true;
		
		// 현재 검증하려는 obj의 toString을 호출하여 출력 
		System.out.println(obj);
		
		// 1. 객체의 클래스 정보를 가져와 필드 배열을 가져옴
		Field[] fields = obj.getClass().getDeclaredFields();
		
		// 2. 필드 배열을 순회하면서 애노테이션에 대한 처리를 한다.	
		for (Field field :  fields) {
			
			// 3. 필드의 값에 접근이 가능하도록 설정
			field.setAccessible(true);
			
			// 4. Validation 애노테이션이 설정된 필드이면
			if (field.getAnnotation(Validation.class) != null) {
				
				// Validation 애노테이션을 객체로 저장
				Validation anno = field.getAnnotation(Validation.class); // 클래스에 직접 정보를 요청하는 경우이므로 .class를 사용했다
				
				int valInt = 0;								// int 필드의 값 저장 변수
				String valStr = null;						// String 필드의 값 저장 변수
				Class<?> type = field.getType();			// 필드의 타입 저장 변수
				
				
				// 5-1. 만약 필드의 타입이 int일 경우
				if (type.getName().equals("int")) {	
					
					// 6. 해당 필드의 int값을 가져온다 
					valInt = field.getInt(obj);
					
					// 7. 만약 required가 true인데 valInt값이 0일 경우는 입력해야 한다는 메시지를 출력
					if (anno.required() && valInt == 0) {
						pass = false;
						System.out.println(field.getName() + " 는 필수로 입력해야한다. (" + valInt + ") ");
					}
					
					// 8. 만약 해당 필드의 값이 max값보다 크고, min값보다 작을 경우 
					else if (anno.max() < valInt || anno.min() > valInt) {
						pass  = false;
						System.out.println(field.getName() + "는 범위를 벗어났습니다. (" + valInt + ") " );
					}
				}
				
				// 5-2. 만약 필드의 값이 String일 경우
				else if (type.getName().equals("java.lang.String")) {
					
					// 6. String타입 필드의 값을 가져온다
					if (field.get(obj) != null) {
						valStr = field.get(obj).toString();
					}
					
					// 7. 만약 required 값이 true 이고 valStr값이 없을 경우
					if (anno.required() && valStr == null) {
						pass = false;
						System.out.println(field.getName() + " 는 필수로 입력해야한다.");
					}
					
					// 8. 값을 입력했지만 입력한 값의 문자열 길이가 최대 길이를 초과했을 경우
					else if (valStr != null && anno.maxLenth() < valStr.length()) {
						pass  = false;
						System.out.println(field.getName() + "는 범위를 벗어났습니다.");
					}
				}
			}
		}
		
		// 9. 최종적으로 검증조건에 만족하는지 여부를 리턴
		return pass;
	}

}
