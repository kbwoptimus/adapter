package cube;

public class Cube {
	
	private double width;
	
	public Cube(double width) {
		this.width = width;
	}
	
	public double calculateVolume() {
		return width * width * width;
	}
	
	public double calculateFaceArea() {
		return width * width;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
}
