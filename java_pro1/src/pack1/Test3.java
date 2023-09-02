package pack1;

public class Test3 {

	public static void main(String[] args) {
		// 논리 연산시 주의사항
		boolean a = false, b = true, c;
		
		c = a || b;
		System.out.println(c);
		c = a && b;
		System.out.println(c);
		
		System.out.println("----------------");
		boolean b1, b2;
		b1 = goAbc();
		System.out.println(b1);
		System.out.println(goDef());
		
		System.out.println("주의 사항 -------------");
		System.out.println("or 연산");
		//b2 = goAbc() || goDef();
		b2 = goDef() || goAbc();
		System.out.println(b2);
		
		System.out.println();
		System.out.println("and 연산");
		//b2 = goAbc() && goDef();
		b2 = goDef() && goAbc();
		System.out.println(b2);
		
		System.out.println("================");
		b2 = goAbc() | goDef();
		System.out.println(b2);
		b2 = goDef() & goAbc();
		System.out.println(b2);
	}
	
	public static boolean goAbc() {   // 행위(method)를 정의
		System.out.println("goAbc 처리");
		return true;
	}
	
	public static boolean goDef() {
		System.out.println("goDef 처리");
		return false;
	}

}
