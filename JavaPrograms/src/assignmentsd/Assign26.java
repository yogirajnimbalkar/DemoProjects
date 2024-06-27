package assignmentsd;

import java.util.Scanner;

public class Assign26 {

	/* WAP to print Reverse a given String */
	String getReverseString(String str) {
		String reverseStr ="";
		for(int index=str.length()-1; index>=0; index--) {
			reverseStr = reverseStr + str.charAt(index);
		}
		return reverseStr;
	}
	
	//or
	String getReverseString1(String str) {
		String temp="";
		for(int index=0; index<str.length(); index++) {
			temp = str.charAt(index) + temp;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Assign26 assign26 = new Assign26();
		System.out.println("Enter input string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Reverse String of given String is : " + assign26.getReverseString(str));
		System.out.println("------------------------------------------------");
		System.out.println("Reverse String of given String is : " + assign26.getReverseString1(str));
		sc.close();
	}
}
