
public class StudentInfo extends PersonInfo {

		private String deptName;
		private int stuID;
	
		public StudentInfo(String name, int ID, String deptName, int stuID) {
			super(name, ID);
			this.deptName = deptName;
			this.stuID = stuID;
	}
	
		public void printStudentInfo() {
			super.printPersonInfo();
			System.out.println("deptName : " + deptName + "\nstuID : " + stuID);
			
		}
}
