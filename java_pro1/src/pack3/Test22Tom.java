package pack3;

public class Test22Tom extends Test22Student{
	private String name = "tom";
	public String spec = "자바";
	
	public Test22Tom() {
		System.out.println("Tom 생성자");
	}
	
	public void study() {    // method override
		//abc = "아버지 말씀 : 상속을 이해하자";
		//return System.out.println("study: " + grade + " 점");;
	}
	
	public String getName() {
		return name;
	}
	


		
	

}
