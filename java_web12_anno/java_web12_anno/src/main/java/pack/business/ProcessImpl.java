package pack.business;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory; 

import pack.mybatis.SqlMapConfig;

// 프로젝트 규모가 커질수록 목차를 보여주면 유지보수와, 알아보기가  쉬워진다. 
public class ProcessImpl implements ProcessInterface {
   private SqlSessionFactory factory = SqlMapConfig.getSqlSession(); // MyBatis SqlSessionFactory를 초기화
   
   @Override
   public List<DataDto> selectDataAll() {
      SqlSession sqlSession = factory.openSession(); // ※SqlSession을 열고
      List<DataDto> list = null;
      try {
         SqlMapperInter inter = (SqlMapperInter)sqlSession.getMapper(SqlMapperInter.class);
         // @Select( selectDataAll )입력한 SQL 쿼리를 실행하여 모든 직원 정보를 가져오는거임
         list = inter.selectDataAll();
      } catch (Exception e) {
         System.out.println("selectDataAll err : " + e);
      } finally {
         if(sqlSession != null) sqlSession.close(); // ※SqlSession을 닫고
      }
      
      return list; 
   }
   
   @Override
   public List<DataDto> selectDataAll2(String jikwon_name) {
       SqlSession sqlSession = factory.openSession(); // ※SqlSession을 열고
       List<DataDto> list = null;
       try {
           SqlMapperInter inter = (SqlMapperInter) sqlSession.getMapper(SqlMapperInter.class);
           // @Select( selectDataAll2 )입력한 SQL 쿼리를 실행하여 직원과 관련된 고객 정보를 가져오는거임
           list = inter.selectDataAll2(jikwon_name); // jikwon_name은 정 직원의 이름을 검색하고 해당 직원과 관련된 고객 정보를 가져오기 위한 파라미터임
           if (list != null) {
               for (DataDto dataDto : list) {
                   if (dataDto != null) {
                	   // 잘출력되는지 확인 한번해봄
                       System.out.println("고객 번호: " + dataDto.getGogek_no());
                       System.out.println("고객 이름: " + dataDto.getGogek_name());
                       System.out.println("고객 전화번호: " + dataDto.getGogek_tel());
                       System.out.println("고객 주민번호: " + dataDto.getGogek_jumin());
                       System.out.println("고객 성별: " + dataDto.getGender()); //**2.여기서 gender 값을 DataDto 객체에 설정하고 - list2로 ㄱㄱ
                       System.out.println("--------------------");
                   }
               }
           } else {
               System.out.println("조회된 결과가 없습니다.");
           }
       } catch (Exception e) {
           System.out.println("selectDataAll2 err: " + e);
       } finally {
           if (sqlSession != null) sqlSession.close(); // ※SqlSession을 닫고
       }

       return list;
   }
}