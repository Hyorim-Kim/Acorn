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
         // 형변환은 여기서는 안해줘도 그만이다.
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
   public DataDto selectDataPart(String id) {
      SqlSession sqlSession = factory.openSession();
      DataDto dto = null;
      try {
         SqlMapperInter inter = (SqlMapperInter)sqlSession.getMapper(SqlMapperInter.class);
         // @Select 사용
         dto = inter.selectDataPart(id); 
      } catch (Exception e) {
         System.out.println("selectDataPart err : " + e);
      } finally {
         if(sqlSession != null) sqlSession.close();
      }
      return dto; 
   }
   
   @Override
   public boolean insertData(DataFormbean bean) {
      boolean b = false;
      SqlSession sqlSession = factory.openSession();
      try {
         SqlMapperInter inter = (SqlMapperInter)sqlSession.getMapper(SqlMapperInter.class);
         if(inter.insertData(bean) > 0) b = true;
         sqlSession.commit(); 
      } catch (Exception e) {
         System.out.println("insertData err : " + e);
         sqlSession.rollback();
      } finally {
         if(sqlSession != null) sqlSession.close();
      }
      
      return b;
   }
   
   @Override
   public boolean updateData(DataFormbean bean) {
      boolean b = false;
      SqlSession sqlSession = factory.openSession();
      try {
    	  SqlMapperInter inter = (SqlMapperInter)sqlSession.getMapper(SqlMapperInter.class);
         // 비밀번호 비교 후 수정 여부를 판단하는 코드로직 작성
          DataDto dto = inter.selectDataPart(bean.getId());
         // 비밀번호가 일치하는 경우
         if(dto.getPasswd().equals(bean.getPasswd())) {
            if(inter.updateData(bean) > 0) b =true;
            sqlSession.commit();
         }
      } catch (Exception e) {
         System.out.println("updateData err : " + e);
      } finally {
         if(sqlSession != null) sqlSession.close();
      }
      return b;
   }
   
   @Override
   public boolean deleteData(String id) {
      boolean b = false;
      SqlSession sqlSession = factory.openSession();
      try {
    	 SqlMapperInter inter = (SqlMapperInter)sqlSession.getMapper(SqlMapperInter.class);
         int cou = inter.deleteData(id);
         if(cou > 0) b = true;
         sqlSession.commit();

      } catch (Exception e) {
         System.out.println("deleteData err : " + e);
         sqlSession.rollback();
      } finally {
         if(sqlSession != null) sqlSession.close();
      }
      
      return b;
      
      
      
   }



}