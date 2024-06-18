package assignmentsd;

import java.util.Arrays;

public class Assign15 {

	/* wap that will return difference of even length name and odd length name */
	 int getDiffEvenOddLength(String[] arr) {
		 int evenLength=0, oddLength=0;
		 for(int index=0; index<arr.length; index++) {
			 if(arr[index].length() % 2 == 0)
				 evenLength = evenLength + arr[index].length();
			 else
				 oddLength = oddLength + arr[index].length();
		 }
		 return evenLength - oddLength;
	 }
	 
	 /*Return middle char of all elements of the String array.*/
	 char[] getMiddleChar(String[] arr) {
		 char[] ans = new char[arr.length];
		 for(int index=0; index<arr.length; index++) {
			 int middleIndex = arr[index].length() / 2;
			 char ch = arr[index].charAt(middleIndex);
			 ans[index] = ch;
		 }
		 return ans;
	 }
	 
	 /*  Return difference between sum of even number - sum of odd numbers. Difference has to be positive.*/
	 int getDiffEvenOddSum(int[] arr) {
		 int evenSum=0, oddSum=0;
		 for(int index=0; index<arr.length; index++) {
			 if(arr[index] % 2 ==0)
				 evenSum += arr[index];
			 else
				 oddSum += arr[index];
		 }
		 if(evenSum > oddSum)
			 return evenSum - oddSum;
		 else
			 return oddSum - evenSum;
	 }
	 
	 public static void main(String[] args) {
		String[] input = {"Rajesh", "Yogesh", "Nidhi", "Ankit"};
		Assign15 assign15 = new Assign15();
		System.out.println("Difference of even length name and odd length name is  :  " + assign15.getDiffEvenOddLength(input));
		System.out.println("------------------------------------------------------------");
		System.out.println("Middele char of all elements are : " + Arrays.toString(assign15.getMiddleChar(input)));
		System.out.println("------------------------------------------------------------");
		
		int[] input1 = {12,2,13,9};
		System.out.println("Difference between sum of even number and sum of odd numbers are : " + assign15.getDiffEvenOddSum(input1));
		System.out.println("------------------------------------------------------------");
	 }
}
