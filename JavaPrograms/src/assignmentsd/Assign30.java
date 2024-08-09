package assignmentsd;

import java.util.Scanner;

public class Assign30 {

	/* Reverse a given number
	 * e.g. input=1932 output=2391
	 */
	
	int getReverseNumber(int num) {
		int ans = 0;
		while(num > 0) {
			ans = (ans*10) + (num % 10);
			num = num/10;
		}
		return ans;
	}
	
	/* check the given number is armstrong or not e.g. 153, 371*/
	void chkNumberIsArmstrong(int num) {
		int ans = 0, num1 = num;
		while(num > 0) {
			int rem = num % 10;
			ans = ans + (rem * rem * rem);
			num = num / 10;
		}
		if(ans == num1)
			System.out.println(num1 + " is Armstrong number");
		else
			System.out.println(num1 + " is not Armstrong number");
	}
	
	/* check the given number is perfect number or not e.g. 28 = 1+2+4+7+14 */
	void chkNumberIsPerfectNumber(int num) {
		int ans = 0;
		for(int i=1; i<num; i++) {
			if(num % i == 0)
				ans = ans + i;
		}
		if(num == ans)
			System.out.println(num + " is perfect number");
		else
			System.out.println(num + " is not pperfect number");
	}
	
	/* check given number is perfect square  25, 121*/
	void chkNumberIsPerfectSquare(int num) {
		int ans = (int) Math.sqrt(num);
		if(ans*ans == num)
			System.out.println(num + " is perfect square number");
		else
			System.out.println(num + " is not a perfect square number");
	}
	
	public static void main(String[] args) {
		Assign30 assign30 = new Assign30();
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("Reverse number of given input is : " + assign30.getReverseNumber(input));
		assign30.chkNumberIsArmstrong(input);
		assign30.chkNumberIsPerfectNumber(input);
		assign30.chkNumberIsPerfectSquare(input);
		sc.close();
	}
}
