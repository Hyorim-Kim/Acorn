package pack3;

public class Regular extends Employee{
	private int salary;
	
	
	public Regular(String irum, int nai, int salary) {
		super(irum, nai);   // 부모에게 올리기
		this.salary = salary;
	}
	
	@Override
	public double pay() {
		return salary;
	}
	
	@Override
	public void print() {
		display();
		System.out.println(", 급여: " + pay());
	}
}