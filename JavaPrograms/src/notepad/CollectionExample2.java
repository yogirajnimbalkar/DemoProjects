package notepad;

import java.util.ArrayList;

/* print duplicates in arraylist [print all the elements having freq more than 1] */

public class CollectionExample2 {

	static void displayDuplicate(ArrayList<String> al) {
		ArrayList<String> duplicateList = new ArrayList<String>();
		for(int index=0; index<al.size(); index++) {
			String name = al.get(index);
			if(al.indexOf(name) != al.lastIndexOf(name)) {
				if(!duplicateList.contains(name)) {
					duplicateList.add(name);
				}
			}
		}
		System.out.println(duplicateList);
	}
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Yogesh");
		al.add("Bhushan");
		al.add("Swapnil");
		al.add("Santosh");
		al.add("Bhushan");
		al.add("Nitin");
		al.add("Yogesh");
		al.add("Ravi");
		System.out.println(al);
		displayDuplicate(al);
	}
}
