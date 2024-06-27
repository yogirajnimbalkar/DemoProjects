package assignmentsd;

import java.util.Arrays;

public class Assign28 {
	
	/*Find second highest number from array.
	int[] arr = {10,23,2,11,55,43,99};
	output : 55
	*/
	
	int getSecondMaxNumber(int[] arr) {
		int max=0, secondMax=0;
		for(int index=0; index<arr.length; index++) {
			if(max < arr[index]) {
				secondMax = max;
				max = arr[index];
			}else {
				if(secondMax < arr[index]) {
					secondMax = arr[index];
				}
			}
		}
		return secondMax;
	}
	
	/* Find nth highest number from given array*/
	int getNthHighestNumber(int[]arr, int num) {
		Arrays.sort(arr);
		return(arr[arr.length-num]);
	}
	
	int getNthHighestNumber1(int[]arr, int num) {
		int temp;
		for(int index=0; index<arr.length; index++) {
			for(int innerIndex=index +1; innerIndex<arr.length; innerIndex++) {
				if(arr[index] > arr[innerIndex]) {
					temp = arr[index];
					arr[index] = arr[innerIndex];
					arr[innerIndex] = temp;
				}
			}
		}
		return arr[arr.length - num];
	}
	
	public static void main(String[] args) {
		int[] input = {10,23,2,11,55,43,99,66};
		Assign28 assign28 = new Assign28();
		System.out.println("Second heighest number in given array is : " + assign28.getSecondMaxNumber(input));
		System.out.println("Nth highest number is : " + assign28.getNthHighestNumber(input,3));
		System.out.println("Nth highest number is : " + assign28.getNthHighestNumber1(input, 4));
	}
}
