package notepad;

/* Write a method to print prime number within the given range*/

public class PrimeNumbersInRange {

	void printPrimeNumbers(int startIndex, int endIndex) {
		for(int index=startIndex; index<=endIndex; index++) {
			boolean flag = isPrimeNumber(index);
			if(flag)
				System.out.println(index + " is prime number");
		}
	}
	
	boolean isPrimeNumber(int num) {
		boolean flag = true;
		for(int index=2; index<= num/2; index++) {
			if( num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		PrimeNumbersInRange primenumber = new PrimeNumbersInRange();
		primenumber.printPrimeNumbers(1,100);
	}
}
