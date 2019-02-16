package homework3;


public class DatabaseManagement extends StudentInfo{
	public DatabaseManagement(int iD, String name, String address) {
		super(iD, name, address);
	}

	public void DatabaseManagement(int iD, String name, String address){
		super.setiD(0);
		super.setName(null);
		super.setAddress(null);
		
		System.out.println(iD + name + address);
	}
	public void minCredits(String input){
		if (input == "fullTime" ){
			System.out.println("Student is taking 12 or more credits");
		}else if (input == "partTime"){
			System.out.println("Student is taking less than 12 credits");
		}else {
			System.out.println("INVALID");
		}
	}


		
	
	public void expectedGrad(int i) {
		System.out.println(i);
	}

	@Override
	public void startingYear(int g) {
		System.out.println(g);
		
	}

	@Override
	public void startingYear() {
		System.out.print("Starting Year: ");
		
	}

	@Override
	public void expectedGrad() {
		
		System.out.print("Graduation Date: ");		
	}
	
	
}
