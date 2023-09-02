package pack3;

import java.lang.*;    // 생략 가능
public class Test21 extends Object{
//public class Test21 {
	public Test21() {
		System.out.println("생성자");
	}
	
	
	@Override   // annotation, 생략 가능
	public String toString() {
		// Object 클래스의 toString 메소드를 Override
		return "와우 오묘하군";
	}

	public static void main(String[] args) {
		Test21 test21 = new Test21();
		System.out.println(test21);   // 객체의 주소 찍기
    	System.out.println(test21.toString());
		
	}

}
