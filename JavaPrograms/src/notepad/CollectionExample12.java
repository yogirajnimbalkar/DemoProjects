package notepad;

import java.util.HashMap;
import java.util.Set;

/* find the word with second highest freq
input : "hi hello hi world india india hi india welcome india";
Output : hi
*/

public class CollectionExample12 {

	void displaySecondMaxFreq(String str) {
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
		String result ="";
		for(int index=1; index<=2; index++) {
			result = getMaxFreqString(wordMap);
			if(index < 2)
				wordMap.remove(result);
		}
		System.out.println("Word with second higest frequency is : " + result);
	}
	
	String getMaxFreqString(HashMap<String, Integer> tempMap) {
		Set<String> keySet = tempMap.keySet();
		int temp =0;
		String maxFreqStr="";
		for(String key : keySet) {
			if(tempMap.get(key) > temp) {
				temp = tempMap.get(key);
				maxFreqStr = key;
			}
		}
		return maxFreqStr;
	}
	
	public static void main(String[] args) {
		String input = "hi hello hi world india india hi india welcome india";
		new CollectionExample12().displaySecondMaxFreq(input);
	}
}
