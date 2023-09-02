package pack3;

public class Manager extends Regular{
	private double incentive;
	
	
	public Manager(String irum, int nai, int salary) {
		super(irum, nai, salary);   // 부모에게 올리기
	}
	
	@Override
	public double pay() {
		if(super.pay() >= 2500000)
			incentive = super.pay() * 0.6;
		else if(super.pay() >= 2000000)
			incentive = super.pay() * 0.5;
		else
			incentive = super.pay() * 0.4;
		
		return super.pay() + incentive;    // super.salary XXX 
	}
	
	@Override
	public void print() {
		display();
		System.out.println(", 수령액: " + pay());
	}
	
}