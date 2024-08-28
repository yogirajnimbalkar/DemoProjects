package notepad;

import java.util.Scanner;

/* Write a method to check, wether given number is armstrong or not
e.g. 153 = 1*1*1+5*5*5+3*3*3  armstrong number */

public class ArmstrongNumber {

	boolean isArmstrong(int num) {
		int sum = 0;
		int num1= num;
		boolean flag = false;
		while(num > 0) {
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if(sum == num1)
			flag = true;
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArmstrongNumber example1 = new ArmstrongNumber();
		if(example1.isArmstrong(num))
			System.out.println(num + " is a armstrong number");
		else
			System.out.println(num + " is not a armstrong number");
		sc.close();
	}
}
