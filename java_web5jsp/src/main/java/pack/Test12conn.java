package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Test12conn {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public Test12conn() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("Driver file 로딩 실패 : " + e);
			return;
		}
	}

	public ArrayList<Test12sangpumDto> getDataAll() {
		ArrayList<Test12sangpumDto> list = new ArrayList<Test12sangpumDto>();
		try {
			// db는 필요할 때 연결하고 처리가 끝나면 연결을 끊는다.
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test", "root", "seoho123");
			String sql = "select * from sangdata";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Test12sangpumDto dto = new Test12sangpumDto();
				dto.setCode(rs.getString("code"));
				dto.setSang(rs.getString("sang"));
				dto.setSu(rs.getString("su"));
				dto.setDan(rs.getString("dan"));
				list.add(dto);
			}
			
		} catch (Exception e) {
			System.out.println("getDataAll err : " + e);
		} finally {

			try {
				if (rs != null) rs.close();
				if (rs != null) pstmt.close();
				if (rs != null) conn.close();
			} catch (Exception e) {
				
			}

		}
		return list;
	}
	
	
		public Test12sangpumDto getData(int code) {
			Test12sangpumDto dto = null;
			try {
				// db는 필요할 때 연결하고 처리가 끝나면 연결을 끊는다.
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test", "root", "seoho123");
				String sql = "select * from sangdata where code=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, code);
				rs = pstmt.executeQuery();
				if(rs.next() == true) {
					dto = new Test12sangpumDto();
					dto.setCode(rs.getString("code"));
					dto.setSang(rs.getString("sang"));
					dto.setSu(rs.getString("su"));
					dto.setDan(rs.getString("dan"));
				}
				
			} catch (Exception e) {
				System.out.println("getDataAll err : " + e);
			} finally {

				try {
					if (rs != null) rs.close();
					if (rs != null) pstmt.close();
					if (rs != null) conn.close();
				} catch (Exception e) {
					
				}

			}
			return dto;
		}
	
	/*
	public static void main(String[] args) {
		Test12conn test12conn = new Test12conn();
		ArrayList<Test12sangpumDto> list = test12conn.getDataAll();
		for(Test12sangpumDto s:list) {
			System.out.println(s.getCode() + " " + s.getSang() + " " + s.getSu() + " " + s.getDan());
		}
	}
	*/
}
