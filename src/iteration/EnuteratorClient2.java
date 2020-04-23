package iteration;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnuteratorClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("第一个元素");
		arr.add("第2元素");
		arr.add("第三元素");
		arr.add("第4元素");
		arr.add("第五元素");
		Vector vector = new Vector(arr);
		Enuterator en = new Enuterator(vector.elements());
		while (en.hasNext()) {
			System.out.println(en.next());
		}
	}

}
