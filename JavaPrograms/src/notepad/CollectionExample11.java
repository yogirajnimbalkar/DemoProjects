package notepad;

import java.util.LinkedHashMap;
import java.util.Set;

/* find the first non repeating word from given string
input : "hi hello hi world india india hi india"
ouput : hello
*/

public class CollectionExample11 {

	void displayFirstNonRepeat(String str) {
		String[] arr = str.split(" ");
		LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<String, Integer>();
		for(String ele : arr) {
			if(wordMap.containsKey(ele)) {
				wordMap.put(ele, wordMap.get(ele) + 1);
			}else {
				wordMap.put(ele, 1);
			}
		}
		System.out.println(wordMap);
		Set<String> keySet = wordMap.keySet();
		for(String word : keySet) {
			if(wordMap.get(word) == 1) {
				System.out.println(word);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		String input = "hi hello hi world india india hi india";
		new CollectionExample11().displayFirstNonRepeat(input);
	}
}
