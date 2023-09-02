package pack2;

public class Test11Main {
	public static void main(String[] args) {
		System.out.println("어쩌구 저쩌구 ...");
		
		// Test11Programmer 형 객체 생성
		Test11Programmer tom = new Test11Programmer();
		System.out.println("tom의 별병은 " + tom.nickName);
		//System.out.println("tom의 나이은 " + tom.age);
		System.out.println("tom의 스펙은 " + tom.spec);
		tom.displayData();
		
		System.out.println("getter/setter");
        //System.out.println(tom.age);  // private 멤버이므로
		tom.setAge(30);
		System.out.println("tom의 나이는 " + tom.getAge());
		
		System.out.println();
		System.out.println("모토: " + tom.motto);
		System.out.println("모토: " + Test11Programmer.motto);
		Test11Programmer.myMethod();
		// tom.pi = 123;   fianl 값은 수정 불가
		System.out.println("파이 값은 " + tom.PI);
		
		System.out.println("-----------");
		Test11Programmer james;
		//System.out.println("james의 스펙은 " + james.spec);
		Test11Programmer.myMethod();
	}

}
