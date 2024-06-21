package assignmentsd;

import java.util.Scanner;

public class Assign22 {

	/* Find total digits in a given string.
		String str = "Ab1cd2eo3ce4ed3kt4h"
		output : 6
	 */	
	int getDigitCount(String str) {
		int count = 0;
		for(int index=0; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index)))
				count++;	
		}
		return count;
	}
	
	/* Find sum of all the digits in a given string
	   String str = "Ab1cd2eo3ce4ed3kt4h"
		output : 1+2+3+4+3+4 = 17
	 */
	int getDigitSum(String str) {
		int sum = 0;
		for(int index=0; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index))) {
				sum = sum + Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assign22 assign22 = new Assign22();
		System.out.println("Enter input string : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("Total number of digits in given string is : " + assign22.getDigitCount(input));
		System.out.println("-------------------------------------------------");
		System.out.println("Sum of digits in given string is : " + assign22.getDigitSum(input));
		System.out.println("-------------------------------------------------");
		sc.close();
	}
}
