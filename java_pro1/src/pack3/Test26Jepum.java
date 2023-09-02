package pack3;

public abstract class Test26Jepum {    // 추상클래스
	public int volume = 0;
	
	public Test26Jepum() {
		System.out.println("추상 클래스 생성자");
	}
	
	public abstract void volumeControl();    // 추상메소드(body가 없음)
	
	public void volumeShow() {
		System.out.println("소리 크기 : " + volume);
	}

}
