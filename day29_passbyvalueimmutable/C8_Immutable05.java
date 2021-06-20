package java_mehmetBulutluoz.day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C8_Immutable05 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String> ();
		list.add("one");
		list.add("two");
	//	list.add(7);  CTE verir
		
		for (String s : list) System.out.println(s);

	}

}
