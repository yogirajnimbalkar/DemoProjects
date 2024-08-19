package notepad;

/* write a method to print middel character of element in given string array
e.g. yogesh -> g, priya -> i */

public class ArrayExample2 {

	void getMiddleChar(String[] str) {
		char[] output = new char[str.length];
		int middleIndex = 0;
		for(int index=0; index<str.length; index++) {
			if(str[index].length() % 2 == 0) {
				middleIndex = (str[index].length() / 2 ) - 1;
			}else {
				middleIndex = str[index].length() / 2 ;
			}
			output[index] = str[index].charAt(middleIndex);
		}
		displayResult(output,str);
	}
	
	void displayResult(char[] output, String[] str) {
		for(int index=0; index<str.length; index++)
			System.out.println(str[index] + " -> " + output[index]);
	}
	
	public static void main(String[] args) {
		ArrayExample2 example2 = new ArrayExample2();
		String[] name = {"yogesh","prachi","priya","santosh","akansha","amol"};
		example2.getMiddleChar(name);
	}
}
