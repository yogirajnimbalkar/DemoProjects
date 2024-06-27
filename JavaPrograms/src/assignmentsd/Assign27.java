package assignmentsd;

public class Assign27 {

	/* WAP to find 2 arrays are identical or not.
	int[] arr1 = {10,12,55,32,17};
	int[] arr2 = {10,12,55,32,17}};
	output : Identical
	int[] arr1 = {10,12,55,32,17,99};
	int[] arr2 = {10,12,55,32,17}};
	output : Not identical	 
	 */
	
	boolean isArrayIdentical(int[] arr1, int[] arr2) {
		boolean flag = true;
		if(arr1.length != arr2.length) {
			flag = false;
		}else {
			for(int index=0; index<arr1.length; index++) {
				if(arr1[index] != arr2[index]) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Assign27 assign27 = new Assign27();
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		if(assign27.isArrayIdentical(arr1, arr2)) {
			System.out.println("Both array are identical");
		}else {
			System.out.println("Both array are not identical");
		}
		int[] arr3 = {10,12,55,32,17,99};
		int[] arr4 = {10,12,55,32,17};
		if(assign27.isArrayIdentical(arr3, arr4)) {
			System.out.println(" Both array are identical");
		}else {
			System.out.println("Both array are not identical");
		}
	}
}
