package notepad;

import java.util.Scanner;

/*check the given string is palliendrome or not
e.g. "naman" is a palliendrome */

public class PalliendromeString {

	boolean isPalliendrome(String str) {
		boolean flag =false;
		String output="";
		for(int index=str.length()-1; index>=0; index--) {
			output = output + str.charAt(index);
		}
		if(str.equals(output))
			flag = true;
		return flag;
	}
	
	// without creating a reverse string
	boolean isPalliendrome1(String str) {
		boolean flag = true;
		int innerIndex = str.length()-1;
		for(int index=0; index<=str.length()/2; index++) {
			if(str.charAt(index)!= str.charAt(innerIndex)) {
				flag = false;
				break;
			}
			innerIndex--;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter input string : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		PalliendromeString example1 = new PalliendromeString();
		if(example1.isPalliendrome(input))
			System.out.println(input + " is a palliendrome string");
		else
			System.out.println(input + " is not a palliendrome string");
		if(example1.isPalliendrome1(input))
			System.out.println(input + " is a palliendrome string");
		else
			System.out.println(input + " is not a palliendrome string");
		sc.close();
	}
}
