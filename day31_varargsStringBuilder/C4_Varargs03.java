package java_mehmetBulutluoz.day31_varargsStringBuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {

		// erilen int lerden ilki haric tüm sayıları toplayan ve
		// bulduğunuz toplam ile ilk sayıyı carpıp sonucu yazdırın.
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
		
		
	}

														// var sona getirdiğimizde hata gider (int..var, int sayi) olursa itraz eder
														// çünkü varargs asıl yükü üstlenmek ister
	public static void toplama(int sayi, int... var) { // date turundden sonra yazdığımız ... varags kullanacagımız anlamına gelir

		
		System.out.println("varargs a dahil olmayan argument " + sayi);

														//toplam parentezlerinin içinde ki ilk sayı int sayısına sonrakiler vararags alır
		
		int toplam= 0;
		for (int each : var) {
			toplam+=each;
			              
			
		}
		System.out.println(sayi*toplam);
		
		
	}

}
