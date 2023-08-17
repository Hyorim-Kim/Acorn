package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({"/HelloServlet", "/hello.korea", "/abc.*"})
public class HelloServlet extends HttpServlet {
	private HelloSub helloSub;
	
	@Override
	public void init() throws ServletException {
		// HelloServlet 최초 요청 시 딱 한 번 수행 (초기화 작업은 init에 하기)
		// 순서: init을 수행하고 doGet 수행함, 또 다시 HelloServlet 요청 들어오면 doGet만 수행됨(최초 한번만 만남)
		helloSub = new HelloSub();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get 요청 접수 완료");
		
		response.setContentType("text/html;charset=utf-8");   // Mime type과 문자코드
		PrintWriter out = response.getWriter();   // 객체 생성
		out.println("<html><body>");  // 출력 장소가 바뀌었기 때문에 html 형식을 삽입
		out.println("<h1>환영합니다. 서블릿 방문을...</h1>");  // out.println : 클라이언트 브라우저에 출력(출력장소가 바뀜)
		
		/*          24-36 line : java          */
		int a = 10, b = 20;
		//int tot = a + b;
		//System.out.println(tot);    // 콘솔에 출력
		//out.print("tot : " + tot);  // 브라우저에 출력
		
		// 두 수의 합을 구하는 메소드를 이용
		int tot = myCalc(a, b);
		out.println("두 수의 합 : " + "<b>" + tot + "</b>");
		
		// 다른 클래스의 메소드를 호출
		//HelloSub helloSub = new HelloSub();   // -> 객체가 요청 시 마다 생성 (절대 ㄴ)
		String result = helloSub.display(5);
		out.println(result);
			
		
		out.println("</body></html>");
		out.close();
	}
	
	@Override
	public void destroy() {
		// 웹 서비스가 종료될 때 딱 한 번 수행 (메모리 해제)
		helloSub = null;
	}
	
	private int myCalc(int a, int b) {   // 메소드 만들기
		return a + b;
	}

}
