package pack;

public class HelloSub{
	private String name;
	
	public HelloSub() {
		System.out.println("HelloSub 생성자");
		name = "홍길동";
	}
	public String getName() {
		return name;
	}
	
	public String display(int n) {
		try {
			int su = 10 / n;
			return "<p>display 연산 결과: " + su + "<p/>";
		} catch (Exception e) {
			return "<p>display 에러 " + e + "<p/>";
		}
	}
	
}
