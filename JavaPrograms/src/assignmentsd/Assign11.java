package assignmentsd;

public class Assign11 {

	/* Write a method to find out required numbers to generate sum more than 100.
	output : 14 */
	int countOfNumersForSum() {
		int index =0, sum=0;;
		while (sum <= 100) {
			++index;
			sum = sum + index;
		}
		return index;
	}
	
	/* print first N prime numbers*/
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
	
	void prinNumberOfPrimeNumbers(int num) {
		int count = 0, index=2;
		while(count < num) {
			boolean flag = isPrime(index);
			if(flag) {
				count++;
				System.out.println(index + " is prime");
			}
			index++;
		}
	} 
	
	public static void main(String[] args) {
		Assign11 assign11 = new Assign11();
		System.out.println("Numbers to required sum more than 100 is : " + assign11.countOfNumersForSum());
		System.out.println("---------------------------------------------");
		assign11.prinNumberOfPrimeNumbers(10);
	}
}
