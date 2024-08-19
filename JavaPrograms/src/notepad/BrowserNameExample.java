package notepad;

/* Validate browser name
Valid List : Chrome, IE, Edge
Invalid List : Safari, FireFox, ..
*/

public class BrowserNameExample {

	void validateBrowser(String browsername) {
		if(browsername.equals("Chrome") || browsername.equals("IE") || browsername.equals("Edge"))
			System.out.println(browsername + " is a valid browser");
		else
			System.out.println(browsername + " is a invalid browser");
	}
	
	public static void main(String[] args) {
		BrowserNameExample example = new BrowserNameExample();
		example.validateBrowser("Chrome");
		example.validateBrowser("FF");
	}
}
