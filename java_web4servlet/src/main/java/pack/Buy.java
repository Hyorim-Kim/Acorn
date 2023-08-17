package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Buy")
public class Buy extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false); // 세션이 있으면 읽고, 없으면 안만든다.
		if (session == null)
			return;

		ArrayList<Goods> glist = (ArrayList<Goods>) session.getAttribute("sanglist");
		if(glist == null) return;
		
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");	
		out.println("<table>");
		out.println("<tr><th>상품명</th><th>가격</th></tr>");
		
		int tot = 0;  // 가격의 총합 기억
		for (int i = 0; i < glist.size(); i++) {
			Goods goods = (Goods)glist.get(i);
			out.println("<tr>");
			out.println("<td>" + goods.getName() + "</td>");
			out.println("<td>" + goods.getPrice() + "</td>");
			out.println("</tr>");
			tot += goods.getPrice();
		}		
		out.println("</table>");
		out.println("<br>결제 총액 : " + tot);
		out.println("<br>고객님 감사합니다. <a href='shop.html'>새마음으로 쇼핑 고고</a>");	
		// 결제가 됐다고 가정하고 세션을 제거
		//session.invalidate();   // 해당 고객의 모든 세션 키를 삭제
		session.removeAttribute("sanglist");   // 해당 고객의 세션 중 특정 키를 삭제
		out.println("</body></html>");
		out.close();
	}

}
