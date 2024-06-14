package assignmentsd;

public class Assign5 {

	int bankAccNo;
	String username, password;
	
	void setDetails(int accno, String uname, String pwd) {
		bankAccNo = accno;
		username = uname;
		password = pwd;
	}
	
	void updatePassword(String pwd) {
		password = pwd;
	}
	
	void displayDetails() {
		System.out.println("Bank Account no : " + bankAccNo);
		System.out.println("User name : " + username);
		System.out.println("Password : " + password);
	}
	
	public static void main(String[] args) {
		Assign5 assign5 = new Assign5();
		Assign5 assign5_1 = new Assign5();
		assign5.setDetails(1001, "Yogesh", "Yogesh@123");
		assign5_1.setDetails(3254, "Sachin", "Sach@dulkar");
		assign5.displayDetails();
		assign5_1.displayDetails();
		assign5.updatePassword("Test@123");
		assign5.displayDetails();
	}
}
