package pack2;

public class Test11Programmer {
	// Programmer 타입의 클래스 작성
	public String nickName;
	private int age;
	String spec = "자바 전문 개발자";   // instance 소유
	
	public static String motto = "자바 선수가 되자!";   // class 소유
	public final double PI = 3.14;   // instance 소유      read only
	public final static double KOR = 99.0;   // class 소유
	
	public Test11Programmer() {
		System.out.println("난 생성자");
		System.out.println("초기화 할 것이 없을 때는 적지 않아도 인정");   // class 소유
		nickName = "자바 귀신";
		age = 25;
		// displayData();
		
	}
	
	public void displayData() {
		String sp = reSpec();
		System.out.println("별명이 " + nickName + "인 그의 나이는 " + age + "살");
		System.out.println("reSpeck 처리 후 spec은 " + sp);
	}
	
	private String reSpec() {
		return "웹 전문가";
	}
	
	// getter, setter 메소드
	// private 멤버에 대해 클래스 밖에서 참조하기
	public void setAge(int age) {   // setter 메소드
		this.age = age;   // age는 지역변수
	}
	public int getAge() {   // getter 메소드
		return age;
	}
	
	public static void myMethod() {
		System.out.println("클래스의 이름으로 호출 가능한 메소드");
		System.out.println("나의 모토는 " + motto);
		//System.out.println("나이는 " + age);
		//reSpec();
		
	}

}





