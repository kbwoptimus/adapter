package iteration;

import java.util.*;

public class Enuterator implements Iterator {
	
	Enumeration enum1;

	public Enuterator(Enumeration enum1) {
		this.enum1 = enum1;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enum1.hasMoreElements();
	}

	@Override
	public Object next() throws NoSuchElementException{
		// TODO Auto-generated method stub
		return enum1.nextElement();
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
