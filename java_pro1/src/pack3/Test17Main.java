package pack3;

public class Test17Main {

	public static void main(String[] args) {
		// 완성차 운전
		//Test17PohamCar james = new Test17PohamCar();
		//james.turnHandle(0);     // java.lang.NullPointerException
		
		Test17PohamCar tom = new Test17PohamCar("미스터 톰");
		tom.turnHandle(25);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);
		
		tom.turnHandle(0);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);
		
		Test17PohamCar oscar = new Test17PohamCar("오스카");
		oscar.turnHandle(-10);
		System.out.println(oscar.ownerName + "의 회전량은 " + oscar.turnShow + " " + oscar.handle.quantity);
	}

}
