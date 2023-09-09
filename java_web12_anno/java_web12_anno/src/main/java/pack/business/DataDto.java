package pack.business;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataDto {
	private String jikwon_no,jikwon_name,jikwon_jik,jikwon_gen,jikwon_pay,gogek_no,gogek_name,gogek_tel,gogek_jumin;
	private String gender; // **1. gender 필드를 먼저 추가해야함 (sql문에서 성별을 gender라고 별명을 만듬)
						   // - 이제 ProcessImpl의 selectDataAll2 가보자
}
