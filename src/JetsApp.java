import java.util.Scanner;

// launches program, calls display user menu method

public class JetsApp {
	
	public static void main(String[] args) {
		
		AirField af = new AirField();
		
		System.out.println("Welcome to the World War II Classic Planes Airfield");
		System.out.println("Choose from the following menu items:");
		System.out.println("1. List fleet\n" + "2. Fly all planes\n" + "3. View fastest plane\n"
				+ "4. View plane with longest range\n" + "5. Add a plane to Fleet\n" + "6. Leave the airfield");

		Scanner kb = new Scanner(System.in);
		int choice = kb.nextInt();
	
		switch (choice) {
		  case 1:
		   af.listFleet();
		    break;
		  case 2:
		    af.fly();
		    break;
		  case 3:
			  af.getFastest();
			  break;
		  case 4:
			  af.getFurthest();
			  break;
//		  case 5:
//			  af.addJet();
//			  break;
		  case 6:
			  af.quit();
			  break;
		 
		}
	
		
		kb.close();
	}
	

}
