package notepad;

import java.lang.reflect.Array;
import java.util.Arrays;

/*from given array shifts all negative number first then all zeros and then the remainning numbers
e.g. input -> arr[] ={1,0,-8,0,3,-88,2,0,1,1,0,-5,9}
	 output -> output[] = {-8,-88,-5,0,0,0,0,1,3,2,1,1,9} */

public class ArrayExample10 {

	static int[] processData(int[] arr) {
		int[] output = new int[arr.length];
		int zeroCOunt = 0, innerIndex=0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] < 0) {
				output[innerIndex] = arr[index];
				innerIndex++;
			}else if(arr[index] == 0) {
				zeroCOunt++;
			}
		}
		innerIndex = innerIndex + zeroCOunt;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] > 0) {
				output[innerIndex] = arr[index];
				innerIndex++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] input = {1,0,-8,0,3,-88,2,0,1,1,0,-5,9};
		System.out.println("Resultant array is : " + Arrays.toString(ArrayExample10.processData(input)));
	}
}
