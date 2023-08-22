package pack2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

public class Test14connPooling {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataSource ds;

	public Test14connPooling() {
		try {
			// JNDI(Java Naming and Directory Interface)는
			// 디렉터리 서비스에서 제공하는 데이터 및 객체를 발견(discover)하고 참고(lookup)하기 위한 자바 API다.
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc_maria"); // object으로 넘어오기 때문에 데이터 소스 타입으로 캐스팅
		} catch (Exception e) {
			System.out.println("db 연결 실패 : " + e.getMessage());
		}
	}

	public ArrayList<sangpumDto> getDataAll() {
		ArrayList<sangpumDto> list = new ArrayList<sangpumDto>();
		try {
			// db와 연결, ds가 정보를 갖고 있음 : ds =
			// (DataSource)context.lookup("java:comp/env/jdbc_maria");
			conn = ds.getConnection();
			pstmt = conn.prepareStatement("select * from sangdata"); // 칼럼명 쓰는 것을 권장
			rs = pstmt.executeQuery();
			// 1개일땐 if, 여러개면 while
			while (rs.next()) {
				// <sangpumDto> list : sangpumDto type
				sangpumDto dto = new sangpumDto();
				dto.setCode(rs.getString("code")); // rs.getString(1)
				dto.setSang(rs.getString("sang"));
				dto.setSu(rs.getInt("su")); // int로 넣으면 int로 받기
				dto.setDan(rs.getInt("dan"));
				// 계속 덮어쓰기 되는 걸 방지하기 위해
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
	public boolean insertData(sangpumBean bean) {  // true or false로 리턴
		boolean b = false;
		try {
			//System.out.println(bean.getSang());  // 콘솔로 확인하기
			// 신상 code 구하기
			String sql = "select max(code) as max from sangdata";
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// 한개면 if
			int maxCode = 0;
			if(rs.next()) {  // 자료가 없으면 if문 통과, 첫번째 레코드가 1이 됨
				maxCode = rs.getInt("max");  // 레코드가 있기 때문에 레코드 가장 큰 숫자 + 1이 됨
			}
			maxCode++;
			System.out.println("신상 코드 : " + maxCode);
			pstmt.close();  // maxCode 끝났기 때문에
			
			// 추가 작업(insert)
			sql = "insert into sangdata values(?,?,?,?)";  // 들어오는 데이터와 순서가 맞기 때문에 칼럼명 생략
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, maxCode);  // 첫번째 ?는 maxCode(int)
			pstmt.setString(2, bean.getSang());
			pstmt.setString(3, bean.getSu());
			pstmt.setString(4, bean.getDan());
			
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
	
	public sangpumDto getData(String code) {  // code에 해당하는 1개의 자료 읽기
		// 수정하기 위해 읽음
		System.out.println("code : " + code);  // 콘솔로 확인
		sangpumDto dto = null;
		try {
			// 화면에 레코드 값 넘겨주기
			String sql = "select * from sangdata where code=?";  // code=?" + code는 secure coding에 위배됨
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			// 받아오기
			rs = pstmt.executeQuery();
			// 포인터 이동 (true:데이터 있음 / false:데이터 없음)
			if(rs.next()) {
				dto = new sangpumDto();
				dto.setCode(rs.getString(1));
				dto.setSang(rs.getString(2));
				dto.setSu(rs.getInt(3));  // su, dan : int
				dto.setDan(rs.getInt(4));
			}
			
		} catch (Exception e) {
			System.out.println("getData err : " + e);
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				// Handle exception if necessary
			}
		}
		return dto;
	}
	
	public boolean updateData(sangpumBean bean) {
		boolean b = false;
		try {
			conn = ds.getConnection();
			String sql = "update sangdata set sang=?,su=?,dan=? where code=?";   // code는 수정 대상X
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bean.getSang());
			pstmt.setString(2, bean.getSu());
			pstmt.setString(3, bean.getDan());
			pstmt.setString(4, bean.getCode());
			
			// 받기
			if(pstmt.executeUpdate() > 0) b = true;
		} catch (Exception e) {
			System.out.println("updateData err : " + e);
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				// Handle exception if necessary
			}
		}
		return b;
	}
	
	public boolean deleteData(String code) {
		boolean b = false;
		try {
			conn = ds.getConnection();
			String sql = "delete from sangdata where code=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			if(pstmt.executeUpdate() > 0) b = true;  // 삭제됨		
			
		} catch (Exception e) {
			System.out.println("deleteData err : " + e);
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				// Handle exception if necessary
			}
		}
		return b;
	}
}
