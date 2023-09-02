package pack3;

public abstract class Employee {
	private String irum;
	private int nai;
	
	public Employee(String irum, int nai) {
		this.irum = irum;
		this.nai = nai;
	}
	
	abstract double pay();
	abstract void print();
	
	public void display() {
		System.out.print("이름: " + irum + ", 나이: " + nai);
	}
	
	
	
}
