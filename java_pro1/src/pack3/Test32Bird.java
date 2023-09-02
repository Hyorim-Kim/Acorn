package pack3;

public class Test32Bird implements Test32Flyer{
	@Override
	public void fly() {
		System.out.println("날개를 휘저으며 멀리 날아감");
		
	}
	
	@Override
	public boolean isAnimal() {
		return true;
	}
}
