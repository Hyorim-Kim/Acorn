package pack2;

import java.time.LocalDate;

public class Test15SingletonMain {
	public static void main(String[] args) {
		// 싱글턴 패턴(Singleton Pattern)
		// 특정 클래스에 객체 인스턴스가 하나만 만들어지도록 해주는 패턴입니다.
		// 싱글턴 패턴을 사용하면 전역 변수를 사용할 때와 마찬가지로 객체 인스턴스를 어디서든지 액세스 할 수 있게 만들 수 있습니다.
		// 클래스 인스턴스를 하나만 만들고 그 인스턴스로의 전역 접근을 제공합니다.
		
		Test15Singleton s1 = new Test15Singleton();
		Test15Singleton s2 = new Test15Singleton();
		// 두 개의 객체는 주소가 다름 : pack2.Test15Singleton@6f2b958e pack2.Test15Singleton@1eb44e46
		System.out.println(s1 + " " + s2);
		System.out.println(s1.kor + " " + s2.kor);
		
		System.out.println();
		Test15Singleton ss1 = Test15Singleton.getInstance();
		Test15Singleton ss2 = Test15Singleton.getInstance();
		//  두 개의 객체는 주소가 같음 : pack2.Test15Singleton@1c4af82c pack2.Test15Singleton@1c4af82c
		System.out.println(ss1 + " " + ss2);
		System.out.println(ss1.kor + " " + ss2.kor);
		
		System.out.println();
		LocalDate now = LocalDate.now();     // 싱글톤
		System.out.println(now.hashCode());
		LocalDate now2 = LocalDate.now();     // 싱글톤
		System.out.println(now2.hashCode());
		System.out.println(now.getYear());
		
	}


}
