package assignmentsd;

import java.util.Arrays;

public class Assign26_1 {

	/* swap 2 numbers with using 3rd variable */
	void swapNumbers(int num1, int num2) {
		System.out.println("Original numbers are : num1= " + num1 + " and num2= " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Swaped numbers are : num1= " + num1 + " and num2= " + num2);
	}
	
	/* swap 2 numbers without using 3rd variable */
	void swapNumbers1(int num1, int num2) {
		System.out.println("Original numbers are : num1= " + num1 + " and num2= " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Swaped numbers are : num1= " + num1 + " and num2= " + num2);
	}
	
	/*reverse given string array.
		input : {"Publication", "Tech","From","Diwali","Happy"}
		output : {"Happy","Diwali","From","Tech","Publication"}
	 */
	
	void reverseStringArray(String[] arr) {
		String[] resulArr = new String[arr.length];
		int innerIndex=0;
		for(int index=arr.length -1; index>=0; index--) {
			resulArr[innerIndex] = arr[index];
			innerIndex++;
		}
		System.out.println("Original Array is :" + Arrays.toString(arr));
		System.out.println("Reverse Array is : " + Arrays.toString(resulArr));
	}
	
	public static void main(String[] args) {
		Assign26_1 assign26 = new Assign26_1();
		assign26.swapNumbers(10, 20);
		System.out.println("------------------------------------------------");
		assign26.swapNumbers1(30, 40);
		System.out.println("------------------------------------------------");
		String[] str = {"Publication", "Tech","From","Diwali","Happy"};
		assign26.reverseStringArray(str);
	}
}
