package assignmentsd;

public class Assign14 {

	/* Find maximum number from given array. */
	int getMaxNumberFromArray(int[] arr) {
		int max = arr[0];
		for(int index=1; index<arr.length; index++) {
			if(arr[index] > max) {
				max = arr[index];
			}
		}
		return max;
	}
	
	/* Find minimum number from given array. */
	int getMinNumberFromArray(int[] arr) {
		int min = arr[0];
		for(int index=1; index<arr.length; index++) {
			if(arr[index] < min) {
				min = arr[index];
			}
		}
		return min;
	}
	
	/* print difference between max and min number from given array.*/
	int getDiffOFMaxMin(int[] arr) {
		int diff =0, max, min;
		max = getMaxNumberFromArray(arr);
		min = getMinNumberFromArray(arr);
		diff = max - min;
		return diff;
	}
	
	/* print difference between max odd number and max even number from given array. difference should be positive */
	int getDiffMaxOddMaxEven(int[] arr) {
		int maxOdd=0, maxEven=0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] % 2 == 0) {
				if(maxEven < arr[index])
					maxEven = arr[index];
			}else {
				if(maxOdd < arr[index])
					maxOdd = arr[index];
			}
		}
		if(maxEven > maxOdd)
			return maxEven - maxOdd;
		else
			return maxOdd - maxEven;
	}
	
	public static void main(String[] args) {
		int[] input = {12,11,44,23,55,99,23};
		Assign14 assign14 = new Assign14();
		System.out.println("Max number from given array is : " + assign14.getMaxNumberFromArray(input));
		System.out.println("------------------------------------");
		System.out.println("Max number from given array is : " + assign14.getMinNumberFromArray(input));
		System.out.println("------------------------------------");
		System.out.println("Difference between max and min number is : " + assign14.getDiffOFMaxMin(input));
		System.out.println("------------------------------------");
		System.out.println("Difference between maxeven and maxodd number is : " + assign14.getDiffMaxOddMaxEven(input));
		System.out.println("------------------------------------");
	}
}
