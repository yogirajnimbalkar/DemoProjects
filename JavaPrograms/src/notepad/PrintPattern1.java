package notepad;

/* write a display method which print below output
Yogesh - 5
Yogesh : 4
Yogesh - 3
Yogesh : 2
Yogesh - 1
*/

public class PrintPattern1 {

	void display(String name) {
		for(int index=5; index>=1; index--) {
			if(index % 2 == 0)
				System.out.println(name + " : " + index);
			else
				System.out.println(name + " - " + index);
		}
	}
	
	public static void main(String[] args) {
		PrintPattern1 pattern = new PrintPattern1();
		pattern.display("Yogesh");
	}
}
