package iteration;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Itermeration implements Enumeration {

	Iterator it;
	
	public Itermeration(Iterator it) {
		this.it = it;
	}
	
	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return it.hasNext();
	}

	@Override
	public Object nextElement() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return it.next();
	}

}
