package notepad;

import java.util.HashMap;
import java.util.Set;

/* print frequeny of numbers from the given array
and find the max frequency key and value
*/

public class CollectionExample4 {

	void displayFrequency(int[] arr) {
		HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for(int num : arr) {
			if(numberMap.containsKey(num))
				numberMap.put(num, numberMap.get(num) + 1);
			else
				numberMap.put(num, 1);
		}
		System.out.println(numberMap);
		
		int temp1=0, temp2=0;
		Set<Integer> keys = numberMap.keySet();
		for(int key : keys) {
			if(numberMap.get(key) > temp2) {
				temp1 = key;
				temp2 = numberMap.get(key);
			}
		}
		System.out.println(temp1 + " : " + temp2);
	}
	
	public static void main(String[] args) {
		int[] arr = {10,33,2,2,56,33,33,49,33,10};
		new CollectionExample4().displayFrequency(arr);
	}
}
