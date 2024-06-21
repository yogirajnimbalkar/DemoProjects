package assignmentsd;

import java.util.Scanner;

public class Assign20 {

	/* find frequency of given character from user defined string. use scanner class to take word and character from user.
	input : word -> akansha  	 ch -> a
	output : a -> 3 */
	int getFreqOfCharacter(String str, char ch) {
		int freq = 0;
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index) == ch)
				freq++;
		}
		return freq;
	}
	
	/* Find frequency of each character from user defined string.*/
	void displayFreqOfEachCharcter(String str) {
		for(int index=0; index<str.length(); index++) {
			if(index == str.indexOf(str.charAt(index))) {
				System.out.println(str.charAt(index) + " -> " + getFreqOfCharacter(str, str.charAt(index)));
			}
		}
	}
	
	/* print unique characters from user defined string*/
	void displayUniqueChar(String str) {
		System.out.println("Unique characters in string are : ");
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch) == str.lastIndexOf(ch))
				System.out.print(ch + " ");
		}
		System.out.println();
	}
	
	/* print duplicate characters with their frequency from user defined string. */
	void displayDuplicateCharWithFreq(String str) {
		System.out.println("Duplicate characters and its frequency in string are : ");
		for(int index=0; index<str.length(); index++) {
			int freqOfChar = 0;
			char ch = str.charAt(index);
			if(index == str.indexOf(ch)) {
				freqOfChar = getFreqOfCharacter(str, ch);
				if(freqOfChar > 1)
					System.out.println(ch + " -> " + freqOfChar);				
			}
		}		
	}
	
	public static void main(String[] args) {
		Assign20 assign20 = new Assign20();
		System.out.println("Enter the input string :");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("Enter a character to check frequency : ");
		char ch = sc.next().charAt(0);
		System.out.println("Frequency of given character is : " + assign20.getFreqOfCharacter(input, ch));
		System.out.println("----------------------------------------------");
		System.out.println("Frequency of each character is : ");
		assign20.displayFreqOfEachCharcter(input);
		System.out.println("----------------------------------------------");
		assign20.displayUniqueChar(input);
		System.out.println("----------------------------------------------");
		assign20.displayDuplicateCharWithFreq(input);
		sc.close();
	}

}
