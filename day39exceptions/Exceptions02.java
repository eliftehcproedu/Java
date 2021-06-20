package java_mehmetBulutluoz.day39exceptions;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		
	/*Eger kodumuzu yazdigimizda birden fazla exception'la iliskili durum olusuyorsa
            Icice try-catch bloklari olusturabiliriz
            Bu ornekte ilk once dosyayi okutmak istedik
            Java "Ya dosyayi bulamazsam? " diye bizden yardim istedi
            Biz de try-catch blogu ile FIleNOtFoundException ile handle etmesinde yardimci olduk
            Sonra dosyadaki yazilari okumaya calistik ve Java yeniden "Ya dosyayi okuyamazsam " 
            diye yardim istedi
            Biz de try-catch blogu ile IOException ile handle etmesini sagladik.
	 */
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\mehmetBulutluoz\\src\\day39_exceptions\\File");
			int k=0;
			try {
				while ((k=fis.read()) !=-1) {
					System.out.print((char)k);  // (k) yi ((char)k) yap�nca ascii de�erleri yerine file yazd�r�ld�
		
				}
			} catch (IOException e) {  // dosyalarla ilgili genel yazma ve okum asorunlar� ile handle eder
				// I= input  yazd�rma
				// O= output  okutma
					
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			
			System.out.println(e.getMessage());  
			}
		System.out.println("");
		System.out.println("kod bloke olmam�s");


	}

}
