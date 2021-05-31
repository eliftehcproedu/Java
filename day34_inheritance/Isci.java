package mehmetBulutluoz.day34_inheritance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {
		
		Isci isci1 = new Isci();
		isci1.isim="Omer";
		isci1.soyisim="Aydin";
		isci1.id=1001;
		isci1.izindeMi=false;
		isci1.saatUcreti=10;
		isci1.statu="Isci";
		isci1.maas=isci1.maasHesapla();
		
		System.out.println(isci1.id + " "+ isci1.isim + " " + isci1.soyisim + " " + isci1.statu + " "
				            + isci1.maas + " tl"); 
		
		                    // �IKTI: //1001 Omer Aydin Isci 2400 tl
		
		// bu derse kadar jangi classtan bilgi elde etmek istiyorsak o classtan obje ol�turduk
		// Inheritance ile bu mecburiyet adan kalkt�
		// child class da olu�turdu�um obje ile tum parent class larda
		// bulunan variable ve methodlar� inherit edeilirim.
		
		
		
		
		Isci isci2 = new Isci();
		isci2.isim="Esat";
		isci2.soyisim="Okumus";
		isci2.id=1002;
		isci2.izindeMi=true;
		isci2.saatUcreti=15;
		isci2.statu="Isci";
		isci2.maas=isci2.maasHesapla();
		
		System.out.println(isci2.id + " "+ isci2.isim + " " + isci2.soyisim + " " + isci2.statu + " "
				            + isci2.maas + " tl"); 
		
		 							// �IKTI:// 1002 Esat Okumus Isci 3600 tl
		

	}  

}
