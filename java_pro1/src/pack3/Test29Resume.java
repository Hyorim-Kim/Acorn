package pack3;

public interface Test29Resume {
	// 표준 이력서 양식
	String SIZE = "A4";   // interface에 멤버필드 적어주면 무조건 public final static화 됨

	void setIrum(String irum);
	void setJunhwa(String junhwa);
	void print();
	
	// 아래는 참고
	static void changeData() {
		System.out.println("스테틱 메소드는 인터페이스 멤버로 사용 가능");
	}
	
	default void playJava() {
		System.out.println("java 8 버전 이후에는 default를 선행한 일반 메소드 사용 가능");
	}
	
}
