package pack3;

public class Test23Main {

	public static void main(String[] args) {
		// 상속 관련
		Test23Dog dog = new Test23Dog();
		dog.print();
		System.out.println("dog.callName");
		
		System.out.println("\nHouseDog -------------");
		Test23HouseDog hd = new Test23HouseDog("집개");
		hd.print();   // house dog에 print가 없어서 부모(dog)에게 간다.
		hd.show();
		System.out.println(hd.callName());
		
		System.out.println("\n\nWolfDog --------------");
		Test23WolfDog wolfDog = new Test23WolfDog("늑대");
		wolfDog.print();   // wolfdog에 print가 없어서 부모(dog)에게 간다.
		wolfDog.show();
		System.out.println(wolfDog.callName());
		wolfDog.wolfDisplay();
		
		System.out.println("---");
		Test23WolfDog bushdog = wolfDog;  // wolfDog의 주소를 bushdog에게 줌
		bushdog.wolfDisplay();
		
		wolfDog = null;
		//wolfDog.wolfDisplay();
		bushdog.wolfDisplay();
		bushdog = null;   // GC에 의해 Test23WolfDog 인스턴스가 점유한 메모리가 해
	}

}
