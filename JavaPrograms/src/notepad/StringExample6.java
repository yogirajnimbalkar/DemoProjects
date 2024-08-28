package notepad;

import java.util.Scanner;

/* From given input string print the character with maxfrequency 
e.g. input = akansha output = a -> 3 */

public class StringExample6 {

	void printCharWithMaxFreq(String str) {
		int maxcount=0;
		char maxFreqChar = ' ';
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			int count = 0;
			for(int innerIndex=0; innerIndex<str.length(); innerIndex++) {
				if(ch == str.charAt(innerIndex))
					count++;
			}
			if(maxcount < count) {
				maxcount = count;
				maxFreqChar = ch;
			}
		}
		System.out.println(maxFreqChar + " -> " + maxcount);
	}
	
	//alternate option
	void printCharWithMaxFreq1(String str) {
		int maxCount = 0;
		char maxFreqChar = ' ';
		while(str.length() > 0){
			int count =0;
			int originallength = str.length();
			char ch = str.charAt(0);
			str = str.replace(str.valueOf(ch), "");
			int newlength = str.length();
			count = originallength - newlength;
			if(maxCount < count) {
				maxCount = count;
				maxFreqChar = ch;
			}
		}
		System.out.println(maxFreqChar + " -> " + maxCount);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter input String : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringExample6 example6 = new StringExample6();
		example6.printCharWithMaxFreq(input);
		example6.printCharWithMaxFreq1(input);
		sc.close();
	}
}
