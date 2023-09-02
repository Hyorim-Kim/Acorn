package pack3;

public class Test19GrandFa {   // 할아버지 클래스
	private int nai = 80;
	public String gabo = "상감청자";
	protected String gahun = "바르게 살자";   // 다른 패키지에서 자식 클래스에서만 public
	
	public Test19GrandFa() {
		System.out.println("할아버지 생성자");
	}
 
	public Test19GrandFa(int nai) {
		this();   // 생성자를 호출, 다른 statement보다 먼저 작성하기
		System.out.println("할아버지!!!");
		this.nai = nai;
	}
	
	public String say() {
		return "할아버지 말씀 : 열씨미 일허자";
	}
	
	public void eat() {
		System.out.println("밥은 맛있게...");
	}
	
	public int getNai() {
		return nai;
	}
	
	
	
	
	
}
