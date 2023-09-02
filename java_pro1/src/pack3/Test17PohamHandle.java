package pack3;

public class Test17PohamHandle {
	// 완성차 따위의 클래스에서 사용될 부품 클래스 핸들
	int quantity;   //회전량
	
	public Test17PohamHandle() {
		quantity = 0;
	}
	
	String leftTurn(int q) {
		quantity = q;
		return "좌회전";
	}
	
	String rightTurn(int q) {
		quantity = q;
		return "우회전";
	}
	
	String Straight(int q) {
		quantity = q;
		return "직진";
	}
}
