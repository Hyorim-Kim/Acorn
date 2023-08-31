package pack;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ServiceDao dao = new ServiceDao();
		
		try {

			System.out.println("자료 읽기");
			Scanner sc = new Scanner(System.in);
			System.out.print("부서명: ");
			String buser = sc.next();
			List<JikwonDto> list = dao.selectAll(buser);
			for(JikwonDto s:list) {
				System.out.println(s.getJikwon_no() + " " + s.getJikwon_name() + " " + s.getBuser_name() + " " + s.getJikwon_gen());
			}
			
		} catch (Exception e) {
			System.out.println("err " + e);
		}		
	}
}
