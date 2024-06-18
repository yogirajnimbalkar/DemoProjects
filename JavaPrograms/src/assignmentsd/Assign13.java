package assignmentsd;

import java.util.Arrays;

public class Assign13 {

	/* Return count of positive numbers from given array */
	int getPositiveNoCount(int[] arr) {
		int count = 0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] > 0)
				count++;
		}
		return count;
	}
	
	/*  count number of zero's in given array */
	int getCountOfZero(int[] arr) {
		int count =0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] == 0)
				count++;
		}
		return count;
	}
	
	/* write a method which returns 5 smaller numbers of the given number. */
	int[] getNumbers(int num) {
		int[] arr = new int[5];
		for(int index=0; index<arr.length; index++) {
			num--;
			arr[index] = num;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		Assign13 assign13 = new Assign13();
		System.out.println("Count of positive number in given array is : " + assign13.getPositiveNoCount(input));
		System.out.println("--------------------------------------");
		
		int[] input1 = {1,-11,0,0,55,0,-23,0};
		System.out.println("Count of zeros in given array is : " + assign13.getCountOfZero(input1));
		System.out.println("--------------------------------------");
		
		int[] output = new int[5];
		output = assign13.getNumbers(50);
		System.out.println("5 smaller number from given numbers are : " + Arrays.toString(output));
		System.out.println("--------------------------------------");
	}
}
