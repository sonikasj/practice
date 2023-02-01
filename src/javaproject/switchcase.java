package javaproject;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// switch without break
		
		int day = 5;
		
	switch(day) {
			case 1:
				System.out.println("Sunday");
		case 2:
			System.out.println("Monday");
			case 3:
			System.out.println("Tuesday");
		case 4:
				System.out.println("Wednesday");
			case 5:
				System.out.println("Thursday");
			case 6:
				System.out.println("Friday");
			case 7:
				System.out.println("Saturday");
			default:
				System.out.println("please input correct day");
		
 		}
	
		
	// with break statement	
		
	
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("please input correct day");
		
		}
		
	String city = "seattle";
		
		switch(city) {
			case "shoreline":
				System.out.println("SL");
				break;
			case "lynwood":
				System.out.println("LN");
				break;
			case "richmond":
				System.out.println("RM");
				break;
			default:
				System.out.println("Incorrect city name");
				
			
		}
		
	
		
		String city1 = "seattle";
		
		switch(city1) {
			case "seattle":
			case "shoreline":
				System.out.println("SL");
				break;
			case "lynwood":
			case "Everette":
				System.out.println("ET");
				break;
			case "bellevue":
			case "Ballard":
				System.out.println("BD");
				break;
			default:
				System.out.println("Incorrect city name");
				
		}
		
		
		int days = 1;
		
		if(day == 1) {
			System.out.println("Sunday");
		}
		else if(day == 2) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("please input correct day");
		}
		
		
	}

}
