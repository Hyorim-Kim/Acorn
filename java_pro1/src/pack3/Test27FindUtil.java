package pack3;

public class Test27FindUtil {
	public void find(Test27Animal animal) {
		animal.print();
		
		if(animal instanceof Test27Cow) {     // instanceof : 객체타입비교 연산자
			Test27Animal a = animal;
			System.out.println("이름 : " + a.name());
		}else if(animal instanceof Test27Lion) {     // instanceof : 객체타입비교 연산자
			System.out.println("이름 : " + animal.name());
		}else {
			System.out.println("넌 누구?");		
		}
	}
}
