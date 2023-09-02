package pack.business;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class ProcessImpl implements ProcessInterface{
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	@Override
	public List<DataDto> selectDataAll() {
		SqlSession sqlSession = factory.openSession();
		List<DataDto> list = null;
		try {
			list = sqlSession.selectList("selectDataAll");
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
			dto = sqlSession.selectOne("selectDataPart", id);
		} catch (Exception e) {
			System.out.println("selectDataPart err : " + e);
		} finally {
			if(sqlSession != null) sqlSession.close();
		}
		return dto;
	}

	@Override
	public boolean insertData(DataFormbean bean) {
		boolean b =false;
		SqlSession sqlSession = factory.openSession();
		try {
			if(sqlSession.insert("insertData",bean) > 0) b = true;
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
			// 비밀번호 비교 후 수정 여부 판단
			DataDto dto = selectDataPart(bean.getId());
			//System.out.println("========" + bean.getId());
			if(dto.getPasswd().equals(bean.getPasswd())) {
				bean.setColname("id");  // 칼럼명이 동적인 경우
				if(sqlSession.update("updateData", bean) > 0) {
					sqlSession.commit();
					b = true;
				}
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
			int cou = sqlSession.delete("deleteData", id);
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
	

