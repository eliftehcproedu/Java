package mehmetBulutluoz.day31_varargsStringBuilder;

public class C2_Varargs01 {

	public static void main(String[] args) {

	// verilen iki sayıyı toplayan ve sonucu yazdıran bir method yazınız.


		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		
		
		Toplama(sayi1,sayi2);  // method call
		
		// verilen 3 sayiyi toplayan ve sonucu yazdiran bir method yaziniz.
		
		Toplama(sayi1,sayi2,sayi3);


		// oyle  bir methot yazalım ki içine kaç sayı yazarsak yazalım toplaya bilsin

		//toplama(2,3); // iki sayının toplamı methodu
		// toplama(2,5,8); // üç sayının toplamı methodu
		// istediğimiz kadar sayının yazabileceğimiz methodu oluşturabilmemiz için
		// java varargs oluşturmuş
	}

	public static void Toplama(int sayi1, int sayi2, int sayi3) {
		System.out.println("Uc sayinin toplami : " + (sayi1+sayi2+sayi3));  //60
		
	}

	public static void Toplama(int sayi1, int sayi2) {

			System.out.println("Iki sayinin toplami : " + (sayi1+sayi2)); // 30
		
	}

}
