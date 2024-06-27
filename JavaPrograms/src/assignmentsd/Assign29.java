package assignmentsd;

import java.util.Scanner;

public class Assign29 {

	/* String Pallindrome by writing reverse method logic
	 */
	boolean isPallindrome(String str) {
		String reverseStr = "";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			reverseStr = ch + reverseStr;
		}
		if(str.equals(reverseStr))
			return true;
		else
			return false;
	}
	
	//or
	boolean isPallindrome1(String str) {
		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();
		if(str.equals(str1.toString()))
			return true;
		else
			return false;	
	}
	
	//or without using the reverse string logic
	void checkStringPallindrome(String str) {
		boolean flag=true;
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!= str.charAt(j)) {
				flag = false;
				break;
			}
			i++;
			j--;
		}
		if(flag)
			System.out.println(str + " is pallindrome");
		else
			System.out.println(str + " is not pallindrome");
	}
	
	public static void main(String[] args) {
		Assign29 assign29 = new Assign29();
		System.out.println("Enter input string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if(assign29.isPallindrome(input)) {
			System.out.println(input + " is pallindrome");
		}else {
			System.out.println(input + " is not pallindrome");
		}
		
		if(assign29.isPallindrome1(input)) {
			System.out.println(input + " is pallindrome");
		}else {
			System.out.println(input + " is not pallindrome");
		}
		
		assign29.checkStringPallindrome(input);
		sc.close();
	}
}
