package decoration;

public class ConcreateDectorator extends Decorator{
	public ConcreateDectorator(Component component) {
		super(component);
		
	}
	public void sampleOperation() {
		super.sampleOperation();
	}
	public void addAction() {
		System.out.println("dsssss");
	}

}
