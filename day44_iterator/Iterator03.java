package java_mehmetBulutluoz.day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {

	public static void main(String[] args) {
		/*Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz � 
		(2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
		Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
		output: [23,40]
		 */
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
		
		while (li1.hasNext()) {
			int temp = (int) li1.next();
			if  (temp<20 || temp>40)
			li1.remove();
		}
		System.out.println(sayilist); //[23, 40]
	}

}
