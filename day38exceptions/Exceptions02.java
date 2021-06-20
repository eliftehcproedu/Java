package java_mehmetBulutluoz.day38exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {

		// kullan�c�dan iki tam say� al�n ve b�l�mlerini yazd�r�n�z
		
		
		int count=1;
    	Scanner scan = new Scanner(System.in);
    	
    	while(count<=100) {
   
		System.out.println("L�tfen bolunecek tam say�y� yaz�n�z");
		int sayi1=scan.nextInt();
				
		System.out.println("L�tfen kaca bolmek istediginizi yaz�n�z");
		int sayi2=scan.nextInt();
		// jaaya Exceptions handle etmek i�in bir c�z�m �retmezsek 
		// java Exceptions ile kars�last���nda �al��may� durdurur (stop Exceptions)
		// throws Exceptions (Exceptions firlat�r) (problemin kayna��n� bize g�sterir)
		
		// tum aplication durmus olur...
		// musterinin kulland��� bir uygulama i�in bu kabu�l edilemez
		// bunun i�in kod yazan ki�i muhtemelen sorunu ogenmeli ve
		// java ya bu sorunla handle edebilmesi i�in yol g�stermelidir
		
		System.out.println("islem no :"+ count );
		try{ System.out.println("bolme isleminin sonucu : " + sayi1/sayi2);
		}catch (ArithmeticException e) {
			System.out.println("say�y� s�f�ra b�lemezsin");	
		}
		
		count++; 
		
		 }
    	
	}

}
