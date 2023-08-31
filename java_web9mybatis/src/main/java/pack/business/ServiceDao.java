package pack.business;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import pack.mybatis.SqlMapConfig;

public class ServiceDao {
	// DB와 MyBatis 사이에서 실질적인 처리를 수행할 수 있도록 제어하는 서비스 클래스
	// SqlSessionFactory는 SqlSessionFactoryBean 구현체를 활용하여 생성하고 DataSource를 주입 받습니다.
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	public List<SangpumDto> selectAll() throws Exception{
		// SqlSession를 생성하기 위해 SqlSessionFactory를 사용한다.
		// 세션을 한번 생성하면 매핑구문을 실행하거나 커밋 또는 롤백을 하기 위해 세션을 사용할수 있다.
		SqlSession sqlSession = factory.openSession();  // 세션(SQL 매핑 처리 단위) 열기
		List<SangpumDto> list = sqlSession.selectList("selectDataAll");  // DataMapper.xml의 id를 호출, 반환값이 복수면 List
		sqlSession.close();
		return list;  // 전체내용 읽기
	}
	
	public SangpumDto selectData(String arg) throws SQLException{
		SqlSession sqlSession = factory.openSession();
		SangpumDto dto = sqlSession.selectOne("selectDataById", arg);  // #{code}와 매핑
		sqlSession.close();
		return dto;
	}
	
	public void insData(SangpumBean bean) throws Exception{
		/*
		SqlSession sqlSession = factory.openSession();  // 수동 commit
		sqlSession.insert("insertData", bean);
		sqlSession.commit();  // or rollback()
		sqlSession.close();
		*/
		
		SqlSession sqlSession = factory.openSession(true);  // true : 자동 commit
		sqlSession.insert("insertData", bean);
		sqlSession.close();
	}
	
	public void upData(SangpumBean bean) throws Exception{
		SqlSession sqlSession = factory.openSession();  // 수동 commit
		sqlSession.update("updateData", bean);
		sqlSession.commit();
		sqlSession.close();		
	}
	
	public boolean delData(int arg) {
		boolean result = false;
		SqlSession sqlSession = factory.openSession();
		try {
			int cou = sqlSession.delete("deleteData", arg);
			if(cou > 0) result = true;
			sqlSession.commit();
		} catch (Exception e) {
			System.out.println("delData err : " + e);
		} finally {
			if(sqlSession != null) sqlSession.close();
			sqlSession.rollback();
		}
		return result;
	}
}
