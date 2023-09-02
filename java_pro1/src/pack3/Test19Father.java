package pack3;

public class Test19Father extends Test19GrandFa{    // 클래스의 상속(is a관계)
	private int nai = 55;
	private int house = 1;   // Father 고유 멤버
	final public String gabo = "물병";
	
	public Test19Father() {
		super();     // 생략가능, (int)--> public Test19GrandFa(int nai)를 호출
		System.out.println("아버지 생성자 만세");
	}
	
	public Test19Father(int n) {
		super(n);
	}
	
	final public String say() {    // method override
		String abc = "아버지 말씀 : 상속을 이해하자";
		// gabo = "korea";   // gabo는 수정 불가
		return abc;
	}
	
	public int getNai() {    // method override
		return nai;
		//== return this.nai;
	}
	
	final public int getHouse() {   // Father 고유 멤버
		// 매의 자식은 오버라이딩 불가
		return house;
	}
	
	public void showData() {
		System.out.println("\nshowData 실행 결과");
		String gabo = "항아리";
		System.out.println(gabo);        // 지역 메소드
		System.out.println(this.gabo);   // 현재 클래스
		System.out.println(super.gabo);  // 부모 클래스
		
		System.out.println(getNai());
		System.out.println(this.getNai());
		System.out.println(super.getNai());
		
	}
}
