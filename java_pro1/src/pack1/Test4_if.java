package pack1;

import java.util.Scanner;

public class Test4_if {
	public static void main(String[] args) {
		// 제어문 중 조건판단문 : if
		int num = 0;
		
		if(num >= 3) {       // { } 블럭화
			System.out.println("크군요");
			System.out.println("와우!");
			int su = 10;
			System.out.println("블럭 내의 su(지역 변수) : " + su);
		}
		// System.out.println("블럭 내의 su : " + su);
		
		if(num >= 1) {
			System.out.println("참일 때");
		}else {
			System.out.println("거짓일 때");
			System.out.println("거짓일 때 2");
		}
		
		System.out.println("\n다중 if---");
			
		// 키보드로 자료 입력 받기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String irum = sc.next();
		System.out.println("이름은 " + irum);
		System.out.print("점수 입력 : ");
		int jumsu = sc.nextInt();
		*/
		
		int jumsu = 50;
		
		if(jumsu >= 70) {
			if(jumsu >= 90) {
				System.out.println("수");
			}else {
				System.out.println("보통");
			}
		
		}else {
			if(jumsu >= 50) {
				System.out.println("저조");
			}else {
				System.out.println("엄청 저조");
			}
		}
		// 다중 if
		// 조건이 거짓일 때도 물어볼 수 있다
		jumsu = 55;
		String msg = "";
		if(jumsu >= 90) {
			msg = "수";
		}else if(jumsu >= 80) {
			msg = "우";
		}else if(jumsu >= 70) {
			msg = "미";
		}else if(jumsu >= 60) {
			msg = "양";
		}else {   // 마지막은 조건을 쓸 필요가 없다
			msg = "가";
		}
		System.out.println("결과는 " + msg);
	    
		// 8세 이하 65세 이상은 입장료 무료
		// 9세 이상 20세 미만은 3000원
		// 20세 이상 65세 미만은 5000원
		int age = 31;
		if(8 >= age || age >= 65) {
			System.out.println("무료");
		}else if(9 <= age && age < 20) {
			System.out.println("3000원");
		}else if(20 <= age && age < 65) {
			System.out.println("5000원");
		}
		
		if(8 >= age || age >= 65) {
			System.out.println("무료");
		}
		if(9 <= age && age < 20) {
			System.out.println("3000원");
		}
		if(20 <= age && age < 65) {
			System.out.println("5000원");
		}
		
		int total = 0;   // 최종 금액
		if(9 <= age && age < 20) {
			total = 3000;
		}else if(10 <= age && age < 65) {
			total = 5000;
		}
		System.out.println("입장료는 " + total + "원");
		
		//문제
		//키보드로 상품명, 수량, 단가를 입력받아 아래와 같이 출력
		//금액 = 수량 * 단가
		//금액이 5만원 이상이면 금액에 10%를 세금으로 징수
		//금액이 5만원 미만이면 금액에 5%를 세금으로 징수
		// 출력 --> 상품명:*** 금액:*** 세금:*** 최종액:***
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명 입력 : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("수량 입력 : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("단가를 입력 : ");
		
		String product = sc.next();
		String price = sc.next();
		String tax = sc.next();
		String finalPrice = sc.next();
		System.out.println("상품명: " + product + " 금액: " + price + " 세금: " + tax + " 최종액: " + finalPrice);
		*/
		
		/*
		int price = 310000;
		price = 
		if(price1 >= 50000) {
			System.out.println(price + price * 0.1 + "원");
		}else {
			System.out.println(price + price * 0.05 + "원");
			
		}
		}
		*/
		System.out.println("==================");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("상품명 : ");
		String sangpum = scanner.next();
		System.out.println("수량 : ");
		int su = scanner.nextInt();
		System.out.println("단가 : ");
		int dan = scanner.nextInt();
		int keum = su * dan;
		double se = 0.0;
		if(keum >= 50000) {
			se = keum * 0.1;
		}else {
			se = keum * 0.05;
		}
		System.out.println("상품명:" + sangpum + " 금액:" + keum + " 세금:" + se + " 최종액:" + keum + se);
		
	
		
		
		
		
		
		
		System.out.println("프로그램 종료");
		
		
	}
}





