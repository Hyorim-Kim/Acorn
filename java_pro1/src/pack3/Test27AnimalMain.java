package pack3;

public class Test27AnimalMain {
	public static void main(String[] args) {
		Test27Cow cow = new Test27Cow();
		System.out.println(cow.name() + " " + cow.action() + "에 " + cow.eat() + " 먹음");
		cow.print();
		
		System.out.println();
		Test27Lion lion = new Test27Lion();
		System.out.println(lion.name() + " " + lion.action() + "에 " + lion.eat() + " 먹음");
		lion.print();
		lion.eatOther();
		
		System.out.println();
		Test27FindUtil findUtil = new Test27FindUtil();
		findUtil.find(cow);
		findUtil.find(lion);

	}

}
