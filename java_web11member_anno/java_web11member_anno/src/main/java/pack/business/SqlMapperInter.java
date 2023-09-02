package pack.business;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


// SQL 쿼리문을 매핑할 인터페이스 작성 (DataMapper.xml 역할을 이 클래스 파일에 작성해준다.)
// 대신 SqlMapConfig.java 에서 추가 코드를 작성해야한다. 
public interface SqlMapperInter {
   @Select("select * from membertab") 
   List<DataDto> selectDataAll(); // public 생략
   
   @Select("select * from membertab where id=#{id}")   
   DataDto selectDataPart(String id);
   
   @Insert("insert into membertab values(#{id},#{name},#{passwd},now())")
   int insertData(DataFormbean bean); // return 값이 int 이니 boolean 사용 x
   
   @Update("update membertab set name=#{name} where id=#{id}")
   int updateData(DataFormbean bean); 
   
   @Delete("delete from membertab where id=#{id}")
   int deleteData(String id); 

}