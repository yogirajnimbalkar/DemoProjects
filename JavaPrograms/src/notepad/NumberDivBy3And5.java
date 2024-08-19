package notepad;

/* From given range display the number which is divisible by 3 or 5.
output shouls be in below format
3 is divisible by 3	15 is divisible by 3 & 5
5 is divisible by 5
6 is divisible by 3
*/

public class NumberDivBy3And5 {

	void processData(int startIndex, int endIndex) {
		for(int index=startIndex; index<=endIndex; index++) {
			if(index % 3 == 0 && index % 5 == 0) {
				System.out.println(index + " is divisible by 3 & 5");
			}else if(index % 3 == 0) {
				System.out.println(index + " is divisible by 3");
			}else if(index % 5 == 0) {
				System.out.println(index + " is divisible by 5");
			}
		}
	}
	
	public static void main(String[] args) {
		NumberDivBy3And5 example1 = new NumberDivBy3And5();
		example1.processData(1, 50);
	}
}
