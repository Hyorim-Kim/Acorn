package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Bang")
public class Bang extends HttpServlet {
	private Connection conn;
	private PreparedStatement pstmt;
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		// MariaDB 드라이버 파일 로딩 후 DB 연결 객체 생성
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bangdb", "root", "seoho123");
			pstmt = conn.prepareStatement("insert into miniguest(name, subject, contents) values(?,?,?)");
		} catch (Exception e) {
			System.out.println("init 연결 실패 : " + e);
		}
	}

	public void destroy() {   // 서비스가 종료될 때 만남
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {   // 두번째 실행 부터는 doPost만 반복
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String subject = request.getParameter("subject");
		String contents = request.getParameter("contents");
		//System.out.println(name + " " + subject + " " + contents);
		try {
			pstmt.setString(1, name);
			pstmt.setString(2, subject);
			pstmt.setString(3, contents);
			pstmt.executeUpdate();      // select 이외의 query는 executeUpdate
			
			//response.sendRedirect("bang.html");   // 자료 등록 후 입력화면을 호출
			response.setContentType("text/html;charset=utf8");
			PrintWriter out = response.getWriter();
			out.println("<html><body><b>" + name + "님 등록 완료</b>");
			out.println("<br/><a href='bang.html'>새글 입력</a>");
			out.println("<br/><a href='BangList'>글 내용 보기</a>");
			out.println("</table>");
			out.println("</body></html>");
			out.close();
			
		} catch (Exception e) {
			System.out.println("doPost err : " + e);
		}
	}

}
