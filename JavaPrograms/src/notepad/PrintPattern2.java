package notepad;

import java.util.Scanner;

/* Pattern printing
*
* *
* * *
* * * *
*/
public class PrintPattern2 {

	public static void main(String[] args) {
		System.out.println("Enter number of rows : ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for(int index=1; index<=rows; index++) {
			for(int innerIndex=1; innerIndex<=index; innerIndex++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
