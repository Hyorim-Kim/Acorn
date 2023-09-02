package pack3;

public class Test36AnonyMain {

	public static void main(String[] args) {
		// 내부 무명(익명) 클래스
		Test36Saram saram = new Test36Saram();
		System.out.println(saram.getIr());

		Test36Kildong kildong = new Test36Kildong();
		Test36Saram saram2 = kildong.getSaram();  // saram이 가지고 있는 메소드를 오버라이딩
		System.out.println(saram2.getIr());
	}
}
