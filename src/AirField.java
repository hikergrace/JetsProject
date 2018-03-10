// logic to print out fastest, add plane

public class AirField {

	private Jet[] planes = new Jet[20];

	public AirField() {
		// model, speed in mph, range in miles, price in USD

		CargoPlane c1 = new CargoPlane("B17 Flying Fortress", 182, 2000, 2581000);
		FighterJet f1 = new FighterJet("P51 Mustang", 362, 1650, 1700000);
		FighterJet f2 = new FighterJet("Messerschmitt BF109", 440, 528, 2000000);
		FighterJet f3 = new FighterJet("Vickers Warwick", 224, 2300, 900000);
		FighterJet f4 = new FighterJet("Grumman Goblin", 207, 685, 2400000);
		JetImpl j1 = new JetImpl("big plane", 500, 1000, 800000);

		planes[0] = c1;
		planes[1] = f1;
		planes[2] = f2;
		planes[3] = f3;
		planes[4] = f4;
		planes[5] = j1;

		// System.out.println();
	}

	
	public Jet[] getPlanes() {
		return planes;
	}


	public void setPlanes(Jet[] planes) {
		this.planes = planes;
	}


	//add a plane
	public boolean addJet(Jet j) {
		for (int i = 0; i < planes.length; i++) {
			if (planes[i] == null) {
				planes[i] = j;
				return true;
			}
		}
		return false;
	}
	
	
	//list all planes
	public void listFleet() {
		System.out.println(Jet.toString(planes));
	}
	
	
	//fly planes 
	
	
	
	
	//view fastest
	//view longest range
	//quit
	
	
	
}
