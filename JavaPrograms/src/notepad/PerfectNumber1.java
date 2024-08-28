package notepad;

import java.util.Scanner;

/* Write a method to print first n perfect number
perfect number = sum of all divisor is that number e.g. 6 = 1 + 2 + 3 */

public class PerfectNumber1 {

	boolean isPerfectNumber(int num) {
		boolean flag = false;
		int sum = 1;
		for(int index=2; index<=num/2; index++) {
			if(num % index == 0)
				sum = sum + index;
		}
		if(num == sum)
			flag = true;
		return flag;
	}
	
	void printNPerfectNumbers(int num) {
		int count = 0;
		int index = 2;
		System.out.println("First "+ num + " perfect numbers are : ");
		while(count < num) {
			if(isPerfectNumber(index)) {
				count++;
				System.out.print(index + " ");
			}
			index++;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		PerfectNumber1 example1 = new PerfectNumber1();
		example1.printNPerfectNumbers(num);
		sc.close();
	}
}
