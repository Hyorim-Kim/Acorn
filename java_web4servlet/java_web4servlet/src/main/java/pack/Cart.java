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


@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
          
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 장바구니 물건다미 처리용 : session 사용
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		//System.out.println(name + " " + price);
		
		HttpSession session = request.getSession(true);
		ArrayList<Goods> glist = (ArrayList)session.getAttribute("sangList");   // glist = null 상태
		if(glist == null) glist = new ArrayList<Goods>();   // 세션에 담을 Goods용 리스트 객체 생성
		glist.add(new Goods(name, price));   // 클라이언트에서 전송된 한 개의 상품자료가 Goods 타입으로 glist에 저장
		session.setAttribute("sangList", glist);    // sangList라는 키에 glist를 넣어줌 (첫번째 상품 들어감)
		
		// "sangList"라는 key로 세션에 저장된 glist의 내용을 table로 출력
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<html><body> ㅁ " + name + " 구입하셨습니다");	
		out.println("<br><br><a href='shop.html'>계속 쇼핑</a>");
		out.println("<br><a href='Buy'>결제하기</a><br>");
		out.println("<table>");
		out.println("<tr><th>상품명</th><th>가격</th></tr>");
		for (int i = 0; i < glist.size(); i++) {
			Goods goods = (Goods)glist.get(i);
			out.println("<tr>");
			out.println("<td>" + goods.getName() + "</td>");
			out.println("<td>" + goods.getPrice() + "</td>");
			out.println("</tr>");
		}		
		out.println("</table>");
		out.println("</body></html>");
		out.close();
		
		
		
		
	}

}
