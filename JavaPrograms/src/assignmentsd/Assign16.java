package assignmentsd;

public class Assign16 {

	/* From given array of height of trees,  find out count of visible trees.*/
	int getCountOfVisibleTrees(int[] arr) {
		int count =0, maxHeight=0;
		for(int index=0; index<arr.length; index++) {
			if(maxHeight < arr[index]) {
				count++;
				maxHeight = arr[index];
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		Assign16 assign16 = new Assign16();
		System.out.println("Count of visible trees is : " + assign16.getCountOfVisibleTrees(treeHeights));
	}
}
