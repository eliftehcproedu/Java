package java_mehmetBulutluoz.day47_queue_maps;

import java.util.Deque;
import java.util.LinkedList;

public class C2_Deque {
public static void main(String[] args) {
	
	//De: double Ended 
	
	Deque<String> dk1 =new LinkedList<>();
	
	dk1.addFirst("C");
	dk1.add("M");
	dk1.add("A");
	System.out.println(dk1);   //[C, M, A]
	dk1.addLast("L");
	System.out.println(dk1);	 //[C, M, A, L]
	
	
	System.out.println(dk1.getFirst());    //C
	System.out.println(dk1.getLast());      //L
	
	System.out.println(dk1.pop());    // C  / ilk eleman� kald�r�p eleman�n kendisini d�nd�r�r
	System.out.println(dk1);         //  [M, A, L]
	
	dk1.push("Y");    //en basa bir eleman ekler
	System.out.println(dk1);   //[Y, M, A, L]
	

	
	
	
	
}
}
