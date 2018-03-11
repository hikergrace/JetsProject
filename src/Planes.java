import java.util.Scanner;

public class Planes {

	Scanner kb;

	public void run(Scanner kb) {
		this.kb = kb;
		
		
		System.out.println("Choose from the following: \n"  + "1. List fleet\n" + "2. Fly all planes\n" + "3. View fastest plane\n"
				+ "4. View plane with longest range\n" + "5. Add a plane to Fleet\n" + "6. Leave the airfield");
		
			AirField af = new AirField();
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
  		  case 5:
  			  af.addJet();
  			  break;
  		  case 6:
  			  af.quit();
  			  break;
            }
		}  
	}

