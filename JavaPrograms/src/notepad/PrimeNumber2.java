package notepad;

/* Write a method to print first 10 prime numbers*/

public class PrimeNumber2 {

	int primeCount=0;
	
	boolean isNumberPrime(int num){
		boolean flag = true;
		for(int index=2; index<=num/2; index++) {
			if(num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	void displayPrimeNumbers(){
		int startIndex=1;
		while(primeCount < 10) {
			if(isNumberPrime(startIndex)) {
				System.out.println(startIndex + " is prime number");
				primeCount++;
			}
			startIndex++;
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber2 example = new PrimeNumber2();
		example.displayPrimeNumbers();
	}
}
