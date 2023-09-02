package pack3;

import java.util.Iterator;

public class Test24PolyMain {
	public static void main(String[] args) {
		// 다형성(polymorphism)이란 하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미
		Test24PolyCar car1 = new Test24PolyCar(); 
		Test24PolyBus bus1 = new Test24PolyBus();
		Test24PolyTaxi taxi1 = new Test24PolyTaxi();
		
		System.out.println();
		car1.dispData();
		System.out.println(car1.getSpeed());
		
		System.out.println();
		bus1.dispData();
		bus1.show();
		System.out.println(bus1.getSpeed());
		
		System.out.println();
		taxi1.dispData();
		taxi1.show();
		System.out.println(taxi1.getSpeed());
		
		System.out.println("------------");
		Test24PolyCar car2 = new Test24PolyBus();  // promotion (polycar에게 polybus줄 수 있음)
		car2.dispData();   // 오버라이딩 된 메소드는 호출 가능
		//car2.show();   // 자식 고유의 메소드는 호출 불가(불간섭의 원칙)
		System.out.println(car2.getSpeed());
		
		System.out.println();
		Test24PolyCar car3 = taxi1;
		car3.dispData();
		System.out.println(car3.getSpeed());
		
		System.out.println();
		//Test24PolyBus bus2 = new Test24PolyCar(); // 자식에게 부모 인스턴스X
		//Test24PolyBus bus2 = car1;  X
		Test24PolyBus bus2 = (Test24PolyBus)car2;   // casting
		// 부모타입이지만 자식 객체의 주소를 가지므로 캐스팅이 가능
		bus2.dispData();
		System.out.println(bus2.getSpeed());
		bus2.show();
		
		System.out.println();
		//Test24PolyTaxi taxi2 = new Test24PolyCar();
		//Test24PolyTaxi taxi2 = new Test24PolyBus();
		Test24PolyTaxi taxi2 = (Test24PolyTaxi)car3;
		taxi2.dispData();
		
		//Test24PolyTaxi taxi3 = (Test24PolyTaxi)car3;   // runtime error
		
		System.out.println();
		Test24PolyCar polyCar = null;
		Test24PolyBus polyBus = new Test24PolyBus();
		Test24PolyTaxi polyTaxi = new Test24PolyTaxi();
		
		System.out.println();
		polyCar = polyBus;
		polyCar.dispData();  //1
		System.out.println();
		polyCar = polyTaxi;   
		polyCar.dispData();  //2
		
		System.out.println();
		Test24PolyCar p[] = new Test24PolyCar[3];
		p[0] = car1;
		p[1] = polyBus;
		p[2] = polyTaxi;
		for (int i = 0; i < p.length; i++) {
			p[i].dispData();
		}
		
		System.out.println();
		for(Test24PolyCar c:p) {  // enhanced for
			c.dispData();
		}

	}

}
