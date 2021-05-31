package mehmetBulutluoz.day33_encapsulation;

public class Encapsulation02 {
	
	private String okulIsmi= "Yildiz Koleji";
	
	// okul ismini baska classlardan okunmas�n� ama deger atanmasmas�n� istiyorsak 
	// getter() method u olu�turuyoruz
	
	private String tcNo="12345678901";
	private int hesapNo=5554321;
	
	// obje olu�turularak deger atan�p kullan�lmas�n� istedi�imiz ama
	//ilk atad���m�z degerin g�r�nmemesini istiyorsak setter() method u kllan�r�z
	
	public int sayi=100;
	

	public static void main(String[] args) {
		// eger ulasmak istedi�im class uyeleri(class member) public degilse baska 
		// package lerden ulasmak icin extra islem yapmam�z gerekir.
		
		// yapabilecegimiz islemlerden 1.si Encapsulation (data saklama) 
		// bu class da kimseyle payla�mak isteedi�imiz variable ve method lar olu�tural�m
		
		//private yap�nca g�venlik konusunu halletmi� olduk 
		//ancak class uyelerinin private olmas� OOP consepte ayk�r�
		 
		//Encapsulation classm�zda olu�turdu�muz class  uyelerine
		//kimlerin ne oranda ula�abilecegini belirlemek i�in yap�l�r.
		
	}

	private void denemeMethod() {
		System.out.println("Deneme methodu �al��t�");	
		
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
		
		System.out.println(hesapNo);
	}
	
}
