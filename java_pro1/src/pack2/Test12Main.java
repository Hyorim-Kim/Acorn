package pack2;

public class Test12Main {

	public static void main(String[] args) {
		Test12Animal tiger = new Test12Animal();
		tiger.display();
		tiger.display(22);
		tiger.display("호랑이");
		tiger.display(25, "호랭이");
		tiger.display("호돌이", 30);
		
		System.out.println();
		Test12Animal hen = new Test12Animal(2, "암탉");
		hen.showData();
		
		System.out.println();
		Test12Animal dog = new Test12Animal(4);
		dog.showData();
		dog.display(3, "나는 개라고 해");
		dog.showData();
		
		System.out.println();
		Test12Animal wolfdog = new Test12Animal();  // 초기값으로 출력
		wolfdog.showData(); 
	}

}
