package notepad;
/* Pattern printing
1
2 2
3 3 3
4 4 4 4
*/

import java.util.Scanner;

public class PrintPatteren4 {

	public static void main(String[] args) {
		System.out.println("Enter number of rows : ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for(int index=1; index<=rows; index++) {
			for(int innerIndex=1; innerIndex<=index; innerIndex++) {
				System.out.print(index + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
