package notepad;

import java.util.Scanner;

/* From given string convert upper case char to lower case and vice versa
e.g. input = TestMsg  output = tESTmSG*/

public class StringExample1 {

	String convertCharCase(String input) {
		String output="";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)) {
					output = output + Character.toLowerCase(ch);
				}else {
					output = output + Character.toUpperCase(ch);
				}
			}else {
				output = output + ch;
			}
		}
		return output;
	}
	
	//or without using Character class methods
	String convertCharCase1(String input) {
		String output = "";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if((ch>=65 && ch <=90) || (ch>=97 && ch<=122)) {	//asciivalue of A-Z 65-90 and a-z 97-122
				if(ch>=65 && ch<=90) {
					output += (char) (ch + 32);
				}else {
					output += (char) (ch - 32);
				}		
			}else {
				output += ch;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter input String : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringExample1 example1 = new StringExample1();
		System.out.println("Reverse case of given string is : " + example1.convertCharCase(input));
		System.out.println("Reverse case of given string is : " + example1.convertCharCase1(input));
		sc.close();
	}
}
