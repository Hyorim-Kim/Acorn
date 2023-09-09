package pack.business;

import java.util.List;

public interface ProcessInterface {
	// ※이게 모든 직원정보를 검색하는 역할이면※
	// 직원 정보는 DataDto 객체의 리스트로 반환함
	List<DataDto> selectDataAll();
	
	// ※이거는 직원의 이름을 입력으로 받아 해당 직원과 연관된 고객 정보를 검색하는 역할을 수행하는 메서드임※
	// 이거 역시도 입력된 직원 이름에 해당하는 고객 정보를 DataDto 객체의 리스트로 반환 하는듯?
	// jikwon_name은 매개변수로 사용할려고 넣은거임(특정 직원의 이름을 검색하고 해당 직원과 연관된 고객 정보를 가져오기 위한 용도로 추가 한거라고 보면됨)
	List<DataDto> selectDataAll2(String jikwon_name);
}
