package pack;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		ServiceDao dao = new ServiceDao();
		
		try {
			/*
			System.out.println("자료 저장");
			SangpumDto idto = new SangpumDto();
			idto.setCode("11");
			idto.setSang("신제품2");
			idto.setSu("15");
			idto.setDan("55000");
			dao.insData(idto);
			*/
			
			/*
			System.out.println("자료 수정");
			SangpumDto udto = new SangpumDto();
			udto.setCode("10");
			udto.setSang("감자튀김");
			dao.upData(udto);
			*/
			
			System.out.println("자료 삭제");
			boolean b = dao.delData(11);
			if(b) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
			
			System.out.println("전체 자료 읽기");
			List<SangpumDto> list = dao.selectAll();
			for(SangpumDto s:list) {
				System.out.println(s.getCode() + " " + s.getSang() + " " + s.getSu() + " " + s.getDan());
			}
			
			System.out.println("자료 읽기");
			SangpumDto dto = dao.selectData("1");
			System.out.println(dto.getCode() + " " + dto.getSang() + " " + dto.getSu() + " " + dto.getDan());
			
		} catch (Exception e) {
			System.out.println("err " + e);
		}		
	}
}
