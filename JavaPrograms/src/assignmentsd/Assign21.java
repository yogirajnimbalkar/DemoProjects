package assignmentsd;

public class Assign21 {

	/* Find the difference between oldest and youngest family member. Age is in the form of array.
		int[] age = {10,34,38,68,72,95,6};
		output : 95-6 = 89 */ 
	int getDiffInYoungAndOld(int[] arr) {
		int youngAge = arr[0], oldAge = arr[0];
		for(int index=0; index<arr.length; index++) {
			if(youngAge > arr[index])
				youngAge = arr[index];
			if(oldAge < arr[index])
				oldAge = arr[index];
		}
		return oldAge - youngAge;
	}
	
	public static void main(String[] args) {
		Assign21 assign21 = new Assign21();
		int[] age = {10,34,38,68,72,95,6};
		System.out.println("Difference between oldest and youngest family member is : " + assign21.getDiffInYoungAndOld(age));
	}

}
