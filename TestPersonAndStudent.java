
public class TestPersonAndStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonInfo person = new PersonInfo("이상준", 20215205);
		StudentInfo student = new StudentInfo("이상준", 20215205, "빅데이터", 12341234);
		
		person.printPersonInfo();
		
		System.out.println("*******************");
		
		student.printStudentInfo();
		
	}

}
