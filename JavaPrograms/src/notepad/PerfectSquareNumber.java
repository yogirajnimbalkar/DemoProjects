package notepad;

import java.util.Scanner;

/* Write a method to check, wether given number is perfect square umber or not
perfect square number = 16 = 4*4, 9 = 3*3 */

public class PerfectSquareNumber {

	static void checkNumberIsPerfectSquare(int num) {
		int num1 = (int) Math.sqrt(num);
		int ans = num1 * num1;
		if(num == ans)
			System.out.println(num + " is a perfect square number");
		else
			System.out.println(num + " is not a perfect square number");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		PerfectSquareNumber.checkNumberIsPerfectSquare(num);
		sc.close();
	}
}
