package notepad;

/* write a method which return the difference between sum of even number and sum of odd number from given array.
Note: difference should be positive*/

public class ArrayExample1 {

	int getDifference(int[] arr) {
		int sumOfEvenNumber = 0, sumOfOddNumber = 0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] % 2 == 0)
				sumOfEvenNumber = sumOfEvenNumber + arr[index];
			else
				sumOfOddNumber = sumOfOddNumber + arr[index];
		}
		if(sumOfEvenNumber > sumOfOddNumber)
			return sumOfEvenNumber - sumOfOddNumber;
		else
			return sumOfOddNumber - sumOfEvenNumber;
	}
	
	public static void main(String[] args) {
		ArrayExample1 arrayexample1 = new ArrayExample1();
		int[] num = {12,2,13,9};
		System.out.println("Difference between sum of even number and sum of odd number is : " + arrayexample1.getDifference(num));
	}
}
