package notepad;

import java.util.Scanner;

/* Write a method to check, wether given number is perfect number or not
perfect number = sum of all divisor is that number e.g. 6 = 1 + 2 + 3 */

public class PerfectNumber {

	void checkNumberIsPerfect(int num) {
		int sum = 1;
		for(int index=2; index<=num/2; index++) {
			if(num % index == 0)
				sum = sum + index;
		}
		if(num == sum)
			System.out.println(num + " is  a perfect number");
		else
			System.out.println(num + " is not a perfect number");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		new PerfectNumber().checkNumberIsPerfect(num);
		sc.close();
	}
}
