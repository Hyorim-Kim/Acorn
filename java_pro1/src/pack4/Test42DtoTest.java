package pack4;

import java.util.ArrayList;

public class Test42DtoTest {
	ArrayList<Test42StudentDto> list = new ArrayList<Test42StudentDto>();
	
	// Dto 전 몸풀기
	public void abc() {
		String[] persons = new String[3];
		persons[0] = "홍길동";
		persons[1] = "고길동";
		persons[2] = "신길동";
		
		System.out.println("인원 수 : " + persons.length);
		for(String p:persons) {
			System.out.println(p);
		}				
	}
	
	
	// Dto 적용하기
	public void insertData() {
//		Test42StudentDto dto = new Test42StudentDto("k01", "홍길동", 80);
//		Test42StudentDto dto2 = new Test42StudentDto("k02", "고길동", 80);
//		Test42StudentDto dto3 = new Test42StudentDto("k03", "신길동", 80);
		
		// DTO 클래스에 3명의 학생을 차례대로 생성자를 이용해 자료 입력
		Test42StudentDto dto = new Test42StudentDto("k01", "홍길동", 80);
		list.add(dto);   // dto를 List type의 컬렉션에 저장
		dto = new Test42StudentDto("k02", "고길동", 90);
		list.add(dto);
		dto = new Test42StudentDto("k03", "신길동", 95);
		list.add(dto);
		System.out.println("인원 수 : " + list.size());
		
		
		// DTO 클래스에 3명의 학생을 차례대로 setter를 이용해 자료 입력
		list.clear();   // 컬렉션 비우기
		// Test42StudentDto dto2 = new Test42StudentDto();
		Test42StudentDto dto2 = null;
		
		dto2 = new Test42StudentDto();
		dto2.setHakbun("y01");
		dto2.setIrum("홍길동");
		dto2.setJumsu(80);
		list.add(dto2);
		
		dto2 = new Test42StudentDto();
		dto2.setHakbun("y02");
		dto2.setIrum("고길동");
		dto2.setJumsu(90);
		list.add(dto2);
		
		dto2 = new Test42StudentDto();
		dto2.setHakbun("y03");
		dto2.setIrum("신길동");
		dto2.setJumsu(95);
		list.add(dto2);
	}

	public void showData() {
		// 컬렉션에 저장된 자료 출력
		System.out.println("인원 수 : " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i));
			Test42StudentDto dto = new Test42StudentDto();
			dto = list.get(i);
			System.out.println(dto.getHakbun() + " " + dto.getIrum() + " " + dto.getJumsu());
		}
	}
	
	
	public static void main(String[] args) {
		Test42DtoTest dtoTest = new Test42DtoTest();
		dtoTest.abc();
		System.out.println("-------------------");
		dtoTest.insertData();
		System.out.println("-------------------");
		dtoTest.showData();

	}

}
