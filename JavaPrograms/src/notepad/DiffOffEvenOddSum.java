package notepad;

/* write a method which display the sum of even number - sum of odd number in given range
*/
public class DiffOffEvenOddSum {

	void displayDiffOfEvenOddSum(int startIndex, int endIndex) {
		int sum = 0;
		for(int index=startIndex; index<=endIndex; index++) {
			if(index % 2 == 0)
				sum = sum + index;
			else
				sum = sum - index ;
		}
		System.out.println("Sum of even - odd number is : " + sum);
	}
	
	public static void main(String[] args) {
		DiffOffEvenOddSum example1 = new DiffOffEvenOddSum();
		example1.displayDiffOfEvenOddSum(1, 10);
	}
}
