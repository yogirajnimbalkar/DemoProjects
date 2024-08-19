package notepad;
/* Find weekdays or weekend based on dayIndex
1 -> Monday, 2 -> Tuesday, .... 7 -> Sunday
dayIndex -> 3 : WeekDay
dayIndex -> 6 : WeekEnd
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index
*/
public class WeekDayExample {

	void displayDay(int dayIndex) {
		if(dayIndex >=1 && dayIndex <=5) {
			System.out.println("WeekDay");
		}else if (dayIndex >=6 && dayIndex <=7) {
			System.out.println("WeekEnd");
		}else {
			System.out.println("Invalid Index");
		}
	}
	
	public static void main(String[] args) {
		WeekDayExample weekdayExample = new WeekDayExample();
		weekdayExample.displayDay(3);
		weekdayExample.displayDay(6);
		weekdayExample.displayDay(11);
		weekdayExample.displayDay(-3);
	}
}
