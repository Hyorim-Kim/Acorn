package pack4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test41MapTest {

	public static void main(String[] args) {
		// Map type : key와 value로 객체를 저장, 순서가 없다. - 검색이 편리
		//HashMap<Object, Object> list = new HashMap<Object, Object>();   // Generic 타입 제한
		
		HashMap<String, String> list = new HashMap<String, String>();
		//list.put(1, "kor");
		//list.put("two", 123);
		list.put("1", "kor");
		list.put("2", "eng");
		list.put("three", "mat");
		list.put("4", "sci");
		list.put("5", "sta");
		System.out.println(list.size());
		System.out.println(list);   // {1=kor, 2=eng, 4=sci, 5=sta, three=mat}
		
		Set set = list.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			String key = (String)iter.next();
			System.out.println(key + " " + list.get(key));
		}
	}

}
