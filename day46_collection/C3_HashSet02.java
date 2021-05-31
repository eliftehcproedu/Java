package mehmetBulutluoz.day46_collection;

import java.util.HashSet;
import java.util.Set;

public class C3_HashSet02 {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("Y");
		set1.add("D");
		System.out.println(set1); //[A, B, C, D, F, Y]
		
		set1.clear();
		System.out.println(set1); //[]
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		System.out.println(set1); //[A, B, F]
		
		Set<String> set2 = new HashSet<>();
		
		set2.add("A");
		set2.add("B");
		set2.add("F");
		System.out.println(set2); //[A, B, F]
		
		System.out.println(set1.containsAll(set2));  //true
		
		System.out.println(set1.equals(set2)); //true
		System.out.println(set1.removeAll(set2)); //true  //set1 den set2 nin tumelemanlari kald�r sil
		// 1 tane bile kesisen bulup silerse true doner, hic silemezse false doner
		
		System.out.println(set1);  //[]
		System.out.println(set2);  //[A, B, F]
		
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("D");
	
		
		System.out.println(set1.retainAll(set2)); //true 
		// set 1 de cal�s�r, set2 de olan elamanlar� tutar ve set2 de olmayan elemanlar� siler
		
		System.out.println(set1);  //[A, B, F]
		System.out.println(set2); //[A, B, F]
		
		
		
		
		
	}

}
