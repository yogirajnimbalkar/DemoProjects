package notepad;

import java.util.Scanner;

/* from the given input string print the unique/ non-repeating charcters only
e.g. input = akansha output k n s h 
also print the repeating/dublicate characters*
e.g. input tata output -> t a */

public class StringExample4 {

	void printUniqueCharacters(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch)== str.lastIndexOf(ch))
				System.out.print(ch + " ");
		}
	}
	
	void printDuplicateCharacters(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(index == str.indexOf(ch)) {
				if(str.indexOf(ch) != str.lastIndexOf(ch))
					System.out.print(ch + " ");				
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter input string : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringExample4 example4 = new StringExample4();
		example4.printUniqueCharacters(input);
		System.out.println();
		example4.printDuplicateCharacters(input);
		sc.close();
	}
}
