package pack3;

public class Test22Main {

	public static void main(String[] args) {
		Test22Student student = new Test22Student();
		System.out.println("name : " + student.getName());
		System.out.println("grade : " + student.getGrade());
		System.out.println("gender : " + student.getGender());
		
		System.out.println("\nTom의 정보");
		Test22Tom tom = new Test22Tom();
		System.out.println("name : " + tom.getName());
		System.out.println("grade : " + tom.getGrade());
		System.out.println("gender : " + tom.getGender());
		System.out.println("spec : " + tom.spec);
		


	}

}
