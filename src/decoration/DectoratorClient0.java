package decoration;

public class DectoratorClient0 {

	public static void main(String[] args) {
		Component component=new ConcreateCompone();
		component.sampleOperation();
		ConcreateDectorator cc=new ConcreateDectorator(component);
		
		cc.sampleOperation();
		cc.addAction(); 
	

	}

}
