package java_mehmetBulutluoz.day45_collections;

import java.util.LinkedList;

public class C3_LinkedList03 {
public static void main(String[] args) {
	LinkedList<String> ll1 = new LinkedList<>();

	ll1.add("A");
	ll1.add("B");
	System.out.println(ll1); //[A, B]
	
	System.out.println(ll1.remove(0)); 	//A remove(index) indexdeki elemani siler ve 
    									// sildigi elemani bize dondurur
	System.out.println(ll1);  //[B]
	
	// Eger listemiz integer'lardan olusuyorsa
    // parantez icine yazdigimiz sayinin index mi yoksa sayi mi oldugunu karistirmamak icin
    // Java parantez icine yazilani index olarak kabul eder
	
	ll1.add("A");
	ll1.add("B");
	System.out.println(ll1);  //[B, A, B]
			
	System.out.println(ll1.remove("B")); //true ilk B yi siler (true false doner)
	System.out.println(ll1);  //[A, B]
	
	ll1.addFirst("B");
	System.out.println(ll1); //[B, A, B]
	System.out.println(ll1.removeFirstOccurrence("B"));  //true istenen elemnin ilkini siler
														//(true false doner)
	System.out.println(ll1);  //[A, B]
	
	System.out.println(ll1.remove()); //A  ilk elemani siler sildigini dondurur
	System.out.println(ll1);  //[B]
	
	
	}
}
