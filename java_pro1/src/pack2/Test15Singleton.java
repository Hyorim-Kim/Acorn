package pack2;

public class Test15Singleton {
	int kor = 10;
	
	// 싱글톤 패턴을 적용한 코드
	// 장점 : 메모리를 절약, 데이터 공요가 편리
	// 단점 : 테스트 불편, 유연성이 떨어짐
	private static Test15Singleton singleton = new Test15Singleton();
	public static Test15Singleton getInstance() {    // private static을 반환하기 위해 public static을 만든다
		return singleton;
	}
	
}
