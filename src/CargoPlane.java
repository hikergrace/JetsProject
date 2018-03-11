
public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {
		super();
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println(super.getModel() + " is loading cargo.");
	}

}
