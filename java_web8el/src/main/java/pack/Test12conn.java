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
         System.out.println(" Driver 로딩 실패 : " + e);
         return;
      }
   }
   
   public ArrayList<sangpumDto> getDataAll(){
      ArrayList<sangpumDto> list = new ArrayList<sangpumDto>();
      try {
         // DB는 필요할 때 연결하고 처리가 끝나면 연결을 끈다.
         conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test","root","seoho123");
         String sql = "select * from sangdata";
         pstmt = conn.prepareStatement(sql);
         rs = pstmt.executeQuery();
         while(rs.next() == true) {
        	 sangpumDto dto = new sangpumDto();
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
            if(rs != null) rs.close();
            if(pstmt != null) pstmt.close();
            if(conn != null) conn.close();
         } catch (Exception e2) {
            
         }
      }
      return list;
   }
}
