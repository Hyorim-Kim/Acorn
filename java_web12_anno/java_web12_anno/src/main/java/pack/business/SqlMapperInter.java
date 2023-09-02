package pack.business;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


// SQL 쿼리문을 매핑할 인터페이스 작성 (DataMapper.xml 역할을 이 클래스 파일에 작성해준다.)
// 대신 SqlMapConfig.java 에서 추가 코드를 작성해야한다. 
public interface SqlMapperInter {
   @Select("select distinct jikwon_no, jikwon_name, jikwon_jik, jikwon_gen, jikwon_pay from jikwon") 
   List<DataDto> selectDataAll();
   
   @Select("select gogek_no,gogek_name,gogek_tel,gogek_jumin from gogek inner join jikwon on jikwon_no=gogek_damsano where gogek_damsano=#{jikwon_no}")
   List<DataDto> selectDataAll2(String jikwon_name);
}