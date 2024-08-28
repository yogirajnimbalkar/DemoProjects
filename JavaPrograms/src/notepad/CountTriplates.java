package notepad;

/* Write a program to find the number of triplates in given array
e.g. input = {10,23,24,25,26,61,62,64,65,66}
output 23,24,25	24,25,26 64,65,66 --> 3 */

public class CountTriplates {

	static int countOfTriplates(int[] arr) {
		int count = 0;
		for(int index=0; index<arr.length-2; index++) {
			if((arr[index] == arr[index+1] - 1) &&(arr[index] == arr[index+2] - 2 ))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] input = {10,23,24,25,26,61,62,64,65,66};
		System.out.println("Count of triplate in given array is : " + CountTriplates.countOfTriplates(input));
	}
}
