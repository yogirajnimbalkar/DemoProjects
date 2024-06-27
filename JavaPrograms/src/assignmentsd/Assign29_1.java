package assignmentsd;

import java.util.Scanner;

public class Assign29_1 {

	/* given number is pallindrome or not */
	
	boolean ispallindrome(int num) {
		int num1 = num;
		int temp = 0;
		while(num>0) {
			temp = (temp * 10) + (num % 10);
			num = num / 10;
		}
		if(num1 == temp)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Assign29_1 assign29 = new Assign29_1();
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(assign29.ispallindrome(input))
			System.out.println(input + " is pallindrome");
		else
			System.out.println(input + " is not pallindrome");
		sc.close();
	}
}
