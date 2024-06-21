package assignmentsd;

public class Assign25 {

	/* String str = "Yo1G2esH"
	   output : YGH12oes
	*/
	
	void displayCapNumSmallStr(String str) {
		String capitalLetters="", smallLetters="", numLetters="";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch))
					capitalLetters += ch;
				else
					smallLetters += ch; 
			}else if(Character.isDigit(ch)) {
				numLetters += ch;
			}
		}
		System.out.println("Required format string : " + capitalLetters + numLetters + smallLetters);
	}
	
	/* String str = "tab12cd33eo3fghci4s15";
		output = 12+33+3+4+15
	*/
	
	void getSumOfNumFromStr(String str) {
		int sum=0;
		String temp="";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				temp = temp+ch;
			}else {
				if(!(temp.equals(""))) {
					sum = sum + Integer.parseInt(temp);
					temp="";
				}
			}
		}
			if(!(temp.equals(""))) {
				sum = sum + Integer.parseInt(temp);
				temp="";
			}
		System.out.println("Sum = " + sum);
	}
	
	public static void main(String[] args) {
		Assign25 assign25 = new Assign25();
		String input = "Yo1G2esH";
		assign25.displayCapNumSmallStr(input);
		System.out.println("-------------------------------");
		String input1 = "tab12cd33eo3fghci4s15";
		assign25.getSumOfNumFromStr(input1);
	}
}
