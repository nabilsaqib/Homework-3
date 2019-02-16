package homework3;
import java.util.*;
public class TestDatabase {

	public static void main(String[]args){
		
		DatabaseManagement hh = new DatabaseManagement(0, null, null);
		
		int l;
		do {	
		l = 1;	
		l++;
		
		System.out.println("Enter 1 to see Bob's record");
		System.out.println("Enter 2 to see Moe's record");
		System.out.println("Enter 3 to see Thotiana's record");
		System.out.println("Enter 4 to see Mafi's record");
		
		Scanner num = new Scanner(System.in);
		int input = num.nextInt();
		
		
		 DatabaseManagement [] students = new DatabaseManagement[1];
		 students[0] = new DatabaseManagement(100, "Bob Builder", "Sunnyside NY");
		 for (DatabaseManagement i:students){
		
				
		DatabaseManagement [] students1 = new DatabaseManagement[1];
		students[0] = new DatabaseManagement(11101, "Moe Bamba", "Astoria NY");
		for (DatabaseManagement n:students){

		
		DatabaseManagement [] students2 = new DatabaseManagement[1];
		students[0] = new DatabaseManagement(11104, "Thotiana", "Jamaica NY");
		for (DatabaseManagement a:students){
			
		
		DatabaseManagement [] students3 = new DatabaseManagement[1];
		students[0] = new DatabaseManagement(10023, "Mafi", "PnT");
		for (DatabaseManagement b:students){
			
			if(input == 1){
				System.out.println("id:" + i.getiD() + "  Name:" + i.getName() + "  Address:" + i.getAddress());
				//students[0].expectedGrad();
				hh.startingYear();
				hh.startingYear(2015);
				hh.expectedGrad();
				hh.expectedGrad(2019);
				Status status = new Status();
				System.out.print("Status: ");	
				status.getStatus(StudentYear.senior);
					}
			
			else if(input ==2){
				System.out.println("id:" + n.getiD() + "  Name:" + n.getName() + "  Address:" + n.getAddress());
				hh.startingYear();
				hh.startingYear(2016);
				hh.expectedGrad();
				hh.expectedGrad(2020);
				Status status = new Status();
				System.out.print("Status: ");	
				status.getStatus(StudentYear.junior);
			}
		
			else if(input == 3){
				System.out.println("id:" + a.getiD() + "  Name:" + a.getName() + "  Address:" + a.getAddress());
				hh.startingYear();
				hh.startingYear(2017);
				hh.expectedGrad();
				hh.expectedGrad(2021);
				Status status = new Status();
				System.out.print("Status: ");	
				status.getStatus(StudentYear.sophomore);
			}
			
			else if(input == 4){
				System.out.println("id:" + b.getiD() + "  Name:" + b.getName() + "  Address:" + b.getAddress());
				hh.startingYear();
				hh.startingYear(2018);
				hh.expectedGrad();
				hh.expectedGrad(2022);
				Status status = new Status();
				System.out.print("Status: ");	
				status.getStatus(StudentYear.freshman);
			}
			else {
				System.out.println("INVALID! Please try again.");
				System.out.println("");
			}
			
		}
	}
}
}
}while(l < 20 );
}
}
