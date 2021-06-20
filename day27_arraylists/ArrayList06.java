package java_mehmetBulutluoz.day27_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		// Verilen listeyi Array e nasil c eviririz?
		
		List<String> list=new ArrayList<String>();
		list.add("Ali");
		list.add("Veli");
		
		String arr[]= list.toArray(new String[0]);
		
		System.out.println(Arrays.toString(arr)); //[Ali, Veli]
		
		
		
		
		

	}

}
