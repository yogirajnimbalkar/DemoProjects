package notepad;

/* write a method to check how many air of socks we can create using the given array
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output = 2+1+1+1 = 5*/

public class CountPairOfSocks {

	int checkFrequency(int[] arr, int num) {
		int freqCount = 0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] > 0) {
				if(arr[index] == num) {
					freqCount++;
					arr[index] = - 1;
				}
			}
		}
		return freqCount;
	}
	
	void countPairs(int[] arr) {
		int count = 0;
		int pairCount =0;
		for(int index=0; index<arr.length; index++) {
			count = checkFrequency(arr, arr[index]);
			pairCount = pairCount + (count / 2);
		}
		System.out.println("Number of pair count : " + pairCount);
	}
	
	public static void main(String[] args) {
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		CountPairOfSocks example1 = new CountPairOfSocks();
		example1.countPairs(input);
	}
}
