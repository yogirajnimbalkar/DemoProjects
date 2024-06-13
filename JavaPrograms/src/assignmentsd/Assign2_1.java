package assignmentsd;

public class Assign2_1 {

	/* Validate browser name
	Valid List : Chrome, IE, Edge
	Invalid List : Safari, FireFox, ..
	*/
	
	void validateBrowser(String browsername) {
		browsername = browsername.toLowerCase();
		if(browsername.equals("chrome") || browsername.equals("ie") || browsername.equals("edge")) {
			System.out.println(browsername + " is a valid browser");
		}else {
			System.out.println(browsername + " is not a valid browser");
		}
	}
	
	public static void main(String[] args) {
		Assign2_1 assign2 = new Assign2_1();
		assign2.validateBrowser("Chrome");
		assign2.validateBrowser("FireFox");
	}
}
