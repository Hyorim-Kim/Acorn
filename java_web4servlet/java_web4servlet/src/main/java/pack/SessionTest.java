package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionTest")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 세션은 방문자의 요청에 따른 정보를 방문자 메모리에 저장하는 것이 아닌 웹 서버가 세션 아이디 파일을 만들어
	// 서비스가 돌아가고 있는 서버에 저장을 하는 것을 말한다.

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// service : get과 post를 모두 받음
		HttpSession session = request.getSession(true);    // 현재 접속한 사용자의 세션이 있으면 읽고, 없으면 생성 O
		//HttpSession session = request.getSession(false);   // 현재 접속한 사용자의 세션이 있으면 읽고, 없으면 생성 X
		
		session.setMaxInactiveInterval(5);   // 60초 간 세션 유효 (기본값은 30분)
		
		if(session != null) {
			session.setAttribute("name", "홍길동");
		}
		
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");		
		out.println("session id : " + session.getId());
		out.println("<br>사용자명 : " + session.getAttribute("name"));
		out.println("</body></html>");
		out.close();
	}

}
