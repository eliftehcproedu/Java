package java_mehmetBulutluoz.day35_inheritance;

public class Memur extends Personel {
	
	
	public int maas;
	
	public Memur() {  
		super();       
		System.out.println("child class parametresiz constructor cal�st�"); 
		
	}
 
	public Memur(int maas) { 	 //3.
		super();				//4. Personel parametresiz constructor calisti
		System.out.println("child class parametreli constructor cal�st�");  //5.
		//child class parametreli constructor cal�st�
	}
	
	public static void main(String[] args) { //  1. ilk buras� �al��maya ba�lar- parametresiz const. 
		
		Memur obj1 = new Memur(2400);   //2.
				
	}

}/*Inheritance de constructor olu�turdu�umuzda java n�n otomatik olarak constructor a 
	 koydu�u super() keyword onemlidir.
	 *super() keyword default constructor gibidir. biz gormesekte �al���r, ancak yerine 
	 ba�ka bir keyword yazarsak etkisiz hale gelir.
	 **** extends varsa yerine birsey yazmad�kca super() cal�s�r...
	 */
	
