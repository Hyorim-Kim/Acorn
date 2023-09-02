package pack3;

public class Test29James implements Test29Resume{
	// 신입 지원자 James
	private String irum, junhwa, skill;
	
	public Test29James() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setIrum(String irum) {
		if(irum.equals(null))
		    this.irum = "무명";
		else
			this.irum = irum;
	}
	
	@Override
	public void setJunhwa(String junhwa) {
		this.junhwa = junhwa;
	}
	
	@Override
	public void print() {
		//Test29Resume.SIZE = "B5";   // err : final이기 때문
		System.out.println("이력서 규격은 " + Test29Resume.SIZE);
		System.out.println("성명은 " + irum + ", 전화:" + junhwa);
		System.out.println("보유기술:" + skill);
	}
	
	public void setSkill(String skill) {    // james가 가진 일반 메소드
		this.skill = skill;
	}
}
