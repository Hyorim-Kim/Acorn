package pack4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Collection : 객체를 담을 수 있는 기억장소
// Set, List, Map 타입 ...

public class Test39SetTest {
	public static void main(String[] args) {
		// Set type : 중복 불가, 순서 X
		// 참고 Collection클래스<Generic> : Generic은 Collection을 저장할 객체의 타입을 제한
		HashSet<String> list = new HashSet<String>();
		// list.add(1);
		list.add("kor");
		list.add("eng");
		list.add("mat");
		list.add("kor");
		System.out.println(list.size());
		list.remove("eng");   // 죽이기
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.toArray());  // 주소
		System.out.println("---------------");
		print(list.toArray());
		System.out.println("---------------");
		print(list);
	}
	
	public static void print(Object[] obj) {
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		// 배열은 향상된 for 사용 가능
		for(Object ob : obj) {
			System.out.println(ob);
		}
	}

	
	public static void print(Set set) {
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			String str = (String)iter.next();   // 오브젝을 넘길 수 없어 캐스팅함
			System.out.println(str);
		}
		
	}
}
