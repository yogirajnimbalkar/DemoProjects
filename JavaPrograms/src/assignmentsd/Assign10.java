package assignmentsd;

public class Assign10 {
	
	boolean isPrime(int num) {
		boolean flag = true;
		for(int index=2; index<=num/2; index++) {
			if(num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	//print number is prime or not
	void printNumberIsPrimeOrNot(int num) {
		boolean flag = isPrime(num);
		if(flag) {
			System.out.println(num + " is prime number");
		}else {
			System.out.println(num + " is not a prime number");
		}
	}
	
	// print number is prime
	void printIsNumberPrime(int num) {
		boolean flag = isPrime(num);
		if(flag)
			System.out.println(num + " is prime number");
	}
	
	//print prime number in given range
	void printPrimeNumbersInRange(int startIndex, int endIndex){
		for(int index=startIndex; index<=endIndex; index++) {
			boolean flag = isPrime(index);
			if(flag) {
				System.out.println(index + " is prime number");
			}
		}
	}
	
	//print count of prime number in given range
	void printCountOfPrimeNumberInRange(int startIndex, int endIndex) {
		int count=0;
		for(int index=startIndex; index<=endIndex; index++) {
			boolean flag = isPrime(index);
			if(flag)
				count ++;
		}
		System.out.println("Total number of prime numbers in range " + startIndex + " to " + endIndex +" is :" + count);
	}
	
	//print sum of prime numbers in given range 
	void printSumOfPrimeNumberInRange(int startIndex, int endIndex) {
		int sum=0;
		for(int index=startIndex; index<=endIndex; index++) {
			boolean flag = isPrime(index);
			if(flag)
				sum += index;
		}
		System.out.println("Sum of prime numbers in range " + startIndex + " to " + endIndex +" is :" + sum);
	}
	
	//print avg of prime number in given range
	void printAvgOfPrimeNumberInRange(int startIndex, int endIndex) {
		int sum=0, count=0;
		for(int index=startIndex; index<=endIndex; index++) {
			boolean flag = isPrime(index);
			if(flag) {
				sum += index;
				count++;
			}
		}
		System.out.println("Average of prime numbers in range " + startIndex + " to " + endIndex +" is :" + sum/(float)count);
	}
	
	public static void main(String[] args) {
		Assign10 assign10 = new Assign10();
		assign10.printNumberIsPrimeOrNot(18);
		assign10.printNumberIsPrimeOrNot(17);
		System.out.println("-------------------------");
		assign10.printIsNumberPrime(11);
		assign10.printIsNumberPrime(100);
		System.out.println("--------------------");
		assign10.printPrimeNumbersInRange(100, 120);
		System.out.println("---------------------");
		assign10.printCountOfPrimeNumberInRange(100, 120);
		System.out.println("---------------------");
		assign10.printSumOfPrimeNumberInRange(100, 120);
		System.out.println("---------------------");
		assign10.printAvgOfPrimeNumberInRange(100, 120);
		System.out.println("---------------------");
	}
}
