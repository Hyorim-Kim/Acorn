package pack3;

public class Temporary extends Employee{
	private int ilsu;
	private int ildang;
	
	
	public Temporary(String irum, int nai, int ilsu, int ildang) {
		super(irum, nai);   // 부모에게 올리기
		this.ilsu = ilsu;
		this.ildang = ildang;
	}
	
	@Override
	public double pay() {
		return ilsu * ildang;
	}
	
	@Override
	public void print() {
		display();
		System.out.println(", 월급: " + pay());
	}
}