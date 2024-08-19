package notepad;

/* Count the number of prime number within the given range*/

public class CountPrimeNumbers {

	int primeCount;
	
	void countPrimeNumbers(int startIndex, int endIndex) {
		for(int index=startIndex; index<=endIndex; index++) {
			boolean flag = isPrimeNumber(index);
			if(flag)
				primeCount++;
		}
	}
	
	boolean isPrimeNumber(int num) {
		boolean flag =true;
		for(int index=2; index<=num/2; index++) {
			if(num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		CountPrimeNumbers countPrimeNumbers = new CountPrimeNumbers();
		countPrimeNumbers.countPrimeNumbers(1,100);
		System.out.println("Total number of prime number in given range is : " + countPrimeNumbers.primeCount);
	}
}
