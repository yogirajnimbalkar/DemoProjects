package notepad;
/* Pattern printing
1
1 2
1 2 3
1 2 3 4
*/

import java.util.Scanner;

public class PrintPatteren3 {

	public static void main(String[] args) {
		System.out.println("Enter number of rows : ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for(int index=1; index<=rows; index++) {
			for(int innerIndex=1; innerIndex<=index; innerIndex++) {
				System.out.print(innerIndex + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
