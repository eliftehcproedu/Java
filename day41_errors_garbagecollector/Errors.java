package java_mehmetBulutluoz.day41_errors_garbagecollector;


public class Errors {

	public static void main(String[] args) {
		
		//System.out.println(20/0);  // RTE de�il RunTimeException
		
		//String str = "asd;  // CTEdur... cunku cift t�rnag� tamamlamad�k�a kod �al��maz"
	    // bu t�r yaz�mdan kaynakl� hatalar kolayca d�zeltilebilir.
		
		// java da Error dendi�inde on� gecilemeyen, kod ile ��z�lemeyen 
		// sistemden kaynakl� buyuk hatalar kastedilir.
		
		// Errorlar unchecked d�r ve java bunlar� �ng�remez
		//ancak ger�ekle�ti�inde kodun �al��mas� durdurulur.
		
		
		String str="";
		for (int i = 0; i < 10000000 ; i++) {
			str+=i;
			
		
		}
		
		
		
		
		}
	}
