package notepad;

/* Write a method to check whether a number is prime or not*/

public class PrimeNumber {

	void displayNumberIsPrimeOrNot(int num) {
		boolean flag = true;
		for(int index=2; index<=num/2; index++) {
			if(num % index == 0) {
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(num + " is prime number");
		else
			System.out.println(num + " is not a prime number");
	}
	
	public static void main(String[] args) {
		PrimeNumber primenumber = new PrimeNumber();
		primenumber.displayNumberIsPrimeOrNot(18);
		primenumber.displayNumberIsPrimeOrNot(17);
	}
}
