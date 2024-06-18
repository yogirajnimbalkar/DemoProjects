package assignmentsd;

public class Assign17 {

	/* Write a method which takes one String parameter and return a reverse String. */
	String getReverseString(String str) {
		String ans="";
		for(int index=str.length()-1; index>=0; index--) {
			ans = ans + str.charAt(index);
		}
		return ans;
	}
	
	//or
	String getReverseString1(String str) {
		StringBuilder strbuilder = new StringBuilder();
		strbuilder.append(str);
		strbuilder.reverse();
		return strbuilder.toString();
	}
	
	//or
	String getReverseString2(String str) {
		String ans="";
		for(int index=0; index<str.length(); index++) {
			ans = str.charAt(index) + ans ;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Assign17 assign17 = new Assign17();
		String input = "Test Message";
		System.out.println("Reverse String is : " + assign17.getReverseString(input));
		System.out.println("---------------------------------");
		System.out.println("Reverse String is : " + assign17.getReverseString1(input));
		System.out.println("---------------------------------");
		System.out.println("Reverse String is : " + assign17.getReverseString2(input));
	}
}
