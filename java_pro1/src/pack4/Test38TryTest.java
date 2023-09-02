package pack4;

import java.io.FileReader;

// 예외 처리 - 자바가 외부장치(ex - 키보드 작업, 파일 작업, 네트워크 등)와 연결해서 작업하는 경우 대처 코드를 작성하도록 강요.
// 	      - 일반 명령문 작업 시에 에러가 발생할 의심적인 코드가 있을 때도 선택적으로 사용 가능.
// try ~ catch 문
// 다음은 예외처리를 위한 try, catch문의 기본 구조이다.
// try 블록에는 예외발생 가능 코드가 위치하고 만일 코드에 오류가 발생되면, 오류 종류(예외 클래스)에 맞는 catch 문으로 가서 catch 블록 안에 있는 코드를 실행 시킨다.
// 만일 오류가 발생하지 않으면 catch 문은 실행하지 않는다.

public class Test38TryTest {
	public void test() {
		try {
			int []arr = {1, 2, 3};
			System.out.println(arr[0]);
			System.out.println(arr[3]);
		} catch (Exception e2) {
			System.out.println("test 메소드에서 에러 처리 : " + e2);
		}
	}
	
	public static void main(String[] args) {
		//FileReader fr = new FileReader("c:\\work\\abc.txt");
		try {
			//int re = 10 / 0;   // 연산에 사용되는 데이터는 외부에서 입력된다고 가정
			int re = 10 / 2;
			System.out.println("re : " + re);	
			
			My my = new My();
			//My my = null;
			System.out.println(my.imsi);
			
			Test38TryTest tryTest = new Test38TryTest();
			tryTest.test();
			
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("0으로 나누면 안됩니다. 에러 메세지는 " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("객체 참조 에러 : " + e.getMessage());
		} catch (Exception e2) {
			System.out.println("나머지 모든 에러 처리 영역 : " + e2);
		} finally {
			System.out.println("에러와 상관없이 늘 수행");
		}
		
		System.out.println("응용 프로그램 종료");
	}

}
