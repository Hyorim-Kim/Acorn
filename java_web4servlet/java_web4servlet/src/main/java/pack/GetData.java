package pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetData")
public class GetData extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get, post 모두 처리
		System.out.println("service 처리");  // 가장 먼저 실행됨
		String nai = request.getParameter("age");
		if(nai.equals("33")) {
			doGet(request, response);   // request, response 순서 바꾸면 X
		}else {
			doPost(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get 요청시 처리, 받을 때는 request 서버한테 넘길 때는 response
		String name = request.getParameter("name");
		String juso = request.getParameter("addr");   // name, juso, nai는 자바의 변수명
		String nai = request.getParameter("age");
		System.out.println(name + " " + juso + " " + nai);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post 요청시 처리
		System.out.println("doPost");

	}
}
