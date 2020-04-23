package cube;

public class MagicFinger implements BallIF {

	private Cube adaptee;
	private double radius = 0;
	private static final double PI = 3.14;
	
	public MagicFinger(Cube adaptee) {
		super();
		this.adaptee = adaptee;
		radius = adaptee.getWidth();
	}
	
	@Override
	public double calculateArea() {
		return PI * 4.0D * (radius * radius);
	}

	@Override
	public double calculateVolume() {
		return PI * 4.0D/3.0D * (radius * radius * radius);
	}

	@Override
	public double getRadius() {
		return radius;
	}

	@Override
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
