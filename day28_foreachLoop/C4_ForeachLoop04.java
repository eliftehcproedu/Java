package java_mehmetBulutluoz.day28_foreachLoop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForeachLoop04 {

	public static void main(String[] args) {
		// iki String array olusturunuz ve bu array lerdeki ortak elemanlari
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		// Ortak eleman yoksa ekrana "Ortak eleman yok" yazdiriniz
       
		String arr1[]= {"Ali","Can","Ayse","Seher","Veli"};
		
		String arr2[]= {"Ali","Veli","Mesut","Seher","Sedat"};
		
		// ortak elemanlari koymak in bir list olusturalim
			List<String> ortakElemanlar = new ArrayList<>();
		
		for (String eachArr1 : arr1) {
			
			for (String eachArr2 : arr2) {
				
				if (eachArr1.equals(eachArr2)) {
					ortakElemanlar.add(eachArr1);
				} 
				
				
			}
		}
		// ortak elemanlar listesi var
		// liste dolu mu bos mu?
		if (ortakElemanlar.isEmpty()) {
			System.out.println("ortak Eleman yok");
		} else {
			System.out.println(ortakElemanlar);
		}
		
		
		
		
		/*
		 *   	String arr1[]= {"Ali","Can","Ayse","Seher", "Deli"};
        		String arr2[]= {"Ali","Veli","Mesut","Sedat","Seher", "Deli"};
        	Arrays.sort(arr2);
        		for (String each : arr1) {
			
        				if (Arrays.binarySearch(arr2, each)>=0) {
					System.out.print(each+ " ");
				
					}
        	
				}
    	}  // Ali Seher Deli
		 */
		
	}

}
