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
		JetImpl j1 = new JetImpl("big plane", 50, 1000, 800000);

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

	// ADD PLANE
	public boolean addJet(Jet j) {
		for (int i = 0; i < planes.length; i++) {
			if (planes[i] == null) {
				planes[i] = j;
				return true;
			}
		}
		return false;
	}

	// LIST ALL
	public void listFleet() {
		for (int i = 0; i < planes.length; i++) {
			if (planes[i] != null) {
				String printModel = planes[i].getModel();
				double printSpeed = planes[i].getSpeed();
				int printRange = planes[i].getRange();
				long printPrice = planes[i].getPrice();

				System.out.println("Plane: " + printModel + ", Speed: " + printSpeed + "mph" + ", Range: " + printRange
						+ "Price: $" + printPrice);

			}
		}
	}

	// FLY ALL
	public void fly() {
		for (int i = 0; i < planes.length; i++) {
			if (planes[i] != null) {
				String printModel = planes[i].getModel();
				System.out.println("The " + printModel + " is in the air and can fly " + planes[i].getRange()
						+ " miles before running out fuel.");
			}
		}
	}
	
	//FASTEST
	public void getFastest() {
		Jet fastest = planes[0];
		for (int i = 1; i < planes.length; i++) {
			if (planes[i] != null) {
				if (planes[i].getSpeed() > fastest.getSpeed()) {
					fastest = planes[i];
				}
			}
		}
		System.out.println(fastest.getModel() + " is the fastest plane with a speed of "+ fastest.getSpeed());
	}

	// RANGE
	public void getFurthest() {
		Jet furthest = planes[0];
		for (int i = 1; i < planes.length; i++) {
			if (planes[i] != null) {
				if (planes[i].getRange() > furthest.getRange()) {
					furthest = planes[i];
				}
			}
		}
		System.out.println(furthest.getModel() + " has the greatest range, flying "+ furthest.getRange() + " miles on a tank of fuel.");
	}

	// QUIT
	public void quit() {
		System.out.println("Thanks for visiting the airfield. Goodbye. ");
	}
}
