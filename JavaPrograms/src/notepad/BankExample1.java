package notepad;

/*Create a class called Bank
- currentBalance = 10000
- debitBalance()
- creditBalance()
- displayBalance()
*/

public class BankExample1 {

	int currentBalance = 10000;
	
	public void debitBalance(int amount) {
		currentBalance = currentBalance + amount;
	}
	
	public void creditBalance(int amount) {
		currentBalance = currentBalance - amount;
	}
	
	public void displayBalance() {
		System.out.println("Current Balance is : " + currentBalance);
	}
	
	public static void main(String[] args) {
		BankExample1 bankexample1 = new BankExample1();
		bankexample1.debitBalance(1000);
		bankexample1.debitBalance(5000);
		bankexample1.creditBalance(7000);
		bankexample1.creditBalance(8000);
		bankexample1.displayBalance();
	}
}
