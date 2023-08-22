package pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

public class connPooling {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataSource ds;

	public connPooling() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc_maria");
		} catch (Exception e) {
			System.out.println("db 연결 실패 : " + e.getMessage());
		}
	}

	public ArrayList<bangDto> getDataAll() {
		ArrayList<bangDto> list = new ArrayList<bangDto>();
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement("select * from miniguest");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				bangDto dto = new bangDto();
				dto.setCode(rs.getString("code"));
				dto.setName(rs.getString("name"));
				dto.setSubject(rs.getString("subject"));
				dto.setContents(rs.getString("contents"));
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("getDataAll err : " + e);
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				// Handle exception if necessary
			}
		}
		return list;
	}

	// 입력 자료 추가
	public boolean insertData(bangBean bean) {
		boolean b = false;
		try {
			System.out.println(bean.getName());  // 콘솔로 확인하기
			// 새로운 code 구하기
			String sql = "select max(code) as max from miniguest";
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// 한개면 if
			int maxCode = 0;
			if(rs.next()) {  // 자료가 없으면 if문 통과, 첫번째 레코드가 1이 됨
				maxCode = rs.getInt("max");  // 레코드가 있기 때문에 레코드 가장 큰 숫자 + 1이 됨
			}
			maxCode++;
			//System.out.println("새 코드 : " + maxCode);
			pstmt.close();  // maxCode 끝났기 때문에
			
			// 추가 작업(insert)
			sql = "insert into miniguest values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, maxCode);  // 첫번째 ?는 maxCode(int)
			pstmt.setString(2, bean.getName());
			pstmt.setString(3, bean.getSubject());
			pstmt.setString(4, bean.getContents());
			
			// execute
			// select문이 아니기 때문에 executeUpdate 사용
			int re = pstmt.executeUpdate();  // insert 반환값 받기. insert에 성공하면 1 리턴, 실패하면 0 리턴
			if(re == 1) b = true;
			
			
		} catch (Exception e) {
			System.out.println("insertData err : " + e);
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				// Handle exception if necessary
			}
		}
		return b;  // if(re == 1) b = true; 값이 성립 못하면 false(insert 실패)
	}
}
