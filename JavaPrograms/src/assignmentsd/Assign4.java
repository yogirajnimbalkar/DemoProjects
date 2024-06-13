package assignmentsd;

public class Assign4 {

	String name, middlename, surname, birthdate, address;
	int rollnumber;
	
	void setStudentName(String sname, String smiddlename, String ssurname) {
		name = sname;
		middlename = smiddlename;
		surname = ssurname;
	}
	
	void setStudentOtherDetails(int rno, String bdate, String add) {
		rollnumber = rno;
		birthdate = bdate;
		address = add;
	}
	
	void displayStudentName() {
		System.out.println(name + " " + middlename + " " + surname);
	}
	
	void displayStudentDetails() {
		System.out.println(rollnumber);
		System.out.println(address);
		System.out.println(birthdate);
	}
	
	public static void main(String[] args) {
		Assign4 assign4 = new Assign4();
		assign4.setStudentName("Rahul", "Mahesh", "Mane");
		assign4.setStudentOtherDetails(7, "20 jun 1987", "G-809, Heaven Apartment, Baner, Pune");
		assign4.displayStudentName();
		assign4.displayStudentDetails();
	}
}
