package annotation01;

public class TestDrive {
	
	public static void main(String[] args) {
		UserA uesrA = new UserA("S001", "kim");
		UserB uesrB = new UserB("1", "Hong");
		
		IdExtractor idExtractor = new IdExtractor();
		String idA = idExtractor.extractId(uesrA);
		String idB = idExtractor.extractId(uesrB);
		
		System.out.println("UserA의 id값: " + idA);
		System.out.println("UserB의 id값: " + idB);
	}

}
