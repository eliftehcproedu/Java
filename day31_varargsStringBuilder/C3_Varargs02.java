package java_mehmetBulutluoz.day31_varargsStringBuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		
		// istedi�imiz kadar say� girdi�imiz t�m say�lar� toplayan bir method yazal�m
		// var----variety ce�itlilik args---arguments
		
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
		

	}

	public static void toplama(int... var) { // date turundden sonra yazd���m�z ... varags kullanacag�m�z anlam�na gelir

		int toplam=0;
		for (int j: var) {
			toplam+=j;
		}
		System.out.println("say�lar�n toplam� :" +toplam);	 	// say�lar�n toplam� :7
																// say�lar�n toplam� :30
																// say�lar�n toplam� :25
																// say�lar�n toplam� :140
	}

	

}
