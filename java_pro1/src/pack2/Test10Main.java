package pack2;

public class Test10Main {
	public static void main(String[] args) {
		// 응용 프로그램의 시작을 위해 main을 임의의 클래스 안에 적어줌.
		Test10Car car1 = new Test10Car();  // 클래스(설계도)를 근거로 기억장소를 확보하고 객체가 만들어짐. instance됨
		System.out.println(car1);  // pack2.Test10Car@6f2b958e
		System.out.println(car1.irum);
		System.out.println(car1.wheel);
		//System.out.println(car1.airBag);
		car1.abc();
		// car1.def();
		
		System.out.println();
		Test10Car car2 = new Test10Car();
		car2.abc();  // car1과 car2는 class만 같음
		System.out.println();
		System.out.println(car1 + " " + car1.hashCode());
		System.out.println(car2 + " " + car2.hashCode());
		System.out.println(car1 == car2);     // 객체 주소 비교
		System.out.println(car1.getClass());  // class pack2.Test10Car
		System.out.println(car1.getClass() == car2.getClass());  // 객체 타입 비교
		
		
	}

}
