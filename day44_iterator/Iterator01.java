package mehmetBulutluoz.day44_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	
	//hocam ileriye bakiyoruz geriye de bakacak m�y�z var mi diye  �yle birsey var mi 
	System.out.println(list); //[A, B, C, D]
	
	//her elemana B harfini ekleyelim
	for (String each : list) {
		each+="B";
		System.out.print(each + " "); //AB BB CB DB  
		}
	System.out.println(" ");
	System.out.println(list);  //[A, B, C, D]
	
	// Collections da her yapi indexi desteklemez 
	// Ornegin set de index olmaz 
	// index olmayinca mecburen t�m elemanlara ulasmak icin for each loop kullan�l�r
	// For each loop ile de update veya delete yapamayiz 
	// Bunun i�in Java Iterator interface ini olusturmustur  (iterate : yinelemek, t�retmek)
	
	Iterator it1= list.iterator();  
	//next(), hasNext(); remove() methodlarina sahiptir 
	//listedeki tum elemanlari iterator kullanarak silelim

	
	while(it1.hasNext()) {  //cursor :imlec-pointer 
		it1.next();
		it1.remove();
	}
	System.out.println(list); //[] liste bosaldi, kalici olarak degisti
	System.out.println(list.size()); //0
	
	
	
	
	}
}
