package pack3;

public class Test23Dog {
	private String name = "개";
	
	public Test23Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Test23Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String callName() {
		return "종류 : " + name;
	}
	
	public void print() {
		System.out.println(name + "는(은) 사람 곁에 산다");
	}

}
