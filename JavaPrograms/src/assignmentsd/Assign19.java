package assignmentsd;

public class Assign19 {

	/* Find how many words in a given statement */
	int getCountOfWords(String str) {
		String[] arr = str.split(" ");
		return arr.length;
	}
	
	/* Find maximum word length from given statement */
	String getMaxLengthWord(String str) {
		String maxLengthStr="";
		int maxLength = 0;
		String[] arr = str.split(" ");
		for(int index=0; index<arr.length; index++) {
			if(maxLength < arr[index].length()) {
				maxLength = arr[index].length();
				maxLengthStr = arr[index];
			}
		}
		return maxLengthStr;
	}
	
	/* Find minimum word length from given statement */
	String getMinLengthWord(String str) {
		String minLengthStr="";
		String[] arr = str.split(" ");
		int minLength = arr[0].length();
		for(int index=0; index<arr.length; index++) {
			if(minLength > arr[index].length()) {
				minLength = arr[index].length();
				minLengthStr = arr[index];
			}
		}
		return minLengthStr;
	}
	
	public static void main(String[] args) {
		String input = "Him Hello hi science world";
		Assign19 assign19 = new Assign19();
		System.out.println("Number of words in given string is : " + assign19.getCountOfWords(input));
		System.out.println("--------------------------------------------");
		System.out.println("Max length word : " + assign19.getMaxLengthWord(input));
		System.out.println("--------------------------------------------");
		System.out.println("Min length word : " + assign19.getMinLengthWord(input));
		System.out.println("--------------------------------------------");
	
	}
}
