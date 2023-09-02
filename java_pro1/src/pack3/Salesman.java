package pack3;

public class Salesman extends Regular{
	private int sales;
	private double commission;
	
	
	public Salesman(String irum, int nai, int salary, int sales, double commission) {
		super(irum, nai, salary);   // 부모에게 올리기
		this.sales = sales;   // salary? sales?
		this.commission = commission;
	}
	
	@Override
	public double pay() {
		return super.pay() + sales * commission;    // super.salary XXX
	}
	
	@Override
	public void print() {
		display();
		System.out.println(", 수령액: " + super.pay());
	}
	
}