package iteration;

import java.util.*;

public class IteEnuClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("第一个元素");
		arr.add("第2元素");
		arr.add("第三元素");
		arr.add("第4元素");
		arr.add("第五元素");
		System.out.println("------用Iterator来遍历------");
		Iterator it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("======用Enumerator来遍历======");
		Vector v = new Vector(arr);
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}

}
