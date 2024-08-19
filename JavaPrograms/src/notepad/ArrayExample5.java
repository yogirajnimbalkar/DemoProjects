package notepad;

/* From given array of height of trees, calculate how many trees you can view.*/

public class ArrayExample5 {

	int getTreeView(int[] arr){
		int countOfTreeView = 0;
		int maxTreeHeight = 0;
		for(int index=0; index<arr.length; index++)
			if(maxTreeHeight < arr[index]) {
				countOfTreeView++;
				maxTreeHeight = arr[index];
			}
		return countOfTreeView;
	}
	
	public static void main(String[] args) {
		int[] treeHeight = {3,4,4,7,5,6};
		ArrayExample5 example5 = new ArrayExample5();
		System.out.println("Total number of trees view is : " + example5.getTreeView(treeHeight));
	}
}
