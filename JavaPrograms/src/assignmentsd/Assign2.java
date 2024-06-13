package assignmentsd;

public class Assign2 {
	/* Find weekdays or weekend based on dayIndex
	1 -> Monday, 2 -> Tuesday, .... 7 -> Sunday
	dayIndex -> 3 : WeekDay
	dayIndex -> 6 : WeekEnd
	dayIndex -> 11 : Invalid Index
	dayIndex -> -3 : Invalid Index
	*/
	
	void displayDay(int dayIndex) {
		if(dayIndex >=1 && dayIndex <=5) {
			System.out.println("WeekDay");
		}else if(dayIndex >=6 && dayIndex<=7) {
			System.out.println("WeekEnd");
		}else {
			System.out.println("Invalid Index");
		}
	}
	
	public static void main(String[] args) {
		Assign2 assign2 = new Assign2();
		assign2.displayDay(3);
		assign2.displayDay(6);
		assign2.displayDay(11);
		assign2.displayDay(-3);
	}
}
