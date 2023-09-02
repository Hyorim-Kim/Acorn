package pack3;

public class Test22Student {   // Student class
	private String name = "blah";
	private int grade;
	private String gender;
	
	public Test22Student() {
		System.out.println("Student 생성자");
	}
	
	public void study() {
		System.out.println("study: " + grade + " 점");
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getGender() {
		return gender;
	}

}
