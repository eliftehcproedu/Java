package java_mehmetBulutluoz.day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {//true false d�necek

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		System.out.println(list); // [A, B, C, D]
		
		//her elemana B harfini ekleyelim
		
		ListIterator li1= list.listIterator();
		
		while (li1.hasNext()) {
		li1.set((li1.next()+"B")); //bu satir yerine alttaki 2 satir da oluyor hoca 2 satir yapti
		//String temp =(String) li1.next();
		//li1.set(temp + "B");	
		}
		System.out.println(list); // [AB, BB, CB, DB]
	}

}
