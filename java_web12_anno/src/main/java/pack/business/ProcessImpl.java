package pack.business;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory; 

import pack.mybatis.SqlMapConfig;

// 프로젝트 규모가 커질수록 목차를 보여주면 유지보수와, 알아보기가  쉬워진다. 
public class ProcessImpl implements ProcessInterface {
   private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
   
   @Override
   public List<DataDto> selectDataAll() {
      SqlSession sqlSession = factory.openSession();
      List<DataDto> list = null;
      try {
         SqlMapperInter inter = (SqlMapperInter)sqlSession.getMapper(SqlMapperInter.class);
         // @Select 사용
         list = inter.selectDataAll();
      } catch (Exception e) {
         System.out.println("selectDataAll err : " + e);
      } finally {
         if(sqlSession != null) sqlSession.close();
      }
      
      return list; 
   }
   
  
   
   @Override
   public List<DataDto> selectDataAll2(String jikwon_name) {
       SqlSession sqlSession = factory.openSession();
       List<DataDto> list = null;
       try {
           SqlMapperInter inter = (SqlMapperInter) sqlSession.getMapper(SqlMapperInter.class);
           list = inter.selectDataAll2(jikwon_name);
       } catch (Exception e) {
           System.out.println("selectDataAll2 err: " + e);
       } finally {
           if (sqlSession != null) sqlSession.close();
       }

       return list;
   }
}