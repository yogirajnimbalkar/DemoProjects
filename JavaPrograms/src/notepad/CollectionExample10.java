package notepad;

import java.util.HashMap;
import java.util.Set;

/* find the frequency of each number in a given array */

public class CollectionExample10 {

	void displayFreqOfNumbers(int[] arr) {
		HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for(int num : arr) {
			if(numberMap.containsKey(num)) {
				numberMap.put(num, numberMap.get(num) + 1);
			}else {
				numberMap.put(num, 1);
			}
		}
		System.out.println(numberMap);
		Set<Integer> keySet = numberMap.keySet();
		for(int key : keySet) {
			System.out.println(key + " : " + numberMap.get(key));
		}
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,33,22,11,22,1,9,7,7};
		new CollectionExample10().displayFreqOfNumbers(input);
	}
}
