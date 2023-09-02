package pack1;

import java.math.BigDecimal;


public class Test2 {
	public static void main(String[] args) {
		// 연산자 ---------------
		// 치환
		int a = 5;  // = <== 치환연산자
		
		// 산술
		int b = 3;
		int c = a + b;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);  // 나머지
		System.out.println(a / (double) b);
		
		//System.out.println(a / 0);  // 불능
		System.out.println(a / 0.0);  // infinity
		System.out.println(0 / 0.0);  // NaN(Not a Number)
		
		System.out.println(3 + 4 * 5);
		System.out.println((3 + 4) * 5);
		// 연산자 우선순위
		// ( ) > 산술(*,/ > +,-) > 비교(관계)연산 > 논리연산 > 치환
		
		// 문자열 더하기
		String ss1 =  "대한";  // String은 기본형이 아니고 참조형, 그런데 마치 기본형처럼 선언하고 사용
		String ss2 =  "민국";
		String ss3 = ss1 +ss2;  // 문자열 더하기 연산자
		System.out.println("ss3 : " + ss3);
		System.out.println("ss3 : " + ss3 + " " + 20 + 23);
		String ss4 = "5" + 6;
		System.out.println(ss4);
		
		int imsi = Integer.parseInt("5") + 6;
	    System.out.println(imsi);
	    String ss5 = Integer.toString(5) + 6;
	    System.out.println(ss5);
	    
	    // 누적
	    int no = 1;
	    no = no + 1;
	    no += 1;
	    no++;  // ++변수, --변수, 변수++, 변수--      증감연산자
	    ++no;
	    System.out.println("no : " + no);
	    
	    // 증감연산자는 가급적 다른 연산자와 함꼐 기술하지 않는다.
	    int su = 5;
	    int result = ++su + 1;
	    System.out.println("su : " + su);
	    System.out.println("result : " + result);
	    
	    int su2 = 5;
	    int result2 = su2++ + 1;
	    System.out.println("su2 : " + su2);
	    System.out.println("result2 : " + result2);
	    
	    // 부호에 대해
	    System.out.println();
	    int number = 3;
	    System.out.println(number);
	    System.out.println(-number);
	    System.out.println(number * -1);
	    
	    System.out.println("--------------");
		// 관계/논리 연산자
		int aa = 5;
	    System.out.println(aa > 3);  // >, >=, <, <=, ==, !=
	    System.out.println(aa != 3);
	    
	    System.out.println();
	    int bb = 10;
	    System.out.println(aa > 3 && bb <= 10);  // &&(and), ||(or)
	    System.out.println(aa > 6 || bb < 2 * 10);
	    
	    System.out.println();
	    // shift 연산자
	    int ii = 8, ij;   // 4byte(32bit) 기억장소 2개 선언
	    // System.out.println(ii + " " + ij);   // 지역변수는 초기화 필요
	    System.out.println("ii : " + ii + " " + Integer.toBinaryString(ii));
	    //System.out.println("ii : " + ii + " " + Integer.toHexString(ii));
	    //System.out.println("ii : " + ii + " " + Integer.toOctalString(ii));
	    
		ij = ii << 1;  // 좌측으로 1bit 이동, 남는 우측은 0으로 채움
		System.out.println("ij : " + ij + " " + Integer.toBinaryString(ij));
	    
		ij = ii >> 2;  // 우측으로 2bit 이동, 남는 좌측은 부호와 같은 값으로 채움
		System.out.println("ij : " + ij + " " + Integer.toBinaryString(ij));
		
		ij = ii >>> 2;  // 우측으로 2bit 이동, 남는 좌측은 부호와 0으로 채움
		System.out.println("ij : " + ij + " " + Integer.toBinaryString(ij));
		
		System.out.println();
		// 삼항 연산자
		int kbs = 9;
		int mbc = (kbs <= 5)?100:200 + 100;  // (조건)?참일때수행:거짓일때수행
		System.out.println("mbc : " + mbc);
		
		// 컴퓨터가 실수 연산시 오류를 발생시킬 때 처리
		double aaa = 1.5;
		double bbb = 1.1;
		System.out.println(aaa + bbb);
		System.out.println(aaa - bbb);
		BigDecimal d1 = new BigDecimal("2.0");
		BigDecimal d2 = new BigDecimal("1.1");
		System.out.println(d1.subtract(d2));
		
		// 기타
	}
}
