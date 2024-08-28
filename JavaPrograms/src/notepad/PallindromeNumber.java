package notepad;

import java.util.Scanner;

/*check the given number is palliendrome or not
e.g. 12321 is a palliendrome */

public class PallindromeNumber {

	boolean isPalliendrome(int num) {
		boolean flag = true;
		int orignalnum = num;
		int num1=0;
		while(num > 0) {
			num1 = num1 * 10 + (num % 10);
			num = num / 10;
		}
		if(orignalnum != num1)
			flag = false;
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number : ");
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		PallindromeNumber example1 = new PallindromeNumber();
		if(example1.isPalliendrome(num))
			System.out.println(num + " is palliendrome");
		else
			System.out.println(num + " is not a palliendrome");
		sc.close();
	}
}
