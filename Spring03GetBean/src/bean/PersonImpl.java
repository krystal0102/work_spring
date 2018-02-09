package bean;

public class PersonImpl implements Person {
	
	// 필드 선언
	private String greeting = "안녕하세요!";
	private String name = "보검";
	private int age = 26;
	
	// 생성자 오버로딩
	public PersonImpl() {
		System.out.println("기본 생성자 호출...");
	} 
	
	public PersonImpl(String greeting) {
		this.greeting = greeting;
	}
	
	public PersonImpl(int age) {
		this.age = age;
	}
	
	public PersonImpl(String greeting, String name, int age) {
		super();
		this.greeting = greeting;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void sayHello() {
		System.out.println(this.name + "(" + age + ")" + ": " + this.greeting);
	}

}
