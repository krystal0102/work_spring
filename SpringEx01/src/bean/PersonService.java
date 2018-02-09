package bean;

public class PersonService {
	
	// 2-1. 필드 만들기
	private Person person;
	
	public PersonService() {}
	
	// 생성자 (autowire의 constructor를 사용하기 위함)
	// 생성자 중에서 파라미터 타입이 같은 생성자를 찾는다
	public PersonService(Person person) {
		this.person = person;
	}
	
	// person 필드에 대한 setter (autowire의 byName)
	// byName은 setter중에서 같은 이름을 가진 setter를 찾는것. byType은 setter중에서 파라미터 타입이 같은 setter를 찾는것
	public void setPerson(Person person) {
		this.person = person;
	}

	// 2-2. person 객체의 getName()호출하여 그 값을 출력하는 메소드 만들기
	public void hello() {
		System.out.println("내 이름은 " + this.person.getName() + "이야^^");
	}	
}
