package pack2;

public class Test16CallByMain {

	public static void main(String[] args) {
		// 메소드를 통해 자료 전달시 값 또는 주소가 넘어감
		Test16Call1 my = new Test16Call1();
		Test16Call2 your = new Test16Call2();
		
		System.out.println("원래 a:" + my.a + ", b:" + my.b);
		
		your.ex(my.a, my.b);    // 인수로 기본형 : 값이 전달
		System.out.println("1. 수행 후 a:" + my.a + ", b:" + my.b);   // my.a != a

		your.ex(my);    // 인수로 참조형 : 주소가 전달
		System.out.println("2. 수행 후 a:" + my.a + ", b:" + my.b);   // my.a = data.a
		
		your.ex(my.c);  // 인수로 참조형(배열) : 주소가 전달
		System.out.println("3. 수행 후 c[0]:" + my.c[0] + ", c[1]:" + my.c[1]);
	}

}
