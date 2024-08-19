package notepad;

/* From 1 to 100 range display number which is divisible by 3 and 7 */

public class NumberDivBy3And7 {

	void displayResult() {
		for(int index=1; index<=100; index++) {
			if(index % 3 ==0 && index % 7 ==0)
				System.out.println(index + " is divisible by 3 & 7");
		}
	}
	
	public static void main(String[] args) {
		NumberDivBy3And7 example1 = new NumberDivBy3And7();
		example1.displayResult();
	}
}
