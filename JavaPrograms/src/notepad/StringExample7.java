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
	
	//OR
	static String replaceDigitFromString1(String str) {
		str = str.replace("0","").replace("1","").replace("2","").replace("3","").replace("4","").replace("5","").replace("6","")
				.replace("7","").replace("8","").replace("9","");
		return str;
	}
	
	//OR
	static String replaceDigitFromString2(String str) {
		str = str.replaceAll("[0-9]", "");
		return str;
	} 
	
	public static void main(String[] args) {
		String input = "This2is12string60test3pro7gram";
		System.out.println("Required String -> " + StringExample7.replaceDigitFromString(input));
		System.out.println("Required String -> " + StringExample7.replaceDigitFromString1(input));
		System.out.println("Required String -> " + StringExample7.replaceDigitFromString2(input));
	}
}
