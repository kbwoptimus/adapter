package iteration;

import java.util.ArrayList;

public class EnuIteClient3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("中飘");
		arr.add("高职");
		arr.add("专科");
		arr.add("本科");
		arr.add("硕士");
		arr.add("博士");
		arr.add("博士后");
		Itermeration it = new Itermeration(arr.iterator());
		while(it.hasMoreElements()) {
			System.out.println(it.nextElement());
		}
	}

}
