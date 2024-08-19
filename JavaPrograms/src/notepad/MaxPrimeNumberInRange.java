package notepad;

/* Write a method which will return a max prime number from given range */

public class MaxPrimeNumberInRange {

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
	
	int getmaxPrimenumber(int startIndex, int endIndex) {
		int maxPrimeNumber = 0;
		for(int index=startIndex; index<=endIndex; index++) {
			boolean flag = isNumberPrime(index);
			if(flag)
				maxPrimeNumber = index;
		}
		return maxPrimeNumber;
	}
	
	//Alternate
	int getmaxPrimeNumber1(int startIndex, int endIndex) {
		int maxPrimeNumber = 0;
		for(int index=endIndex; index>=startIndex; index--) {
			boolean flag = isNumberPrime(index);
			if(flag)
				maxPrimeNumber = index;
			if(maxPrimeNumber != 0)
				break;
		}
		return maxPrimeNumber;
	}
	
	public static void main(String[] args) {
		MaxPrimeNumberInRange example = new MaxPrimeNumberInRange();
		System.out.println("Max prime number in given range is : " + example.getmaxPrimenumber(1, 100));
		System.out.println("Max prime number in given range is : " + example.getmaxPrimeNumber1(1, 100));
	}
}
