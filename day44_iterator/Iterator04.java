package mehmetBulutluoz.day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {

	public static void main(String[] args) {
		// iteratoru kullanarak listenin elemanlarini sondan basa yazdirin

	
		List<Integer> sayilist=new ArrayList<>();
		
		sayilist.add(2);
		sayilist.add(13);
		sayilist.add(56);
		sayilist.add(23);
		sayilist.add(45);
		sayilist.add(14);
		sayilist.add(40);


		System.out.println(sayilist); // [2, 13, 56, 23, 45, 14, 40]
		
		ListIterator li1= sayilist.listIterator();
		while (li1.hasNext()) { // bu while imleci listenin sonuna goturur
			li1.next();
		}
		
		while (li1.hasPrevious()) {
			
			System.out.print(li1.previous()+" ");  //40 14 45 23 56 13 2 
		}
		System.out.println();
		System.out.println(sayilist);  //[2, 13, 56, 23, 45, 14, 40]
	}

}
