package notepad;

import java.util.Arrays;
import java.util.Scanner;

/* from given array remove the given number 
e.g. input = {10,12,14,10,15,10} output = {12,14,15}*/

public class ArrayExample7 {

	int countFreqOfNum(int[] arr, int num) {
		int freqCount = 0;
		for(int index=0; index<arr.length; index++)
			if(arr[index] == num)
				freqCount++;
		return freqCount;
	}
	void processData(int[] arr, int num) {
		int freqCount = countFreqOfNum(arr, num);
		int innerIndex = 0;
		int[] resultArray = new int[arr.length - freqCount];
		for(int index=0; index<arr.length; index++) {
			if(arr[index] != num) {
				resultArray[innerIndex] = arr[index];
				innerIndex++;
			}
		}
		System.out.println("Resultant array is : " + Arrays.toString(resultArray));
	}
	
	public static void main(String[] args) {
		int[] arr = {10,12,14,10,15,10};
		System.out.println("Enter the number to be removed : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayExample7 example7 = new ArrayExample7();
		example7.processData(arr, num);
		sc.close();
	}
}
