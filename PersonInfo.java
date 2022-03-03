
public class PersonInfo {

		private String name;
		private int ID;

		public PersonInfo(String name, int ID) {
			this.name = name;
			this.ID = ID;
		}
	
		public void printPersonInfo() {
			System.out.println("name : " + name + "\nID : " + ID);
		}
}
