package java_mehmetBulutluoz.day38exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// try catch blogundki e nin g�revi (ArithmeticException e)

		int sayi1=10;
		int sayi2=0;
		
		Exceptions01 exp= new Exceptions01();
		  // e�itli�in solundaki Exceptions01 hem class ad� hem exp objesi i�in date t�r�
		try { 
		System.out.println(sayi1/sayi2);
		}catch (ArithmeticException e) {
			//ArithmeticException java da bir class ve e objesi i�in date tur
			// e ise ArithmeticException class�ndan ol�turdu�umuz objenin ad�
			// o zamn ismi e olmak zorunda de�iliz ama genelde e kullan�l�r
		    
			System.out.println("say�y� s�f�ra b�lemezsin");  // 1.secenek bizim kullan�c�ya vermek istedi�imiz mesaj 
			System.out.println(e);  // 2.secenek java.lang.ArithmeticException: / by zero
			
			// bu durumda hem java ya surunu yazmas� i�in f�rsat vermi�
			// hemde aplicatiojn � bloke etmmemi� oluruz
			
			System.out.println(e.getMessage()); //3.secenek    / by zero
			
			
			e.printStackTrace();     /*4.secenek  
			                               * java.lang.ArithmeticException: / by zero
			                               * at NewDay/day38_exceptions.Exceptions03.main(Exceptions03.java:14)
			                               */
			
		}
		System.out.println("Kod bloke olmam�ssssssss");
		
		
	}

}