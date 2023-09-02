package pack2;

public class Test9 {

	public static void main(String[] args) {
		// 자원의 재활용에 대해
		// 반복되는 코드는 파편(unit)으로 작성 후 필요한 곳에서 호출
		int su1 = 6;
		int su2 = 3;
		//방법1
		System.out.println("합은 " + (su1 + su2));
		System.out.println("차는 " + (su1 - su2));
		System.out.println("뭔가를 하다가... ");
		System.out.println("합은 " + (su1 + su2));   // 동일 코드가 기술
		System.out.println("차는 " + (su1 - su2));
		
		System.out.println();
		//방법2 -- 별도의 메소드를 만들고 필요할 때 호출
		hap(su1, su2);
		cha(su1, su2);
		System.out.println("뭔가를 하다가... ");
		hap(su1, su2);
		cha(su1, su2);
		
		System.out.println();
		//방법3-- 별도의 클래스를 만들고 필요할 때 호출
		MyClass my = new MyClass();
		my.hap(su1, su2);
		my.cha(su1, su2);

	}	
	
	public static void hap(int su1, int su2) {
		System.out.println("합은 " + (su1 + su2));
	}
	public static void cha(int su1, int su2) {
		System.out.println("차는 " + (su1 - su2));
	}
}

	
class MyClass{
	public void hap(int su1, int su2) {
		System.out.println("합은 " + (su1 + su2));
	}
	public void cha(int su1, int su2) {
		System.out.println("차는 " + (su1 - su2));
	}
}
	

	

