package pack2;

public class Test13Main {

	public static void main(String[] args) {
		Test13Memory tab = new Test13Memory();
		tab.display("갤탭");
		tab.display(12);
		tab.display("갤탭미니", "삼성");
		tab.display("삼성", 9);
		
		System.out.println();
		Test13Memory laptop = new Test13Memory();
		laptop.showData("갤럭시북", 18);
		
		System.out.println();
		Test13Memory desktop = new Test13Memory();
		laptop.showData("데스크탑", 24, null);
		
	}
}
