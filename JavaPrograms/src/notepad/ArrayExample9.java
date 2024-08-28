package notepad;

import java.util.Arrays;

/* from given array shifts all zeros at the begining of array
e.g. input -> arr[] ={1,0,0,3,2,0,1,1,0,9}
	 output -> output[] = {0,0,0,0,1,3,2,1,1,9} */

public class ArrayExample9 {

	int[] getAllZeroAtStarting(int[] arr) {
		int[] output = new int[arr.length];
		int zeroCount = 0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index]==0)
				zeroCount++;
		}
		for(int index=0; index<arr.length; index++) {
			if(arr[index] != 0) {
				output[zeroCount] =arr[index];
				zeroCount++;				
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,0,3,2,0,1,1,0,9};
		System.out.println("Resultant array is : " + Arrays.toString(new ArrayExample9().getAllZeroAtStarting(arr)));
	}
}
