package homework3;

public class Status {

	StudentYear semester;
	
	public void getStatus(StudentYear semester){
		switch (semester){
		
		case freshman:
			System.out.println("Freshman");
			break;
		
		
		case sophomore:
			System.out.println("sophomore");
			break;
		
		case junior:
			System.out.println("Junior");
			break;
			
		case senior:
			System.out.println("Senior");
			break;
		
		default:
			System.out.println("alien");
			break;
		}
	}
}