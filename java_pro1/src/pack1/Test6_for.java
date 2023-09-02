package pack1;

import java.util.Iterator;

public class Test6_for {

	public static void main(String[] args) {
		// 반복문 for
		int sum = 0;
		int a;
		for(a = 1; a <= 10; a++) {    //  for(초기치; 목적치; 증가치){반복할 수행문}
			System.out.println("출력" + a);
			//a = 9;  ---비권장, 지역변수 건들지말기
			sum += a;  //누적, 지역변수 초기화
		}
		System.out.println("탈출 후 a는 " + a);
		System.out.println("합은 " + sum);
		
		System.out.println();
		for(int i = 65; i <= 90; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((int)i + " ");
		}
		
		System.out.println();
		for (int i = 10; i > 1; i-=2) {
			System.out.print(i + " ");	
		}
		
		System.out.println();
		for (int ytn = 0, tvn = 5; ytn <= 5; ytn++, tvn++) {
			System.out.println(ytn + " " + tvn);
		}
		System.out.println();
		int aa = 1;
		for (; aa <= 5; aa++) {
			System.out.println(aa);	
		}
		
		System.out.println("다중 for ---");
		for (int m = 1; m <= 3; m++) {
			System.out.print("m : " + m);
			for (int n = 0; n <= 4; n++) {
				System.out.print("n : " + n + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for (char i = 65; i <= 90; i++) {
			System.out.print(i + ":");
			for (char j = i; j <= 'Z'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.println(" ");
			}
			for (int k = 1; k < 2 * (5 - i); k++) {
				System.out.print("*");
			}			
		}
		// 구구단 출력
		for (int count = 1; count < 10; count++) {
			System.out.println("3 * " + count + " = " + (3 * count));
		}
		
		System.out.println();
		// continue, break
		for (int i = 0; i <= 10; i++) {
			if(i == 3 || i == 5) continue;
			if(i == 7) break;   // for문 탈출
			//if(i == 7) return;  // m ethod의 종료
			//if(i == 7) System.exit(0);  // program 실행 종료
			System.out.println(i);
		}
		
		System.out.println();
		int kk = 0;
		for(;;) {   // 무한 루핑
			kk++;
			System.out.println("출력");
			if(kk == 3) break;
		}
		
		
		System.out.println();
		aa:for (int i = 1; i <= 3; i++) {
			bb:for (int j = 1; j <= 5; j++) {
				System.out.println(i + " " + j + " ");
				//if(j == 3) continue aa;
				if(j == 3) break aa;
			}
			System.out.println("***");
		}
		
		// 문제1 : 구구단 2~9 단 출력
		// 2 * 1 = 2 ~ 2 * 9 = 18
		// ..
		// 9 * 1 = 9 ~ 9 * 9 = 81
		System.out.println();
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		
		

		// 문제2 : 1 ~ 100 사이의 정수 중 3 의 배수이면서 5의 배수인 경우 값 출력, 그들의 합도 출력
		System.out.println();
        int summ = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " ");
				summ += i;
			}	
		}
		System.out.println("\n합은 " +summ);
	}

}
