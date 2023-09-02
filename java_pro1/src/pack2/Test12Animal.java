package pack2;

public class Test12Animal {    // 기본값
	// method overload : 하나의 클래스 내에 동명 메소드 여러 개를 선언
	private int leg = 4;
	private int age;
	private String name = "강아지";
	public final static int MOUTH = 1;
	
	public Test12Animal() {
		// 생성자는 내용이 없을 경우 생략 가능
	}
	
	public Test12Animal(int leg) {   // 생성자 오버로딩
		this.leg = leg;
	}
	
	public Test12Animal(int leg, String name) {   // 생성자 오버로딩
		this.leg = leg;
		this.name = name;
	}
	
	//-----------------------------------------------------------
	public void display() {
		System.out.println("leg: " + leg + ", age:" + age + ", name: " + name);  //전역변수 age
	}
	
	public void display(int age) {   // 메소드 오버로딩
		System.out.println("leg: " + leg + ", age:" + age + ", name: " + name);  //지역변수 age
	}
	
	public void display(String name) {
		System.out.println("leg: " + leg + ", age:" + age + ", name: " + name);  //지역변수 age
	}
	
	public void display(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("leg: " + leg + ", age:" + age + ", name: " + name);  //지역변수 age
	}
	
	public void display(String name, int age) {
		System.out.println("leg: " + leg + ", age:" + age + ", name: " + name);  //지역변수 age
	}
	
	public void display(int leg, int age) { 
		System.out.println("leg: " + leg + ", age:" + age + ", name: " + name);
		System.out.println(MOUTH);
	}
	
	// 오버로딩 X
	/*
	public void display(int leg) {
		System.out.println("leg: " + leg + ", age:" + age + ", name: " + name);  //지역변수 age
	}
	
	private int display(int leg, int age) { 
		System.out.println("leg: " + leg + ", age:" + age + ", name: " + name);
		return 10;
	}
	*/
	
	public void showData() {
		System.out.println("leg: " + leg + ", age:" + age + ", name: " + name);
	}
	
	

}
