package pack2;
// 자바와 데이터베이스를 레코드 단위 처리하기 위해 생성
public class sangpumDto {
	private String code, sang;
	private int su, dan;  // 연산에 참여(암시)
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSang() {
		return sang;
	}
	public void setSang(String sang) {
		this.sang = sang;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}		
}
