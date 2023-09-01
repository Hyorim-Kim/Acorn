package pack.business;

import java.util.List;

public interface ProcessInterface {
	List<DataDto> selectDataAll();
	DataDto selectDataPart(String id);
	boolean insertData(DataFormbean bean);
	boolean updateData(DataFormbean bean);
	boolean deleteData(String id);
}
