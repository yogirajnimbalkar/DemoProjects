package notepad;

/* From the given string remove all the digits and return the string
e.g. input = "This2is12string60test3pro7gram" output = "Thisisstringtestprogram" */

public class StringExample7 {

	static String replaceDigitFromString(String str) {
		String ouptput = "";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(!Character.isDigit(ch))
				ouptput = ouptput + ch;
		}
		return ouptput;
	}
	
	public static void main(String[] args) {
		String input = "This2is12string60test3pro7gram";
		System.out.println("Required String -> " + StringExample7.replaceDigitFromString(input));
	}
}
