package assignmentsd;

import java.util.Arrays;

public class Assign18 {

	/* Reverse all elements of an array at same position */
	String[] getReverseOfElements(String[] arr) {
		for(int index=0; index<arr.length; index++) {
			arr[index] = getReverseString(arr[index]);
		}
		return arr;
	}
	
	String getReverseString(String str) {
		String ans = "";
		for(int index=str.length()-1; index>=0; index--) {
			ans = ans + str.charAt(index);
		}
		return ans;
	}
	
	/* Reverse all elements and place it in a reverse order */
	String[] getReversePositionOfElements(String[] arr) {
		String[] output = new String[arr.length];
		int outerIndex = arr.length - 1;
		for(int index=0; index<arr.length; index++) {
			output[outerIndex] = getReverseString(arr[index]);
			outerIndex --;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assign18 assign18 = new Assign18();
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		input = assign18.getReverseOfElements(input);
		System.out.println("Reverse of array elements are : " + Arrays.toString(input));
		System.out.println("-------------------------------------");
		String[] input1 = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		input1 = assign18.getReversePositionOfElements(input1);
		System.out.println("Reverse element with reverse order are : " + Arrays.toString(input1));
		System.out.println("-------------------------------------");
	}
}
