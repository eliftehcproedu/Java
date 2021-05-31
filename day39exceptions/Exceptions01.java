package mehmetBulutluoz.day39exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		
		// java ya bir dosyay� okumas� veya dosyaya yazmas�n� soyledi�imizde
		// java "Ya dosyay� bulamazsam" der ve bizden c�z�m uretmemizi bekler 
		// dosya bulma ile ilgili excaption turu : FileNotExcaption
		// java kodu yazar yazmaz buradaki olas� problem� g�rur ve CTE verir
		// kodumuzu yedi�imiz anda ortaya ��kan bu tur exception lara Checked Exceptions diyoruz
		//
		
try {
	FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\mehmetBulutluoz\\src\\day39_exceptions\\File");

} catch (FileNotFoundException e) {
	
	//e.printStackTrace(); // tum hata ac�klamalar�n� yazd�r�r ama kodumuzu bloke olmaz
	System.out.println(e.getMessage());  // daha az hata ac�klamas� yazd�r�r.
	}
System.out.println("kod bloke olmam�s");

}
}
