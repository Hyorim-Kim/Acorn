package pack2;   // package명(directory)

// 자동차 설계도(클래스)
public class Test10Car {  // [접근지정자][기타제한자] class 클래스명
	int wheel;  // 멤버변수(멤버필드, 전역변수, 속성-attribute)
	private int airBag = 1;  // [접근지정자][기타제한자] type(형) 변수명
	// 접근지정자 : default, private, public, protected
	private int speed;   // 접근지정자가 private인 경우 캡슐화
	public String irum = "길동";
	// int인 경우 0으로 초기화, double인 경우 0.0으로 초기화
	
	public Test10Car() {  //constructor(생성자)
		// 객체 생성시 가장 먼저 수행 : 초기화 담당
		// 클래스와 이름이 같고 반환형이 없는 메소드
		wheel = 4;
		speed = 10;
	}
	
	public void abc() { // 멤버 메소드(method)
		System.out.println("abc 메소드 수행");
		System.out.println("에어백 수는 " + airBag);
		System.out.println("바퀴 수는 " + wheel);
		
		def();  // method 호출
		int result = korea(50);  // 매개변수가 있는 method 호출, 이 때는 인수를 줌(매개변수를 인수에 전달해 값을 기억)
		System.out.println("result : " + result);
		System.out.println("abc 메소드 수행 완료 ~~~");
	}
	
	private void def() {
		// 파라미터가 없고 반환값도 없음 (void)
		System.out.println("def 메소드 처리");
	}
	
	private int korea(int jumsu) {  // 메소드명(parameter ...)
		// 파라미터가 있고 반환값도 없음
		// Parameter는 함수 혹은 메서드 정의에서 나열되는 변수명.
		// Argument(인수, 인자)는 함수 혹은 메서드를 호출할 때, 전달 혹은 입력되는 실제 값. 
		System.out.println("korea 메소드 처리");
		System.out.println("jumsu : " + jumsu);
		int score = jumsu + 20;  // 지역 변수
		return score;   // 메소드를 호출한 원래 지점으로 반환값을 전달
	}
}
