package notepad;

/* write a method which will return the reverse of string*/

public class ReverseString {

	String reverseString(String input){
		String output="";
		for(int index=input.length() -1; index>=0; index--) {
			output += input.charAt(index);
		}
		return output;
	}
	
	public static void main(String[] args) {
		String input = "Test Message";
		ReverseString example1 = new ReverseString();
		System.out.println("Reverse String is : " + example1.reverseString(input));
	}
}
