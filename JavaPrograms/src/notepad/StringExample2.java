package notepad;

import java.util.Scanner;

/* In given string find the number of digit characters and print there sum
e.g. Input = Ca!m12Bri7d8g@e4  Output = No.of digit count - 5 sum = 1+2+7+8+4 = 22*/

public class StringExample2 {

	int sum=0, sum1 =0;
	int getDigitCount(String str) {
		int count = 0;
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				count ++ ;
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return count;
	}
	
	//or without using Character class methods
	int getDigitCount1(String str) {
		int count = 0;
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(ch>= 48 && ch<=57) {		//asciivalue of 0 to 9
				count ++ ;
				sum1 = sum1 + (ch - 48);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter input string : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringExample2 example2 = new StringExample2();
		System.out.println("Number of digit in given string is : " + example2.getDigitCount(input) + " and their sum is : " + example2.sum);
		System.out.println("Number of digit in given string is : " + example2.getDigitCount1(input) + " and their sum is : " + example2.sum1);
		sc.close();
	}
}
