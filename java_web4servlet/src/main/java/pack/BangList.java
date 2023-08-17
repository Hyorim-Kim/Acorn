package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BangList")
public class BangList extends HttpServlet {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;   // select면 ResultSet 필요
	
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		// MariaDB 드라이버 로딩 파일 로딩 후 DB 연결 객체 생성
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bangdb", "root", "seoho123");
			pstmt = conn.prepareStatement("select * from miniguest order by code desc");
		} catch (Exception e) {
			System.out.println("init 연결 실패 : " + e);
		}
	}


	public void destroy() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>* 글 내용 보기 *</h2>");
		out.println("<table border='1'>");
		out.println("<tr><th>코드</th><th>작성자</th><th>제목</th><th>내용</th></tr>");
		try {
			rs = pstmt.executeQuery();
			while(rs.next()) {
				out.println("<tr>");
				out.println("<td>" + rs.getString("code") + "</td>");
				out.println("<td>" + rs.getString("name") + "</td>");
				out.println("<td>" + rs.getString("subject") + "</td>");
				out.println("<td>" + rs.getString("contents") + "</td>");
				out.println("<tr>");
			}
		} catch (Exception e) {
			System.out.println("doGet err : " + e);
		}
			
		out.println("</table>");
		out.println("<br><a href='bang.html'>글쓰기</a>");
		out.println("</body></html>");
		out.close();
	}

}
