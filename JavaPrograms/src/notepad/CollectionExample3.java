package notepad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* print index of all occurances of Akanksha.
input : ["Yogesh","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Swapnil","Amruta"]
output : 1
     	4 
*/

public class CollectionExample3 {

	static void displayIndex(List<String> al) {
		for(int index=0; index<al.size(); index++) {
			if(al.get(index).equals("Akanksha"))
				System.out.println(index);
		}
	}
	
	public static void main(String[] args) {
		String[] input = {"Yogesh","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Swapnil","Amruta"};
		List<String> list = Arrays.asList(input);
		List<String> al = new ArrayList<String>(list);
		System.out.println(al);
		displayIndex(al);
		
	}
}
