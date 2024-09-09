package notepad;

import java.util.ArrayList;

/* Remove duplicates from arraylist, it should have only single occurance*/
public class CollectionExample1 {

	static void getUniqueList(ArrayList<String> al) {
		ArrayList<String> uniqueList = new ArrayList<String>();
		for(int index=0; index<al.size(); index++) {
			if(!uniqueList.contains(al.get(index))) {
				uniqueList.add(al.get(index));
			}
		}
		System.out.println(uniqueList);
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
		getUniqueList(al);
	}
}
