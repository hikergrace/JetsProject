
public abstract class Jet {

	private String model;
	private double speed;
	private int range;
	private long price;

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public Jet() {

	}

	public void fly() {

	}

	public double getSpeedInMach() {
		double mach = speed * 0.001303;
		return mach;
	}

	public static char[] toString(Jet[] planes) {
		return null;
	}

}
