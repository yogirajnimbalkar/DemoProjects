package notepad;

/* print all duplicate words with their freq from given string
input : "hi hello hi world india india hi india"
output : hi -> 3 india -> 3
*/

import java.util.HashMap;
import java.util.Set;

public class CollectionExample7 {

	void displayDuplicateWords(String str) {
		String[] arr = str.split(" ");
		HashMap<String, Integer>hmap = new HashMap<String, Integer>();
		for(String ele : arr) {
			if(hmap.containsKey(ele)) {
				hmap.put(ele, hmap.get(ele) + 1);
			}else {
				hmap.put(ele, 1);
			}
		}
		System.out.println(hmap);
		Set<String> keySet = hmap.keySet();
		System.out.println(keySet);
		for(String key : keySet) {
			if(hmap.get(key) > 1)
				System.out.println(key + " : " + hmap.get(key));
		}
	}
	
	public static void main(String[] args) {
		String input = "hi hello hi world india india hi india";
		new CollectionExample7().displayDuplicateWords(input);
	}
}
