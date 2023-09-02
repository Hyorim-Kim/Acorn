package pack3;

public class Test36Kildong {
	public Test36Saram getSaram() {
		//return new Test36Saram();  // 생성자 진행
		return new Test36Saram() 
		{   // 내부 무명(익명) 클래스
			@Override
			public String getIr() {
				// Test36Saram 클래스의 메소드를 오버라이딩
				return "홍길동";
			}
		};
	}
}
