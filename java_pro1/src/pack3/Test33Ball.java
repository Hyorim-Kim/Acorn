package pack3;

// 이 클래스 예제는 Test32 ~ 와 관련이 있다.
public class Test33Ball extends Test33FlyerAdapter{
	@Override
	public void fly() {
		// 어댑터 추상 클래스의 메소드 중 선택적인 오버라이딩
		System.out.println("공이 관충석으로 날아감");
	}
	
	public static void main(String[] args) {
		new Test33Ball().fly();
	}

}
