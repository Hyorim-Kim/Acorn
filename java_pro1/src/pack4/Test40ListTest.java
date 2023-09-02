package pack4;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test40ListTest {

	public static void main(String[] args) {
		// List type : 순서가 있고 중복을 허용
		// List<String> list = new ArrayList<String>();  // 자식의 객체 주소를 부모 변수에게 치환함 (promotion)
		ArrayList<String> list = new ArrayList<String>();
		// Vector<String> list = new Vector<String>();  예전 방식
		list.add("kor");
		list.add("eng");
		list.add("mat");
		list.add("kor");
		System.out.println(list.size());
		list.remove("eng");   // 죽이기
		System.out.println(list.size());
		System.out.println(list);

	    System.out.println();
	    for(Object a:list) {
	    	System.out.println(a);
	    }
	}
}
