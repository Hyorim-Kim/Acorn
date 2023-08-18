package pack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/irum.go")
public class Test5Servlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String data = request.getParameter("data");
		
		System.out.println("data:" + data);
		
		// 파일 호출 방법1 : redirect - client를 통해 server에 파일을 요청
		response.sendRedirect("Test5called.jsp?data=" + data);
		
		// 파일 호출 방법2 : forward - server에서 곧바로 서버의 파일을 요청
		//request.setAttribute("mydata", data);
		//RequestDispatcher dispatcher = request.getRequestDispatcher("Test5called.jsp");
		//dispatcher.forward(request, response);
	}

}