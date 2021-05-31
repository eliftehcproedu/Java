package mehmetBulutluoz.day40exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		
		
		int arr[] = {1,4,7,8};

	try {
		System.out.println(arr[20]);
	} catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}finally {
		System.out.println("ne olursa olsun bu sat�r yaz�ls�n");	
	}
	// Finally blogu try-catch blo�u ile veya sadece try blo�u ile �al��abilir.
	// Finallyblogu catch ile ongordugum bir sorun oldugunda calistigi gibi 
	// ongoremedigim bir rxception olustugunda da calisir
	}

}
