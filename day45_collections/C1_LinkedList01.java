package java_mehmetBulutluoz.day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {
	// hocam bunu �nceden for ile b�t�n elemanlara eklerdik 
	public static void main(String[] args) {
		// linked bagli demektir
        // linked list'te tum elemanlarlar tren gibi birbirine baglidir
        
        // Collections'da obje olustururken 
        // olusturmak istedigimiz collection'in class mi yoksa interface'mi polduguna bakmaliyiz
        // Eger olusturmak istedigimiz collection interface ise
        // data turu olarak o interface'i, constructor olarak ise uygun bir class secmeliyiz
        // Simdiye kadar List(interface) olustururken constructor olarak ArrayList() seciyorduk
		
		List<String> liste = new ArrayList<>();
		liste.add("X");
		liste.add("Y");
		System.out.println(liste); //[X, Y]
		 
		LinkedList<String> ll1 = new LinkedList<>(); //class dan obje uretilir
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); //[A, B]
		ll1.add(1, "C");  //1.index eC yi ekler
		System.out.println(ll1); //[A, C, B]
		ll1.addAll(liste);  //ll1 e listeyi ekler
		System.out.println(ll1); //[A, C, B, X, Y]
		
		ll1.addAll(2, liste);  //istenilen indexten itibaren listeyi ekler
		System.out.println(ll1); //[A, C, X, Y, B, X, Y]
		
		ll1.addFirst("E");  //ilk siraya ekler   Oueue nun �zelliklerini alir
		ll1.addLast("K");    //son siraya ekler
		System.out.println(ll1); //[E, A, C, X, Y, B, X, Y, K]
		
		// LinkedList List ve Queue interface'lerine implemnt ile child oldugundan
        // her iki interface'deki tum method'lari override etmek zorundadir.
        // Islev olarak ayni isi yapan addLast() queue'dan ve add() ise List'den inherit edilmistir
        
        // Ben bir linkedList  olusturmak istiyorum ama sadece List ozelliklerini tasisin
		
		List<String>  listList = new LinkedList<>();
		listList.add("Sadece list den gelen ozellikler var");
		 
		// Ben bir linkedList  olusturmak istiyorum ama sadece Queue ozelliklerini tasisin
        
		Queue<String>  queueList = new LinkedList<>();
		queueList.add("\"Sadece  queueList den gelen ozellikler var\"");

		
		
	}

}