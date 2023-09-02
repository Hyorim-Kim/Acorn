package pack2;

public class Test16Call2 {
	public void ex(int a, int b) {   // 매개변수로 기본형 변수
		int imsi = a;
		a = b;
		b = imsi;
		System.out.println("메소드 내의 a:" + a + ", b:" + b);
	}
	 
	public void ex(Test16Call1 data) {   // 매개변수로 참조형 변수
		int imsi = data.a;
		data.a = data.b;
		data.b = imsi;
		System.out.println("메소드 내의 a:" + data.a + ", b:" + data.b);
	}
	
	public void ex(int[] ar) {
		int imsi = ar[0];
		ar[0] = ar[1];
		ar[1] = imsi;
		
		
	}
}
