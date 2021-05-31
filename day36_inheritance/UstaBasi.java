package mehmetBulutluoz.day36_inheritance;


public class UstaBasi extends Isci {
	
	public String bolum="takimhane";
	public int sorOldIscisay=20;
	

	public static void main(String[] args) {
		
		UstaBasi ub1= new UstaBasi();
		//Objeyi torun const. olu�turunca 3 classtanda ulasabiliriz
		
		System.out.println(ub1.bolum);     //takimhane
		System.out.println(ub1.sorOldIscisay);    // 20
		System.out.println(ub1.saatUcreti);      //10
		System.out.println(ub1.isim);            //Mehmet
		
		Isci ub2= new UstaBasi(); // Isci UstaBasi n�n parent class �d�r 
								// Normalde UstaBasi ub2= new UstaBasi(); seklindedir
								// Ama Isci ub2= new UstaBasi(); bu sekilde de kabul olur
								// Amac kapsam genisletmektir, data t�r� genisler
		//List<String> list = new ArrayList<>();  // List ArrayList in parent class �d�r
		//Object str = new String("Hasan"); // Object String in parent class �d�r
		
		//Personel -> Isci -> UstaBas�
		
		/* extends ile birbirine bagl� olan classlarda IS-a relation olan
		 * data t�rleri istege ba�l� olarak kullan�labilir
		 * data geni� data turu yazman�n avantaj�;
		 * kapsam�n daha geni� olmas�
		 * daha geni� data turu yazman�n dezavantaj�;
		 * data turu olarakse�tigmiz class ve parent(lar�na) ait datalara ula�abilriz 
		 */
		
		
		
		System.out.println(ub2.depertman);  // Isci
		System.out.println(ub2.izindeMi);   //Personel
		
		
		Personel ub3= new UstaBasi(); // Personel UstaBasi n�n parent class �d�r 
		System.out.println(ub3.id);  // 1001-  Personel den �al�s�r
	}

}
