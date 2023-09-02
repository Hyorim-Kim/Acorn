package pack3;

public class Test17PohamCar {
	// 여러 개의 부품 클래스로 완성차 클래스를 제작
	// 포함 관계란 포함은 클래스를 재사용할 수 있는 방법으로, 클래스의 멤버로 다른 클래스 자료형의 참조 변수를 선언하는 것을 의미한다.
	int speed = 0;
	String ownerName, turnShow;
	Test17PohamHandle handle;    // 클래스의 포함 관계(has a 관계)
	//Test17PohamHandle handle = new Test17PohamHandle();
	
	public Test17PohamCar() {
		// TODO Auto-generated constructor stub
	}
	
	public Test17PohamCar(String name) {
		ownerName = name;
		handle = new Test17PohamHandle();
	}
	
	void turnHandle(int q) {
		if(q > 0) turnShow = handle.rightTurn(q);
		if(q < 0) turnShow = handle.leftTurn(q);
		if(q == 0) turnShow = handle.Straight(q);
	}
	
}
