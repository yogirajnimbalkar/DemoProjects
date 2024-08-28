package notepad;

import java.util.Arrays;

/* from given array shifts all zeros at the end of array
e.g. input -> arr[] ={1,0,0,3,2,0,1,1,0,9}
	 output -> output[] = {1,3,2,1,1,9,0,0,0,0} */

public class ArrayExample8 {

	int[] processData(int[] arr) {
		int[] result = new int[arr.length];
		int innerIndex=0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index]!=0) {
				result[innerIndex] = arr[index];
				innerIndex++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,0,3,2,0,1,1,0,9};
		ArrayExample8 arrayexample1 = new ArrayExample8();
		System.out.println("Resultant array : " + Arrays.toString(arrayexample1.processData(arr)));
	}
}
