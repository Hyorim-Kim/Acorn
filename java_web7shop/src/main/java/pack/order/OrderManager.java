package pack.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class OrderManager {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataSource ds;
	
	public OrderManager() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc_maria");
		} catch (Exception e) {
			System.out.println("db 연결 실패 : " + e.getMessage());
		}
	}
	
	public void insertOrder(OrderBean orderBean) {
		try {
			String sql = "insert into shop_order(product_no,quantity,sdate,state,id) values(?,?,now(),?,?)";
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, orderBean.getProduct_no());
			pstmt.setString(2, orderBean.getQuantity());
			pstmt.setString(3, "1");
			pstmt.setString(4, orderBean.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("insertOrder err : " + e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					rs.close();
				if (conn != null)
					rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public ArrayList<OrderBean> getOrder(String id){
		ArrayList<OrderBean> list = new ArrayList<OrderBean>();
		try {
			String sql = "select * from shop_order where id=? order by no desc";
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {  // 참조할 대상이 있으면 true return, 없으면 false return -> while 빠져나감
				OrderBean bean = new OrderBean();
				bean.setNo(rs.getString("no"));
				bean.setProduct_no(rs.getString("product_no"));
				bean.setQuantity(rs.getString("quantity"));
				bean.setSdate(rs.getString("sdate"));
				bean.setState(rs.getString("state"));
				bean.setId(rs.getString("id"));
				list.add(bean);  // 컬렉션에 담기
			}			
		} catch (Exception e) {
			System.out.println("getOrder err : " + e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					rs.close();
				if (conn != null)
					rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
}
