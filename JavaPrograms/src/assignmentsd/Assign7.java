package assignmentsd;

public class Assign7 {

	/* print even number in given range*/
	void displayEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers in range " + startIndex + " to " + endIndex + " is : ");
		for(int index = startIndex; index<=endIndex; index++) {
			if(index % 2 == 0)
				System.out.print(index + " ");
		}
		System.out.println("------------------");
	}
	
	/*print all numbers which is divisible by 5 in given range*/
	void displayNoDivByFive(int startIndex, int endIndex) {
		System.out.println("Numbers divisible by 5 in range " + startIndex + " to " + endIndex + " are : ");
		for(int index=startIndex; index<=endIndex; index++) {
			if(index % 5 == 0)
				System.out.print(index + " ");
		}
		System.out.println("---------------");
	}
	
	/* print all numbers in given range which is divisible by 5 and divisible by 3*/
	void displayNoDivByFiveThree(int startIndex, int endIndex) {
		System.out.println("Number divisible by 5 and 3 in range " + startIndex + " to " + endIndex + " are : ");
		for(int index=startIndex; index<=endIndex; index++) {
			if((index % 5 == 0) && (index % 3 == 0))
				System.out.print(index + " ");
		}
		System.out.println("---------------------");
	}
	
	/* From given range display the number which is divisible by 3 or 5*/
	void displayNoDivByFiveOrThree(int startIndex, int endIndex) {
		System.out.println("Number divisible by 3 or 5 in range " + startIndex + " to " + endIndex + " are : ");
		for(int index=startIndex; index<=endIndex; index++) {
			if((index % 5 == 0) && (index % 3 == 0)) {
				System.out.println(index + " is divisible by 3 & 5");
			}else if(index % 5 == 0) {
				System.out.println(index + " is divisible by 5");
			}else if(index % 3 == 0) {
				System.out.println(index + " is divisible by 3");
			}
		}
		System.out.println("----------------------------");
	}
	
	/* find sum of all numbers in given range*/
	void getSum(int startIndex, int endIndex) {
		int sum = 0;
		for(int index=startIndex; index<=endIndex; index++) {
			sum = sum + index;
		}
		System.out.println("Sum = " + sum);
		System.out.println("------------------------");
	}
	
	/* find difference between sum of odd number and sum of even number in given range*/
	void getDiffSumOfOddEven(int startIndex, int endIndex) {
		int ans = 0;
		for(int index=startIndex; index<=endIndex; index++) {
			if(index %2 == 0)
				ans = ans - index;
			else
				ans = ans + index;
		}
		System.out.println("Difference between sum of odd numbers and even numbers in range " + startIndex + " to " + endIndex + " is : "+ ans);
		System.out.println("-------------------");
	}
	
	/* print odd numbers in given range in reverse order*/
	void displayOddNumbers(int startIndex, int endIndex) {
		System.out.println("Odd numbers in given rage " + startIndex + " to "+ endIndex +" are : ");
		for(int index=endIndex; index>=startIndex; index--) {
			if(index % 2 != 0)
				System.out.print(index + " ");
		}
	}
	
	public static void main(String[] args) {
		Assign7 assign7 = new Assign7();
		assign7.displayEvenNumbers(10, 15);
		assign7.displayNoDivByFive(10, 30);
		assign7.displayNoDivByFiveThree(5, 30);
		assign7.displayNoDivByFiveOrThree(1, 30);
		assign7.getSum(1, 10);
		assign7.getDiffSumOfOddEven(3, 9);
		assign7.displayOddNumbers(10, 20);
	}
}