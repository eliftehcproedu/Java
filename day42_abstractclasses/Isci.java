package java_mehmetBulutluoz.day42_abstractclasses;

public class Isci extends Personel {

	public static void main(String[] args) {
		
		Isci isci1=new Isci();   //isciler icin maas 5000 tl 
		isci1.maasHesapla();     //isciler gunluk 8 saat calisir
		isci1.mesaiBilgisi();
		isci1.isim="Rumeysa";    //abstract parent classtaki  variablelari istersem kullanirim
		System.out.println(isci1.isim);  //Rumeysa
		  // System.out.println(isim);
		isci1.ozelSigorta();    //bu personel ozel sigorta kapsamindadir
								//abstract parent classtaki concrete methodu istersem kullan�r�m
								//bu methodu override etmedik ama parent-child ili�kisi ile kullanabildik
	}

	@Override
	public void maasHesapla() {
		//perent classtaki abstract methodu implement(uyarlama) etti
		// 1- sen abstract class� parent edindiysen mutlaka oradaki abstract methodu 
		//    implement etmelisin
    	// 2- parent class daki method da body olmad�g� icin onu kullanman�n anlam� yok 
		//    biz child class da body olan method(concrete) kullan�p islem yapmal�y�z
		
		System.out.println("isciler icin maas 5000 tl ");
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("i�ciler g�nluk 8 saat �al�s�r");
		
	}

}
