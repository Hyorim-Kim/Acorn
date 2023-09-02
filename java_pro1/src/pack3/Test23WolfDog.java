package pack3;

public class Test23WolfDog extends Test23Dog{
	private String where = "산";
	
	public Test23WolfDog(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println("사는 곳 : " + where + "안");
	}
	
	@Override
	public void print() {
		System.out.println(getName() + " : " + where + "에 사는 것으로 알려짐");
	}
	
	public void wolfDisplay() {
		print();
		// = this.print();
		super.print();
	}
}
