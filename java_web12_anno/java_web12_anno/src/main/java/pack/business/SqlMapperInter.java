package pack.business;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;



// SQL 쿼리문을 매핑할 인터페이스 작성 (DataMapper.xml 역할을 이 클래스 파일에 작성해줌)
// 대신 SqlMapConfig.java 에서 추가 코드를 작성해야함
public interface SqlMapperInter {
   @Select("select distinct jikwon_no, jikwon_name, jikwon_jik, jikwon_gen, jikwon_pay from jikwon") 
   List<DataDto> selectDataAll();
   
   @Select("SELECT gogek_no, gogek_name, gogek_tel, gogek_jumin, case WHEN SUBSTRING(gogek_jumin, 8, 1) IN ('1', '3') THEN '남성' ELSE '여성' END AS gender "
   		+ "FROM gogek INNER JOIN jikwon ON jikwon_no = gogek_damsano WHERE jikwon_name = #{jikwon_name}")
   List<DataDto> selectDataAll2(@Param("jikwon_name") String jikwon_name);
}