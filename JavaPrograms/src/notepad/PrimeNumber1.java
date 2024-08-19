package notepad;

/* Count the number of prime number, their sum and average within the given range*/

public class PrimeNumber1 {

	int primeCount, sum=0;
	float avg;
	
	void isPrimeNumber(int num) {
		boolean flag = true;
		for(int index=2; index<=num/2; index++) {
			if(num % index == 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			primeCount++;
			sum = sum + num;
		}
	}
	
	void checkPrimeNumberInRange(int startIndex, int endIndex) {
		for(int index=startIndex; index<=endIndex; index++) {
			isPrimeNumber(index);
		}
	}
	
	float getAverage() {
		avg = (float) sum/primeCount;
		return avg;
	}
	
	public static void main(String[] args) {
		PrimeNumber1 example1 = new PrimeNumber1();
		example1.checkPrimeNumberInRange(1, 100);
		System.out.println("Total prime number in given range is : " + example1.primeCount + " and their sum is : " + 
		example1.sum + " and their average is " + example1.getAverage());
	}
}
