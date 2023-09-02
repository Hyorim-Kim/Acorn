package pack3;

public interface Test28Volume {  // 다중상속 interface
	void volumeUp(int level);    // public abstract 메소드가 됨
	void volumeDown(int level);
	
	/*
	public void print() {
		System.out.println("일반 메소드는 인터페이스 멤버가 될 수 없어요");
	}
	*/
}
