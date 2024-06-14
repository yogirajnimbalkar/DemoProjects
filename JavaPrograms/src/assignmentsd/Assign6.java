package assignmentsd;

public class Assign6 {

	void calculateSimpleInterest(int amount, int time, int rate) {
		double simpleInterest;
		simpleInterest = (double) (amount * time * rate) / 100;
		System.out.println("Simple Interest : " + simpleInterest);
	}
	
	void convertTemperature(int ff) {
		double celsius; 
		celsius = (double) (ff - 32) * 5 / 9;
		System.out.println(ff + " fahrenheit : " + celsius + " Celsius");
	}
	
	public static void main(String[] args) {
		Assign6 assign6 = new Assign6();
		assign6.calculateSimpleInterest(10000, 5, 8);
		assign6.convertTemperature(100);
	}
}
