package pack3;

public class Test29ResumeMain {

	public static void main(String[] args) {
		System.out.println("톰이 이력서 작성 후 확인 ---");
		Test29Tom tom = new Test29Tom();
		tom.setIrum("톰");
		tom.setJunhwa("111-1111");
		tom.setJuso("역삼1동");
		tom.print();
		
		System.out.println("제임스가 이력서 작성 후 확인 ---");
		Test29James james = new Test29James();
		james.setIrum("제임스");
		james.setJunhwa("222-2222");
		james.setSkill("자바 개발 경험");
		james.print();

		System.out.println("\n인사 담당자가 지원자 이력서 확인 ---");
		Test29Resume[] resBox =new Test29Resume[2];
		resBox[0] = tom;
		resBox[1] = james;
		
		for(Test29Resume r:resBox) {
			r.print();
			System.out.println();
		}
	}

}
