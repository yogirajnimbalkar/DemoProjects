package notepad;

/* How many numbers required to form the sum greator than 1000*/

public class CountNumber {

	int getNumberCount() {
		int startIndex=1, sum = 0, count = 0;
		while(sum<=1000) {
			sum = sum + startIndex;
			startIndex++;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		CountNumber countnumber = new CountNumber();
		System.out.println("Total numbers required for sum > 1000 are : " + countnumber.getNumberCount());
	}
}
