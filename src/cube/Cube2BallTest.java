package cube;

public class Cube2BallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube = new Cube(2.0);
		BallIF finger = new MagicFinger(cube);
		System.out.println("the ball's radius is: " + finger.getRadius());
		System.out.println("area: " + finger.calculateArea());
		System.out.println("volume: " + finger.calculateVolume());
	}

}
