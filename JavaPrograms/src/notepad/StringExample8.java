package notepad;

/* write a program to print numbers from a given string
e.g. input str="I have 15 years and 9 months experience"  output 15 9
or str1 = "I have 15.9 years of experience" output = 15.9
*/

public class StringExample8 {

	static void displayData(String str) {
		String[] arr = str.split(" ");
		for(int index=0; index<arr.length; index++) {
			try {
				int num = Integer.parseInt(arr[index]);
				System.out.print(num + " ");
			}catch (NumberFormatException ne) {
			}
		}
	}
	
	static void displayData1(String str) {
		String[] arr = str.split(" ");
		for(int index=0; index<arr.length; index++) {
			try {
				double num = Double.parseDouble(arr[index]);	
				System.out.print(num + " ");
			}catch(NumberFormatException ne) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		String input1 = "I have 15 years and 9 months experience";
		String input2 = "I have 15.9 years of experience";
		displayData(input1);
		System.out.println();
		displayData1(input2);
	}
}
