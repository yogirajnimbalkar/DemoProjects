package notepad;

/* write a method to find max number and min numberfrom given array
write a method which return sum of array elements*/

public class ArrayExample4 {

	int getMaxNumber(int[] arr) {
		int maximumnumber = arr[0];
		for(int index=1; index<arr.length; index++)
			if(arr[index] > maximumnumber)
				maximumnumber = arr[index];
		return maximumnumber;
	}
	
	int getMinNumber(int[] arr) {
		int minimumnumber = arr[0];
		for(int index=1; index<arr.length; index++)
			if(arr[index] < minimumnumber)
				minimumnumber = arr[index];
		return minimumnumber;
	}
	
	int getAllElementSum(int[] arr) {
		int sum = 0;
		for(int index=0; index<arr.length; index++)
			sum += arr[index];
		return sum;
	}
	
	public static void main(String[] args) {
		int[] num = {10,88,76,35,5,99,77,84};
		ArrayExample4 example4 = new ArrayExample4();
		System.out.println("Maximum number from given array is : " + example4.getMaxNumber(num));
		System.out.println("Minimum number from given array is : " + example4.getMinNumber(num));
		System.out.println("Sum of all array elements is : " + example4.getAllElementSum(num));
	}
}
