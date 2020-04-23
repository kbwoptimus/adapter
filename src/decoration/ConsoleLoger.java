package decoration;

public class ConsoleLoger implements ILoger{

	@Override
	public void log(String msg) {
		System.out.println(msg);
		
	}

}
