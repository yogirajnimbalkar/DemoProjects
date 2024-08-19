package notepad;

import java.util.Arrays;

/* write a function which will return the reverse of string array, and also the position of element gets reverse*/

public class StringArrayExample2 {

	String reverseString(String str) {
		String output="";
		for(int index=str.length()-1; index>=0; index--) {
			output = output + str.charAt(index);
		}
		return output;
	}
	
	String[] getReverseStringArray(String[] str) {
		String[] arr = new String[str.length];
		int innerIndex=0;
		for(int index=str.length - 1; index>=0; index--) {
			arr[innerIndex ++] = reverseString(str[index]);
		}
		return arr;
	}
	
	void  displayReverseArray(String[] str) {
		String[] output = new String[str.length];
		output = getReverseStringArray(str);
		System.out.println("Reverse Array is : " + Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		String[] input = {"test","Yogesh","Priya","Sayali","Kiran"};
		StringArrayExample2 example = new StringArrayExample2();
		example.displayReverseArray(input);
	}
}
