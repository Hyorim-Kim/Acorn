package pack3;

public class Test27Lion extends Test27Animal{
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "사자";
	}
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "고기";
	}
	
	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "밤";
	}
	
	public void eatOther() {
		System.out.println("가끔은 물도 마심");
	}
}
