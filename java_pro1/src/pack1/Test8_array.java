package pack1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Test8_array {

	public static void main(String[] args) {
		// 배열(Array)
		// 성격이 일치하는 여러 개의 기억장소에 대해 대표명을 하나 부여하고
		// 각 기억장소는 대표명[첨자]로 표현하기
		// 여러 개의 기억장소를 한 번에 호출하기 쉽고, 반복처리가 효과적
		
		int abc = 0;   // 한 개의 기억장소를 선언
		System.out.println(abc);   // 0
		
		int [] ar;   // int ar = []; 배열 선언
		ar = new int[5];
		// int ar[] = new int[5];
		System.out.println(ar);  // [I@515f550a
		System.out.println("ar의 크기 : " + ar.length);
		ar[0] = 10;   // 각 기억장소는 첨자(index)로 구분, 첨자는 0부터 출발
		ar[2] = 20;
		ar[4] = ar[0] + ar[1]+ ar[2];   // 10 + 0 + 20
		System.out.println("ar[4] : " + ar[4]);
		//ar[5] = 50;   // Runtime error : java.lang.ArrayIndexOutOfBoundsException
		int a = 4, b = 2;
		ar[a] = ar[0] + ar[1]+ ar[2];
		System.out.println("ar[4] : " + ar[b + 2]);
		
		System.out.println();
		int[] ar1 = {1,2,3,4,5};
		System.out.println(ar1 + " " + ar1[0] + " " + ar1.length);
		System.out.println(ar1[0] + " " + ar1[1] + " " + ar1[2] + " " + ar1[3] + " " + ar1[4]);
		for(int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
			
		System.out.println();
		for(int i:ar1) {   // 향상된 for : 배열, 컬렉션에서 사용 가능
			System.out.println(i + " ");
		}
		
		System.out.println();
		String[] city = {"서울", "대전", "대구", "부산", "광주"};
		for(String my:city) {
			System.out.println("도시명 : " + my);
		}
		
		System.out.println();
		int ar2 [] = new int[5];
		for(int i = 0; i < ar2.length; i++) {
			ar2[i] = i + 1;
		}
		
		int tot = 0;
		for(int i = 0; i < ar2.length; i++) {
			System.out.println(ar2[i]);
			tot += ar2[i];
		}
		System.out.println("tot : " + tot);
		// 지금까지의 배열은 1차원 배열 : 열로 구성

	    System.out.println("다차원 배열");
	    // 2차원 배열은 행과 열로 구성
	    int su[][] = new int[3][4];
	    System.out.println(su.length + " " + su[0].length + " " + su[1].length);	
	    su[0][0] = 100;
	    System.out.println(su[0][0]);
	    
	    int num = 0;
	    for(int i = 0; i < su.length; i++) {
	    	for(int j = 0; j < su[i].length; j++) {
	    		su[i][j] = ++num;
	    	}
	    }
	    System.out.println(su[0][0]);
	    for(int i = 0; i < su.length; i++) {
	    	for(int j = 0; j < su[i].length; j++) {
	    		System.out.print(su[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    
	    // 키보드로 5개의 시험 점수를 입력받아 순위 출력
	    Scanner scanner = new Scanner(System.in);
	    int[] score = new int[5];   // 5명의 시험 점수
	    int[] rank = new int[5];    // 순위
	    int index = 0;
	    for(int i = 0; i < score.length; i++) {
	    	System.out.print((i + 1) + "번 점수는 ");
	    	score[i] = scanner.nextInt();
	    	rank[i] = 1;
	    }
	    System.out.println(Arrays.toString(score));
	    System.out.println(Arrays.toString(rank));
	    
	    for (int i = 0; i < score.length; i++) {
	    	for (int j = 0; j < score.length; j++) {
	    		index = score[i];
	    		if(score[j] > index) {
	    			rank[i] += 1;
	    		}
			}
	    }
	    System.out.println("결과는 ");
	    for (int i = 0; i < rank.length; i++) {
	    	System.out.println(score[i] + "점은 " + rank[i] + "등");
			
		}
	    
	}

}
