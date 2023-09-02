package pack2;

public class Test13Memory {
	public String name;
	private int size;
	String maker = "삼성";
	
	public Test13Memory() {  // 생성자
		name = "갤럭시";
	}
	
	public Test13Memory(int size) {  // 생성자 오버로딩
		name = "갤럭시";
		this.size = size;
	}

	
	
	public void setSize(int size) {   // setter 메소드
		this.size = 10;
	}
	
	
	public void display(String name) {
		System.out.println("name: " + name + ", size:" + size + ", maker: " + maker);
	}
	
	public void display(int size) {
		System.out.println("name: " + name + ", size:" + size + ", maker: " + maker);
	}
	
	public void display(String maker, int size) {
		System.out.println("name: " + name + ", size:" + size + ", maker: " + maker);
	}
	
	public void display(String name, String maker) {
		System.out.println("name: " + name + ", size:" + size + ", maker: " + maker);
	}
	
	public void showData(String name, int size) {
		System.out.println("name: " + name + ", size:" + size);
	}
	
	public void showData(String name, int size, String maker) {
		System.out.println("name: " + name + ", size:" + size + ", maker: " + maker);
	}

}


