package pack3;

public class Test32Airplane implements Test32Flyer{
	@Override
	public void fly() {
		System.out.println("커다란 엔진소리와 함께 미세먼지 위 하늘로 날아감");
		
	}
	
	@Override
	public boolean isAnimal() {
		return false;
	}
}
