package notepad;

import java.util.HashMap;
import java.util.Set;

/* find the frequency of each word in a given string */

public class CollectionExample9 {

	void displayFreqOfEachWords(String str) {
		String[] arr = str.split(" ");
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		for(String ele : arr) {
			if(wordMap.containsKey(ele)) {
				wordMap.put(ele, wordMap.get(ele) + 1);
			}else {
				wordMap.put(ele, 1);
			}
		}
		System.out.println(wordMap);
		Set<String> keySet = wordMap.keySet();
		System.out.println(keySet);
		for(String key : keySet) {
			System.out.println(key + " : " + wordMap.get(key));
		}
	}
	
	public static void main(String[] args) {
		String input = "hi hello hi world india india hi india";
		new CollectionExample9().displayFreqOfEachWords(input);	
	}
}
