package notepad;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* Find how many pairs of socks we can have from given array
input : {10,3,10,4,7,4,10,3,2,7}
output : 4
*/

public class CollectionExample5 {

	void displayPairOfSocks(int[] arr) {
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
//		System.out.println(keySet);
		Iterator<Integer> itr = keySet.iterator();
		int pairCount = 0;
		while(itr.hasNext()) {
			int key = itr.next();
//			System.out.println(numberMap.get(key));
			pairCount = pairCount + (numberMap.get(key)/2);
		}
		System.out.println("Number of pairs = " + pairCount);
	}
	
	public static void main(String[] args) {
		int[] input = {10,3,10,4,7,4,10,3,2,7};
		new CollectionExample5().displayPairOfSocks(input);
	}
}
