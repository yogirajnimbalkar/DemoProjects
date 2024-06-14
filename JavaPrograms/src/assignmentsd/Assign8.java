package assignmentsd;

public class Assign8 {

	String username;
	int currentBalance=0, debitCount, creditCount, printBalanceCount;
	static int totalDebitCount, totalCreditCount, totalPrintBalance;
	
	void setUserDetails(String uname, int balance) {
		username = uname;
		currentBalance = balance;
	}
	
	void debitAmount(int amount) {
		if(currentBalance >= amount) {
			debitCount ++;
			totalDebitCount++;
			currentBalance = currentBalance - amount;			
		}
	}
	
	void creditAmount(int amount) {
		creditCount ++;
		totalCreditCount++;
		currentBalance = currentBalance + amount;
	}
	
	void displayBanlance() {
		printBalanceCount++;
		totalPrintBalance++;
		System.out.println(username + " current balance : " + currentBalance);
	}
	
	void displayTransactionSummary() {
		System.out.println(username +  " summary : " + " Credits : " + creditCount + " times, Debits : " + debitCount +
				" times, PrintBalance : " + printBalanceCount + " times");
	}
	
	void displayAllTransactionSummary() {
		System.out.println("All transaction summary : " + " Total Credits : " + totalCreditCount + " times, Total Debits : " + totalDebitCount +
				" times, Total PrintBalance : " + totalPrintBalance + " times");
	}
	
	public static void main(String[] args) {
		Assign8 assign8_1 = new Assign8();
		Assign8 assign8_2 = new Assign8();
		
		assign8_1.setUserDetails("Vivek", 10000);
		assign8_1.debitAmount(3000);
		assign8_1.debitAmount(2000);
		assign8_1.displayBanlance();
		assign8_1.creditAmount(8000);
		assign8_1.displayTransactionSummary();
		
		assign8_2.setUserDetails("Ranjeet", 5000);
		assign8_2.debitAmount(3000);
		assign8_2.creditAmount(9000);
		assign8_2.displayTransactionSummary();
		
		assign8_1.displayAllTransactionSummary();
	}
}
