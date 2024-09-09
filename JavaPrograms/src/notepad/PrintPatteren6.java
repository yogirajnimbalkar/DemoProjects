package notepad;

import java.util.Scanner;

/* Pattern printing */ 
public class PrintPatteren6 {

/*
1
12
123
1234
12345
 */
	static void printPattern1(int rows) {
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}	

/*
1
12
123
1234
123
12
1	
*/
	static void printPattern2(int rows) {
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=rows-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

/*
12345
1234
123
12
1	
*/
	static void printPattern3(int rows) {
		for(int i=rows; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

/*
54321
4321
321
21
1
*/
	static void printPattern4(int rows) {
		for(int i=rows; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
/*
54321
5432
543
54
5	
*/
	static void printPattern5(int rows) {
		for(int i=1; i<=rows; i++) {
			for(int j=rows; j>=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows : ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		printPattern1(rows);
		System.out.println();
		printPattern2(rows);
		System.out.println();
		printPattern3(rows);
		System.out.println();
		printPattern4(rows);
		System.out.println();
		printPattern5(rows);
		sc.close();
	}
}
