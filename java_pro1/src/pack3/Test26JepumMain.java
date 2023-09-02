package pack3;

public class Test26JepumMain {
	public static void main(String[] args) {
		// 추상 메소드는 반드시 자식 클래스 오버라이딩을 강요하기 위한 강제 조치
		// Test26Jepum = jepum = new Test26Jepum();   // 객체 생성 불가(추상 클래스라서)
		Test26Jepum jepum;
		
		Test26Radio radio = new Test26Radio();
		radio.volumeControl();
		radio.volume = 5;
		radio.volumeShow();
		
		System.out.println();
		Test26Tv tv = new Test26Tv();
		tv.volumeControl();
		tv.volume = 7;
		tv.volumeShow();
		
		System.out.println("-----------");
		jepum = radio;
		jepum.volumeControl();
		jepum.volumeShow();
		System.out.println();
		jepum = tv;
		jepum.volumeControl();
		jepum.volumeShow();
	}

}
