package pack.business;

import java.util.List;

public interface ProcessInterface {
	List<DataDto> selectDataAll();

	List<DataDto> selectDataAll2(String jikwon_name);
}
