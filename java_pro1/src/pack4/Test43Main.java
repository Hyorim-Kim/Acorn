package pack4;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test43Main {
	ArrayList<Test43HaksaengDto> list = new ArrayList<Test43HaksaengDto>();   // 멤버필드, 클래스 전체에서 사용가능
	
	public void inputData(String[] datas) {
		//문자열 자르기 클래스
		/*
		StringTokenizer tokenizer = new StringTokenizer("kbs,mbc,sbs", ",");
		String s1 = tokenizer.nextToken();
		String s2 = tokenizer.nextToken();
		System.out.println(s1 + " 이어서 " + s2);
		*/
		System.out.println(datas.length);
		
		for (int i = 0; i < datas.length; i++) {    // 배열-for
			//StringTokenizer : 문자열을 우리가 지정한 구분자로 쪼개주는 클래스
			StringTokenizer tokenizer = new StringTokenizer(datas[i], ",");
			String irum = tokenizer.nextToken();
			int kor = Integer.parseInt(tokenizer.nextToken());   // Integer.parseInt : "100" -> 100
			int eng = Integer.parseInt(tokenizer.nextToken());
			int mat = Integer.parseInt(tokenizer.nextToken());
			// 덮어쓰기 됨, 담아두기 위해 클래스 이용 (dto)***
			Test43HaksaengDto dto = new Test43HaksaengDto();
			dto.setName(irum);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMat(mat);
			list.add(dto);  // collection에 담기
		}
	}
	
	public void calcPrintData() {
//		for(Test43HaksaengDto hak:list) {
//			
//		}
		int count = 0;
		System.out.println("이름\t총점\t평균");
		for (int i = 0; i < list.size(); i++) {   // collections.size ,   array.length
			//System.out.println(list.get(i));
			Test43HaksaengDto dto = new Test43HaksaengDto();
			dto = list.get(i);
			int tot = dto.getKor() + dto.getEng() + dto.getMat();
			double avg = tot / 3;
			System.out.println(dto.getName() + "\t" + tot + "\t" + avg);
			count++;
		}
		System.out.println("인원수 : " + count);
		System.out.println("인원수 : " + list.size());
	}

	
	
	public static void main(String[] args) {
		// 레코드 단위(Dto)의 자료 처리
		String[] datas = new String[3];
		datas[0] = "김밥,100,100,100";  // 이 자료는 파일 또는 DB 등을 이용해 입력된 자료라고 가정
		datas[1] = "기밥,80,70,87";
		datas[2] = "주먹밥,76,77,88";
		
		Test43Main test43Main = new Test43Main();
		test43Main.inputData(datas);     // collection(List)에 자료 기억
		test43Main.calcPrintData();      // collection(List)에 자료를 읽어 총점, 평균을 계산 후 출력
		
	}

}
