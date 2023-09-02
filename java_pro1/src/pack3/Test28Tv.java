package pack3;

public class Test28Tv implements Test28Volume{   // implements는 '구현'이라고 표현
	 	private int level;
	 	
	 	public Test28Tv() {
	 		level = 0;
		}
	 	
	 	@Override
	 	public void volumeUp(int level) {
	 		this.level += level;
	 		System.out.println("Tv 소리 올리면 " + level);
	 	
	 	}
	 	
	 	@Override
	 	public void volumeDown(int level) {
	 		this.level -= level;
	 		System.out.println("Tv 소리 내리면 " + level);
	 	
	 	}

}
