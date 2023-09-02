package pack1;

import java.util.Scanner;

public class Test7_while {

	public static void main(String[] args) {
		// 반복문 while
		// while(조건){참인 동안 반복}
		int w = 1;
		while(w <= 5) {
			System.out.print("w: " + w + " ");
			w++;
		}
		System.out.println("\n반복문 수행 후 w:" + w);
		
		
		System.out.println();
		int count = 0;
		while(count < 10) {
			count++;
			System.out.println("count = " + count);
			if(count == 5) {
				System.out.println("아하 count가 5구만~");
			}
		}
		
	    System.out.println();
	    w = 0;
	    while(true) {  //무한루핑
	    	w++;
	    	if(w == 10) break;
	    	if(w % 2 == 0) continue;
	    	System.out.println("w = " + w);
	    }
	    
	    System.out.println();
	    int a = 1;
	    while(a <= 3) {
	    	System.out.print("a:" + a);
	    	int b = 1;
	    	while(b <= 4) {
	    		System.out.print("b:" + b);
	    		b++;
	    	}
	    	System.out.println();
	    	a++;
	    }
	    
	    System.out.println();
	    w = 10;
	    do {    // 최소 1회 수행
	    	System.out.println("do while의 w:" + w);
	    	
	    }while(w <= 5);
	    
	    
	    // while, if만 이용하여
	    // 문1 : 1 ~ 100 사이의 숫자 중 3의 배수 이지만 2의 배수가 아닌 수를 출력하고 합과 갯수 출력
	    System.out.println();
	    int m = 1;
	    int sum = 0;
	    int num = 0;
	    while(m <= 100) {
	    	if(m % 3 == 0 && m % 2 != 0) {	
	    		System.out.print("m: " + m + " ");
	    		sum += m;
	    		num++;
	    	}
	    	m++;
	    }
	    System.out.println("\n합 : " + sum + " 갯수:" + num);
	    
	    
	    
	    // 문2 : -1, 3, -5, 7, -9, 11 ~ 99 까지의 합 출력
	    System.out.println();
	    int i = 1;
	    int cnt = 1;
	    int summ = 0;
	    while(i <= 99) {
	    	//System.out.println("i : " + i);
	    	if(cnt % 2 == 0) {   //짝수 지역
	    		summ += i;
	    		//System.out.print(i + " ");
	    	}else {   //홀수지역
	    		int imsi = i * -1;
	    		summ += imsi;
	    	}
	    	cnt++;
	    	i += 2;
	    }
	    System.out.println("summ : " + summ);
	    
	    
	    // 키보드로 임의 정수를 입력받아 1부터 해당 수까지의 합을 출력
	    // 위 작업은 계속 반복됨. 반복할까요? 0을 누르면 처리 종료
	    System.out.println();
	    Scanner sc = new Scanner(System.in);
	    while(true) {
	    	System.out.print("양의 정수 입력 : ");
	    	int no = sc.nextInt();
	    	if(no < 1) {
	    		System.out.println("1보다 큰 정수를 입력하시오");
	    		break;
	    	}
	    	int n = 1, hap = 0;
	    	while(n <= no) {
	    		hap += n;
	    		n++;
	    	}
	    	System.out.println(no + "까지의 합은 " + hap);
	    	System.out.print("계속할까요?(0을 입력하면 종료)");
	    	int c = sc.nextInt();
	    	if(c == 0) {
	    		System.out.println("프로그램을 종료합니다.");
	    		break;
	    	}
	    }
	}
}
