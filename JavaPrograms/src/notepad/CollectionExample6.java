package notepad;

import java.util.HashMap;
import java.util.Set;

/* print all the numbers having freq 1
input :{1,11,33,22,11,22,1,9,7,7}
output : 33,9
*/

public class CollectionExample6 {

	void processData(int[] arr) {
		HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for(int index=0; index<arr.length; index++) {
			if(numberMap.containsKey(arr[index])) {
				numberMap.put(arr[index], numberMap.get(arr[index]) + 1);
			}else {
				numberMap.put(arr[index], 1);
			}
		}
		System.out.println(numberMap);
		
		Set<Integer> keySet = numberMap.keySet();
		System.out.println(keySet);
		for(int key : keySet) {
			if(numberMap.get(key) == 1)
				System.out.print(key + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,33,22,11,22,1,9,7,7};
		new CollectionExample6().processData(input);
	}
}
