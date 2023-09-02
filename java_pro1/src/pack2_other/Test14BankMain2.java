package pack2_other;

//import pack2.*;    // 다른 package의 클래스를 사용하려면 import
import pack2.Test14Bank;  // 권장
//import pack2.Test10Car;

public class Test14BankMain2 {
	// Test14Bank와 Test14BankMain은 다른 package에 존재
		public static void main(String[] args) {
			System.out.println("뭔가를 하다가...");
			
			Test14Bank john = new Test14Bank();
			System.out.println("john의 예금액은 " + john.getMoney());
			
			// Test10Car car = null;
			
			System.out.println();
			// 접근 지정자 영향 범위 확인
			//System.out.println("Bank의 private member : " + john.money);
			//System.out.println("Bank의 default member : " + john.imsi);
			System.out.println("Bank의 public member : " + john.imsi2);
		}

}
