package pack3;

public class Test26Tv extends Test26Jepum{   // 오버라이드 후 에러사라짐
	public Test26Tv() {
		System.out.println("Tv 생성자");
	}
	
	@Override
	public void volumeControl() {
		// 부모가 가진 추상메소드를 오버라이딩 강요 당함
		System.out.println("Tv 소리 업 다운");
	}
	
	@Override    // 일반메소드 오버라이딩
	public void volumeShow() {
		int imsi = volume + 0;
		String ss = "소리 크기를 보여줘 ";
		System.out.println(ss + volume);
	}
}
