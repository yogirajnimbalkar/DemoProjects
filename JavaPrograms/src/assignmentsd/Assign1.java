package assignmentsd;

public class Assign1 {

	/*Create a class called Bank
	- currentBalance = 10000
	- debitBalance()
	- creditBalance()
	- displayBalance()
	*/

	int currentBalance = 10000;
	
	void debitBalance(int amount) {
		currentBalance = currentBalance - amount;
	}
	
	void creditBalance(int amount) {
		currentBalance = currentBalance + amount;
	}
	
	void displayBalance() {
		System.out.println("Current balance is : " + currentBalance);
	}
	
	public static void main(String[] args) {
		Assign1 assign1 = new Assign1();
		assign1.debitBalance(1000);
		assign1.debitBalance(5000);
		assign1.creditBalance(7000);
		assign1.creditBalance(8000);
		assign1.displayBalance();
	}
}
