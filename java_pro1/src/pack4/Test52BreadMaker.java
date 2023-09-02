package pack4;

public class Test52BreadMaker extends Thread{
	private Test52BreadPlate plate;
	
	public Test52BreadMaker(Test52BreadPlate plate) {
		this.plate = plate;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			plate.makeBread();
		}
	}
}
