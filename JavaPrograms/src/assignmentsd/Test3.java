package assignmentsd;

import java.util.Arrays;

public class Test3 {

	/*WAP to remove a specific element from an array
	int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	specific number: 14
	output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}
*/
	
	void removeNumber(int[] arr, int num) {
		int count=0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] == num)
				count++;
		}
		int[] output = new int[arr.length - count];
		int innerIndex=0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] != num) {
				output[innerIndex] = arr[index];
				innerIndex++;
			}
		}
		System.out.println("Resultant array is : " + Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49, 14};
		Test3 test3 = new Test3();
		test3.removeNumber(input, 14);
	}
}
