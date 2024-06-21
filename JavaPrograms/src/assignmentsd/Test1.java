package assignmentsd;

public class Test1 {

	/* WAP to calculate sum of all the digit available in String array
	String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
	int output = 52
	*/
	
	int getDigitSum(String str) {
		int sum = 0;
		for(int index=0; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index)))
				sum = sum + Character.getNumericValue(str.charAt(index));
		}
		return sum;
	}
	
	int getSumOfDigitFromString(String[] arr) {
		int totalSum = 0;
		for(int index=0; index<arr.length; index++) {
			totalSum = totalSum + getDigitSum(arr[index]);
		}
		return totalSum;
	}
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		String[] input = {"p2e4c", "2r7no", "3h6h2h5", "1mk3", "k9g8"};
		System.out.println("Sum of all digits in string array is : " + test1.getSumOfDigitFromString(input));
	}
}
