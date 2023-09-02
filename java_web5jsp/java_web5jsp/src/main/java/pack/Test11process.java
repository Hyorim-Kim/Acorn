package pack;

public class Test11process {
	// 총점과 평균 등의 작업을 위한 Business Logic
	
	private Test11formBean formBean;	
	
	public void setFormBean(Test11formBean formBean) {
		this.formBean = formBean;
	}
	
	public int getTot() {
		return formBean.getKor() + formBean.getEng();
	}
	
	public double getAvg() {
		return getTot() / 2.0;
	}
}
