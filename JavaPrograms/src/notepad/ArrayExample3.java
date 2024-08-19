package notepad;

/* write a method which will return the total length of array elements from given string array 
also write a method to return difference of even length - odd length*/

public class ArrayExample3 {

	int getTotalLength(String[] str) {
		int totallength = 0;
		for(int index=0; index<str.length; index++) {
			totallength = totallength + str[index].length();
		}
		return totallength;
	}
	
	int getDiffEvenOddLength(String[] str) {
		int differenceEvenOdd = 0;
		for(int index=0; index<str.length; index++) {
			if(str[index].length() %2 == 0)
				differenceEvenOdd += str[index].length();
			else
				differenceEvenOdd -= str[index].length();
		}
		return differenceEvenOdd;
	}
	
	public static void main(String[] args) {
		ArrayExample3 example3 = new ArrayExample3();
		String[] name = {"yogesh","prachi","priya","santosh","akansha","amol"};
		System.out.println(("Total length of array elements are : " + example3.getTotalLength(name)));
		System.out.println("Differnec between even odd length is : " + example3.getDiffEvenOddLength(name));
	}
}
