package java_mehmetBulutluoz.day38exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// kullan�c�dan iki tam say� al�n ve b�l�mlerini yazd�r�n�z
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bolunecek tam say�y� yaz�n�z");
		int sayi1=scan.nextInt();
		
		System.out.println("L�tfen kaca bolmek istediginizi yaz�n�z");
		int sayi2=scan.nextInt();
		// java exceptions lara handle etmek i�in try-catch blogu olusturmus
	    // System.out.println("bolme isleminin sonucu : " + sayi1/sayi2);  exception verir
	    
	    try {
	    	   System.out.println("bolme isleminin sonucu : " + sayi1/sayi2);
	    }catch (ArithmeticException  e) {   // sorun ArithmeticException oldu�u i�in onu yazmal�y�z 
	    									//aksi taktirde kabul etmiyor
	    									// su kesildiyse vanaya bakars�n �artellere de�il
	    	
	    	    System.out.println("Sayiyi s�f�ra b�lemezsin");
	    	
	    }
	 

	}

}
