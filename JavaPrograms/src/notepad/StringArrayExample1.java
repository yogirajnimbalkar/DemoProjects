package notepad;

import java.util.Arrays;

/* write a function which will return the reverse of string array, and the elements are on same position*/

public class StringArrayExample1 {

	String reverseString(String str) {
		String output="";
		for(int index=str.length()-1; index>=0; index--) {
			output = output + str.charAt(index);
		}
		return output;
	}
	
	String[] getReverseStringArray(String[] str) {
		String[] arr = new String[str.length];
		for(int index=0; index<str.length; index++) {
			arr[index] = reverseString(str[index]);
		}
		return arr;
	}
	
	//using SIngle array
	String[] getReverseStringArray1(String[] str) {
		for(int index=0; index<str.length; index++) {
			str[index] = reverseString(str[index]);
		}
		return str;
	}
	
	void  displayReverseArray(String[] str) {
		String[] output = new String[str.length];
		output = getReverseStringArray(str);
		System.out.println("Reverse Array is : " + Arrays.toString(output));
		System.out.println("Reverse Array is : " + Arrays.toString(getReverseStringArray1(str)));
	}
	
	public static void main(String[] args) {
		String[] input = {"test","Yogesh","Priya","Sayali","Kiran"};
		StringArrayExample1 example1 = new StringArrayExample1();
		example1.displayReverseArray(input);
	}
}
