package notepad;
/* Pattern printing 
*/

import java.util.Scanner;

public class PrintPatteren5 {

/*	1
	2 3
	4 5 6
	7 8 9 10 */
	static void printPatteren1(int rows) {
		int num=1;
		for(int index=1; index<=rows; index++) {
			for(int innerIndex=1; innerIndex<=index; innerIndex++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

/*  1
   11
  111
 1111
11111 
*/	
	static void printPattern2(int rows) {
		for(int i=1; i<=rows; i++) {
			for(int j=i; j<rows; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(1);
			}
			System.out.println();
		}
	}

/*	11111
	 1111
	  111
	   11
	    1
*/
	static void printPatteren3(int rows) {
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=rows; k>=i; k--) {
				System.out.print(1);
			}
			System.out.println();
		}
	}

/*	1234
	 123
	  12
	   1
*/
	static void printPatteren4(int rows) {
		for(int i=1; i<=rows; i++) {
			int count =1;
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=rows; k>=i; k--) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}

/*	1111
	 222
	  33
	   4
*/
	static void printPatteren5(int rows) {
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=rows; k>=i; k--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

/*	    1
	   1 1
	  1 1 1
	 1 1 1 1
*/
	static void printPatteren6(int rows) {
		for(int i=1; i<=rows; i++) {
			for(int j=i; j<rows; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(1 + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows : ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		printPatteren1(rows);
		System.out.println();
		printPattern2(rows);
		System.out.println();
		printPatteren3(rows);
		System.out.println();
		printPatteren4(rows);
		System.out.println();
		printPatteren5(rows);
		System.out.println();
		printPatteren6(rows);
		sc.close();
	}
}
