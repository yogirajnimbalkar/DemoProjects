package notepad;

import java.util.Scanner;

/* write a program to print the fibonaci service 
0 1 1 2 3 5 8 13 21....*/

public class FibonaciSeries {

	static void printData(int num) {
		if(num <= 0)
			System.out.println("Please enter valid range!!");
		else if(num ==1)
			System.out.println(0);
		else if(num >= 2) {
			int num1=0, num2=1, temp;
			System.out.print("0 1 ");
			for(int index=1; index<=num-2; index++) {
				temp = num1 + num2;
				System.out.print(temp + " ");
				num1 = num2;
				num2 = temp;
			}
		}
	} 
	
	public static void main(String[] args) {
		System.out.println("Enter number to print the fibonaci series");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		FibonaciSeries.printData(num);
		sc.close();
	}
}
