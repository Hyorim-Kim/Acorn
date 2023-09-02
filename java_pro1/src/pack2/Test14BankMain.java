package pack2;

public class Test14BankMain {
	// Test14Bank와 Test14BankMain은 같은 package에 존재
	public static void main(String[] args) {
		// Bank 객체를 생성 - 인스턴스화
		Test14Bank tom = new Test14Bank();
		tom.dePosit(5000);
		tom.withDraw(3000);
		System.out.println("tom의 예금액은 : " + tom.getMoney());
		
		System.out.println();
		Test14Bank oscar = new Test14Bank(2000);   // money 값 다름
		oscar.dePosit(1000);
		oscar.withDraw(7000);
		oscar.withDraw(2000);
		System.out.println("oscar의 예금액은 : " + oscar.getMoney());
		
		System.out.println("\n객체의 주소 관련 -------------------");
		System.out.println("tom의 주소 : " + tom + " " + tom.hashCode());
		System.out.println("tom의 주소 : " + oscar + " " + oscar.hashCode());
		// tom과 oscar는 타입만 같고 기억장소는 별개 (설계도만 같고 instance가 다름)
		System.out.println();
		Test14Bank james = null;  // 참조하고 있는 변수가 없음(객체변수 생성)
		System.out.println("james의 주소 : " + james);
		// System.out.println("james의 예금액 : " + james.getMoney());   // java.lang.NullPointerException
		james = oscar;   // 주소 치환
		System.out.println("james의 주소 : " + james);
		System.out.println("oscar의 주소 : " + oscar);
		System.out.println("james의 예금액 : " + james.getMoney());
		// james = null;   // 객체 참조 해제
		if(james == tom)   // 주소 비교
			System.out.println("둘은 같은 인스턴스의 주소를 참조");
		else 
			System.out.println("둘은 달라요 주소가");
		
		if(james instanceof Test14Bank)   // instanceof : 클래스 타입 비교 연산자
			System.out.println("클래스 타입이 Test14Bank 이군요");
		else
			System.out.println("클래스 타입이 Test14Bank가 아니네요");
		
		System.out.println("\nString(스트링) 타입의 값 비교 ---");
		String ss1 = "kor";   // String 클래스는 기본형처럼 값을 치환 할 수 있다.
		String ss2 = new String();
		ss2 = "kor";
		String ss3 = new String("kor");
		System.out.println(ss1 + " " + ss2 + " " + ss3);
		
	
	 	if(ss1 == ss2)   // String 클래스 타입의 객체의 주소를 비교
	 		System.out.println("같음");
	 	else
	 		System.out.println("다름");
	 	
	 	if(ss1 == ss3)
	 		System.out.println("같음");
	 	else
	 		System.out.println("다름");
	 	
	 	System.out.println(ss1.hashCode() + " " + ss2.hashCode() + " " + ss3.hashCode());
	 	                       // 106382 106382 106382
	 	
	 	if(ss1.equals(ss2))   // String 클래스 타입의 객체가 참조하고 있는 값을 비교
	 		System.out.println("값이 같다");
	 	else
	 		System.out.println("값이 다르다");
	 	
	 	if(ss1.equals(ss3))
	 		System.out.println("값이 같다2");
	 	else
	 		System.out.println("값이 다르다2");
	 	
	 	// 일반 객체의 주소, 기본형 변수의 값 비교 시 : ==
	 	// String 객체인 경우 값을 비교 시 : equals() - 대소문자 구분, equalsIgnoreCase() - 대소문자 구분X
	 	
	 	System.out.println("\n배열 관련---");
	 	//int ar1[] = new int[3];
	 	//ar1[0] = 1; ar1[1] = 2; ar1[2] = 3;
	 	int ar1[] = {1, 2, 3};      // 1차원 배열
	 	System.out.println(ar1);    // 배열의 대표명은 객ㅊ체의 시작 주소를 기억
	 	System.out.println(ar1[0]); // 배열의 요소값 기억
	 	System.out.println();
	 	int[][] ar2 = {{1,2,3},{4,5,6,7}}; // 2차원 배열
	 	System.out.println(ar2);
	 	System.out.println(ar2[0] + " " + ar2[1]);
	 	System.out.println(ar2[0][0]);
	 	
	}

}
