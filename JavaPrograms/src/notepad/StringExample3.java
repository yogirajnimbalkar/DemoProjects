package notepad;

import java.util.Scanner;

/* from the given input string print the frequency of each character
e.g. input akansha output = a -> 3 k -> 1 n -> 1 s -> 1 h -> 1 */

public class StringExample3 {

	int getCharFreq(String str, char ch){
		int freqCount=0;
		for(int index=0; index<str.length(); index++) {
			if(ch == str.charAt(index))
				freqCount++;
		}
		return freqCount;
	}
	
	void printFreqOfEachCharacter(String str) {
		for(int index=0; index<str.length(); index++) {
			if(index == str.indexOf(str.charAt(index))) {
				System.out.println(str.charAt(index) + " -> " + getCharFreq(str, str.charAt(index)));
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the input string : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringExample3 example3 = new StringExample3();
		example3.printFreqOfEachCharacter(input);
		sc.close();
	}
}
