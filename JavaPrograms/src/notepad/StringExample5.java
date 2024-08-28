package notepad;

import java.util.Scanner;

/* Count the number of words in a given string and also print the word and woord length
e.g. "hi hello gm hello gm java" -> numberof words = 6 and hi -> 2 hello ->5 ....*/

public class StringExample5 {

	void displayWordLength(String str) {
		String[] arr = str.split(" ");
		System.out.println("Number of words : " + arr.length);
		for(int index=0; index<arr.length; index++) {
			System.out.println(arr[index] + " -> " + arr[index].length());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter input String : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringExample5 example5 = new StringExample5();
		example5.displayWordLength(input);
		sc.close();
	}
}
