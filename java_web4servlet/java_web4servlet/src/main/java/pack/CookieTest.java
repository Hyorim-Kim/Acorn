package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Cookie:클라이언트와 서버 간 통신 상태가 계속 유지되는 것처럼 보이기 위함
	// 서버가 클라이언트 컴에 특정 정보를 저장
	// 활용 예) 로그인 처리, 쇼핑몰 장바구니 처리, 방문 확인 등
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 로그인으로 쿠키 연습
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		// 쿠키가 없는 경우에만 로그인 화면 출력
		String id = null;
		String pwd = null;
		try {
			Cookie[] cookies = request.getCookies(); // 서버가 클라이언트 쿠키를 모두 읽음
			for (int i = 0; i < cookies.length; i++) {
				String name = cookies[i].getName();
				System.out.println("읽은 쿠키 name : " + name);
				if(name.equals("id")) {
					id = URLDecoder.decode(cookies[i].getValue(), "utf-8");     // Encoding 한 것 Decoding 하기
				}
				if(name.equals("pwd")) {
					pwd = URLDecoder.decode(cookies[i].getValue(), "utf-8");
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(id != null && pwd != null) {
			out.println(id + "님 쿠키를 통해 로그인 상태입니다");
			out.println("</body></html>");
			out.close();
			return;
		}

		out.println("* 로그인 *");
		out.println("<form method='post'>");
		out.println("i d : <input type='text' name='id'><br/>");
		out.println("pwd : <input type='text' name='pwd'><br/>");
		out.println("<input type='submit' value='로그인'>");

		out.println("</form>");
		out.println("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // 포스트는 한글깨짐
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println(id + " " + pwd);

		if (id.equals("aa") && pwd.equals("11")) {
			try {
				// 로그에 성공하면 쿠키 작성
				id = URLEncoder.encode(id, "utf-8");
				Cookie idCookie = new Cookie("id", id);
				idCookie.setMaxAge(60 * 60 * 24 * 365); // 쿠키 유효시간 (절대적이지 않음)

				pwd = URLEncoder.encode(pwd, "utf-8");
				Cookie pwdCookie = new Cookie("pwd", pwd);
				pwdCookie.setMaxAge(60 * 60 * 24 * 365);

				response.addCookie(idCookie); // 클라이언트 컴에 저장
				response.addCookie(pwdCookie);

				out.println("로그인 성공 - 쿠키가 설정됨");

			} catch (Exception e) {
				out.println("쿠키 작성 실패");
				System.out.println("쿠키 작성 실패 :" + e);
			}
		} else {
			out.println("로그인 실패");
		}
	}
}
