package notepad;

import java.util.HashMap;
import java.util.Set;

/* find the frequency of each character in a given string */

public class CollectionExample8 {

	void displayFreqOfCharacters(String str) {
	HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
	for(int index=0; index<str.length(); index++) {
		char ch = str.charAt(index);
		if(charMap.containsKey(ch))
			charMap.put(ch, charMap.get(ch) + 1);
		else
			charMap.put(ch, 1);
	}
	System.out.println(charMap);
	Set<Character> keySet = charMap.keySet();
	for(char key : keySet)
		System.out.println(key + " : " + charMap.get(key));
	}
	
	public static void main(String[] args) {
		String input = "akanshapradhan";
		new CollectionExample8().displayFreqOfCharacters(input);
	}
}
