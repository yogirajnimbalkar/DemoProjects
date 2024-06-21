package assignmentsd;

public class Assign24 {

	/* Java Program to Count the Number of Vowels in user defined string.
	Input : ethconrecitds
	output : vowels are e , o, i
	*/
	void displayVowels(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.toLowerCase(ch)=='a' || Character.toLowerCase(ch)=='e' || Character.toLowerCase(ch)=='i' || Character.toLowerCase(ch)=='o' || Character.toLowerCase(ch)=='u') {
				if(index == str.indexOf(ch))
					System.out.print(ch + " ");
			}
		}
	}
	
	/* Max repeating word with its freq. */
	int freqOfString(String str, String str1) {
		int freq=0;
		String[] arr = str.split(" ");
		for(int index=0; index<arr.length; index++) {
			if(arr[index].equals(str1))
				freq++;
		}
		return freq;
	}
	
	void displayMaxReptStr(String str) {
		int count = 0;
		String maxRepWord = "";
		String[] arr = str.split(" ");
		for(int index=0; index<arr.length; index++) {
			int freq = freqOfString(str, arr[index]);
			if(count < freq) {
				count = freq;
				maxRepWord = arr[index];
			}
		}
		System.out.println(maxRepWord + " -> " + count);
	}
	
	public static void main(String[] args) {
		Assign24 assign24 = new Assign24();
		String input = "ethconrecitds";
		System.out.println("Vowels in given strings are : ");
		assign24.displayVowels(input);
		System.out.println();
		System.out.println("-----------------------------------");
		String input1 = "Hi Hello Hi Techi Hello Hi";
		assign24.displayMaxReptStr(input1);
	}
}
