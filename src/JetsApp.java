import java.util.Scanner;

// launches the airfield, displays the menu

public class JetsApp {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the World War II Classic Planes Airfield");
	
		AirField af = new AirField();
	    int choice;
	    while(true){
	        System.out.println();
	    		System.out.println("Choose from the following options:");
	        System.out.println("1. List our current fleet");
	        System.out.println("2. Fly the planes");
	        System.out.println("3. View the fastest plane in the fleet");
	        System.out.println("4. View the plane with the longest range");
	        System.out.println("5. Add your own plane");
	        System.out.println("6. Exit the airfield");
	        
	        choice = kb.nextInt();

	    switch(choice){

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
  		  case 5:
  			  af.addJet();
  			  break;
  		  case 6:
  			//found System.exit info on StackOverflow
  			  System.out.println("Exiting the airfield. Thanks for visiting!");
  	        System.exit(0);
  	         break;
            }
		} 
	}
}
	