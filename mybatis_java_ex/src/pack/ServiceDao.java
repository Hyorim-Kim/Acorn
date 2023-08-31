package pack;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class ServiceDao {
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	public List<JikwonDto> selectAll(String buser) throws Exception{
		// SqlSession를 생성하기 위해 SqlSessionFactory를 사용한다.
		// 세션을 한번 생성하면 매핑구문을 실행하거나 커밋 또는 롤백을 하기 위해 세션을 사용할수 있다.
		SqlSession sqlSession = factory.openSession();  // 세션(SQL 매핑 처리 단위) 열기
		List<JikwonDto> list = sqlSession.selectList("selectDataAll", buser);  // DataMapper.xml의 id를 호출, 반환값이 복수면 List
		sqlSession.close();
		return list;  // 전체내용 읽기
	}
}
