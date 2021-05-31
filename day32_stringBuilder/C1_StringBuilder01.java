package mehmetBulutluoz.day32_stringBuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {

		
		StringBuilder sb1= new StringBuilder("Rumeysa"); 
		System.out.println(sb1);  //Rumeysa
		
		sb1.append(" ").append("Cetinturk"); // verilen SB in sonuna istedigimiz String i degerleriniekler
		System.out.println(sb1);  //Rumeysa Cetinturk
		
		String cumle= "Javayi cok sever";
		sb1.append(cumle, 6,10);  // Baska bir String den istedigimiz  bolumu SB nin sonuna ekler
								// sonuna 6. index dahil 10 a kadar ekler (10. index dahil degil)
		System.out.println(sb1);  //Rumeysa Cetinturk cok
	 
		System.out.println(sb1.length());  //21 SB nin uzunluk bilgisini verir
		System.out.println(sb1.capacity()); //23 (7+16) SB nin kapasite bilgisini verir
		
		System.out.println(sb1.charAt(1)); // u SB nin istedigimiz index de olan karakterin bilgisini verir
		
		sb1.charAt(5); // bize bilgi getiren methodlar StrinBuilder i degistirmez
		System.out.println(sb1);  //Rumeysa Cetinturk cok
		
		sb1.delete(17, 21); // SB nin istedigimiz indexleri kismi siler
		System.out.println(sb1); //Rumeysa Cetinturk
		
		sb1.deleteCharAt(16); // SB nin istedigimiz index deki karakterini siler
		System.out.println(sb1); //Rumeysa Cetintur
		
		String isim= "Rumeysa Cetintur";
		System.out.println(sb1.equals(isim)); // false
		
		// farkl� data turune ait ayn� objeler(degerleri ayn� olsa bile) esit olmaz, farkl� oldugu icin k�yaslanmaz bile
		
		
		StringBuilder sb2= new StringBuilder("Rumeysa Cetintur");
		
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); //false
		
		// false SB'de equals methodu stringden farkl� �al���r
		//ancak ayn� obje ile k�yasland���nda true 
		// String teki == gibi �al���r() yani hem kendisi hem de�eri e�it olacak
		
		System.out.println(sb1.equals(sb1)); //true
		
		System.out.println(sb1.toString().equals(sb2.toString()));  //true
		
		
		System.out.println(sb1.indexOf("Cetin"));  //8 sb de arama yapar
		
		System.out.println(sb1.indexOf("e", 6));  //9 istedi�imiz indeksten sonras�nda arama yapar
		System.out.println(sb1.indexOf("Kazim"));   //-1   sb de bulamazsa -1 yazar
		
		
		System.out.println(sb1.insert(7,"*"));  //Rumeysa* Cetintur
												//istedi�imiz indexte itibaren String ekler		
		System.out.println(sb1.insert(7, " ")); //Rumeysa * Cetintur

		
		cumle="Merhaba dunya";
		System.out.println(sb1.insert(0, cumle, 0, 8));  //Merhaba Rumeysa * Cetintur 
		
		// sb1.insert(index, str, offset, length)  offset: yerlestir
		//0: SB ye hangi indexten itibaren eklenecek...
		//cumle: hangi Stringden eklenecek
		//ikinci 0: cumlenin hangi indexinden ba�lanacak
		// 8: bitis indexi
		
		sb1.insert(25, cumle, 8, 13);
		System.out.println(sb1); //Merhaba Rumeysa * Cetintudunyar
		
		System.out.println(sb1.lastIndexOf("t")); // 23 istenen String'in kulland��� son indexi verir
		System.out.println(sb1.lastIndexOf("a", 22)); // 14 istenen indexten oncesine bakar
		
		System.out.println(sb1.replace(8, 16, "Seher")); //Merhaba Seher* Cetintudunyar
		              // Sb nin baslang�� ve biti� indexleri aras�ndaki k�sm�
					  // verilen string ile de�i�tirir.
		
		System.out.println(sb1); //Merhaba Seher* Cetintudunyar
		
		sb1.reverse(); 
		System.out.println(sb1); //raynudutniteC *reheS abahreM  tersine yazd�r�r.
		
		sb1.reverse();  // tekrar d�zeltmek i�in yazd�k
				
		sb1.setCharAt(10, 'k');
		System.out.println(sb1);  // Merhaba Seker* Cetintudunyar  b->k oldu
		
		 //sb1.subSequence(8, 13);
		System.out.println(sb1.subSequence(8, 13)); //Seker  sb ni isted�imiz indexler aras�ndaki b�l�m�ne verir
		
	
		System.out.println(sb1.substring(8)); // Seker* Cetintudunyar baslang��tan index inden sona kadar yazar
		
		sb1.subSequence(8, 13);
		System.out.println(sb1); //Merhaba Seker* Cetintudunyar
		
		sb1.toString();
		
		StringBuilder sb3 = new StringBuilder("Java cok guzel");
		StringBuilder sb4 = new StringBuilder("Java cok guzel");
		
		System.out.println(sb3.equals(sb4)); // false
		// iceriklerinin esit olup olmadigina bakmak icin 
		// String deki equals methodunu (sadece iceriklere bakar) kullanal�m
		System.out.println(sb3.toString().equals(sb3.toString())); //true

		sb3.toString().concat("Insan sevdik�e sevesi geliyor");  //string class�n�n ait methodlar 
																// kullan�nca kal�c� degerler olmaz
		System.out.println(sb3);
		// toString() methodunu kullan�nca sb string e d�n��m�� olur
		// dolay�s�yla t�m string methodlar� kullan�labilir
		System.out.println(sb3.toString().concat("Insan sevdik�e sevesi geliyor"));
		// Java cok guzelInsan sevdik�e sevesi geliyor
		
		
		System.out.println(sb1.length()); // 28
		System.out.println(sb1.capacity()); // 48
		sb1.trimToSize();  // sb i�in haz�rlanan kapasitedeki fazlal�klar� siler
						// length ile kapasiteyi e�itler
		System.out.println(sb1.length()); // 28
		System.out.println(sb1.capacity()); //28 
		
		System.out.println(sb3.compareTo(sb4)); //0  ise e�ittir
		
		StringBuilder sb5 = new StringBuilder("Ali okula gel");
		StringBuilder sb6 = new StringBuilder("Ali okula gel");
		System.out.println(sb5.compareTo(sb6)); //0
		
		StringBuilder sb7 = new StringBuilder("Hasan");
		StringBuilder sb8 = new StringBuilder("Hakan");
		System.out.println(sb7.compareTo(sb8)); // 8 tersi - deger veriyor
		
		
		//
		
		
	}

}
