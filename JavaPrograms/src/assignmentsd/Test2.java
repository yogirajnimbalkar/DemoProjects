package assignmentsd;

public class Test2 {

	/* Convert all lowercase to uppercase and uppercase to lowercase in a given string.
		Input : A1ashVi6
		Output : a1ASHvI6
	*/
	
	String getReverseCaseStr(String str) {
		String resultStr ="";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch))
					resultStr = resultStr + Character.toLowerCase(ch);
				else
					resultStr = resultStr + Character.toUpperCase(ch);
			}else {
				resultStr = resultStr + ch;
			}
		}
		return resultStr;
	}
	
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		String input = "A1ashVi6";
		System.out.println("Reverse Case of given string is : " + test2.getReverseCaseStr(input));
	}

}
