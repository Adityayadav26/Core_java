package in.co.rasy.basic;

public class SwitchCase {

	public static void main(String[] args) {
		String day ="saturday";
				
		switch(day) {
		
		case "Monday":
			System.out.println("First day of week");
			break;
			
		case"tuesday":
			System.out.println("Second day of week");
			break;
			
		case "wednesday":
			System.out.println("Third day of week");
			break;
			
		case "thursday":
			System.out.println("fourth day of week");
			break;
			
		case "Friday":
			System.out.println("fifth day of week");
			break;
			
		case"saturday":
			System.out.println("sixth day of week");
			break;
			
			default:
				System.out.println("aaj sunday hai");
			
		}
	}
}
