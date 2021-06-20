package java_mehmetBulutluoz.day45_collections;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
		// Collections'da esitligin sol tarafinda <>icinde data turu yazilmasa
        // veya data turu olarak Object yazilsa collections calisir
        // Ama boyle bir kullanimda surekli casting yapildigi icin 
        // zaman ve hafiza acisindan verimli degildir.
		LinkedList<Object> ll1 = new LinkedList<>();
		
		ll1.add("A");
		ll1.add(20);
		ll1.add('C');
		System.out.println(ll1);  //[A, 20, C]
		
		LinkedList ll2 = new LinkedList<>();
		
		ll2.add("B");
		ll2.add(25);
		ll2.add('K');
		System.out.println(ll2);  //[B, 25, K]
		
		LinkedList<String> ll3 = new LinkedList<>();  //en hizli
		
		ll3.add("D");
		ll3.add("" +15);
		ll3.add("" +'z');
		System.out.println(ll3);  //[D, 15, z]  
	}

}
