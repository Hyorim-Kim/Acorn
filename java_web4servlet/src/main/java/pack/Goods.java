package pack;

public class Goods {     // DTO(VO) 역할 (레코드 단위로 장바구니의 입력정보를 저장)
	private String name;
	private int price;
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}
