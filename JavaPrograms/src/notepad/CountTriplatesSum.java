package notepad;

/* Write a program to find the number of triplates in given array and find the maximum sum of triplate
e.g. input = {10,23,24,25,26,61,62,64,65,66}
output Count --> 3  Sum --> 195*/

public class CountTriplatesSum {

	static void processData(int[] arr) {
		int sum=0, count=0;
		int maxIndex=-1, maxSum = 0;
		for(int index=0; index<arr.length - 2; index++) {
			if((arr[index] == arr[index + 1] - 1) && (arr[index] == arr[index+2] - 2)) {
				count++ ;
				sum = arr[index] + arr[index+1] + arr[index+2];
				if(maxSum < sum ) {
					maxSum = sum;
					maxIndex = index;
				}
			}
		}
		if(maxIndex>0) {
			System.out.println("Count of triplates : " + count);
			System.out.println("Max triplate is : " + arr[maxIndex] + ","+arr[maxIndex+1]+","+arr[maxIndex+2]);
			System.out.println("Sum of max triplate is : " + maxSum);
		}else {
			System.out.println("There is no triplate in given array");
		}
	}
	
	public static void main(String[] args) {
		int[] input = {10,23,24,25,26,61,62,64,65,66};
		CountTriplatesSum.processData(input);
	}
}
