package pack3;

public class Test28Radio implements Test28Volume{   // 다중상속 가능
	 	private int volLevel;
	 	
	 	public Test28Radio() {
	 		volLevel = 0;
		}
	 	
	 	@Override
	 	public void volumeUp(int level) {
	 		volLevel += level;
	 		System.out.println("라디오 불륨 올리면 " + volLevel);
	 	
	 	}
	 	
	 	@Override
	 	public void volumeDown(int level) {
	 		volLevel -= level;
	 		System.out.println("라디오 불륨 내리면 " + volLevel);
	 	
	 	}

}
