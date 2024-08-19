package notepad;

/* write a method which will return the sum of max and min number within the range which is divisible by 7*/

public class ArrayExample6 {

	int getSumOfMaxMin(int[] arr){
		int maxnumber = 0;
		int minnumber = 0;
		boolean flag = true;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] % 7 == 0) {
				if(flag) {
					maxnumber = arr[index];
					minnumber = arr[index];
					flag = false;
				}else if(maxnumber < arr[index]) {
					maxnumber = arr[index];					
				}else if(minnumber > arr[index]) {
					minnumber = arr[index];					
				}
			}
		}
		return maxnumber + minnumber;
	}
	
	public static void main(String[] args) {
		int[] input = {8,70,49,14,98,28,7,42,105};
		ArrayExample6 example6 = new ArrayExample6();
		System.out.println("Sum of max and min number from given array is : " + example6.getSumOfMaxMin(input));
	}
}
