package pack4;

public class Test52BreadEater extends Thread{
	private Test52BreadPlate plate;
	
	public Test52BreadEater(Test52BreadPlate plate) {
		this.plate = plate;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			plate.eatBread();
		}
	}
}
