package pack;

public class Test9gugudan {
	public Test9gugudan() {
		// TODO Auto-generated constructor stub
	}
	
	// Business Logic은 별도의 클래스(빈즈)로 작성 후 조립
	public int[] processGugu(int dan) {
		int gu[] = new int[9];
		for(int i=1; i<10; i++) {
			gu[i - 1] = dan * i;
		}
		return gu;
	}
}
