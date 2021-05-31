package mehmetBulutluoz.day40exceptions;

public class RunnerCheckedException {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
		
		String email="rasit@gmail.com";
		mailDogrula(email);
	
		/*mail do�ru yaz�nca verdi�i ��kt�  //mailiniz basar�yla kaydedildi
		 * 
		 * mail hatal� yaz�nca verdi�i hata ��kt�s�
		 * Exception in thread "main" day40_exceptions.InvalidEmailIdCheckedException: email uygun de�il
		at NewDay/day40_exceptions.RunnerCheckedException.mailDogrula(RunnerCheckedException.java:19)
		at NewDay/day40_exceptions.RunnerCheckedException.main(RunnerCheckedException.java:8) 
		*/
	}

	public static void mailDogrula(String email) throws InvalidEmailIdCheckedException {
		
		if (email.contains("@gmail.com") || email.contains("@hotmail.com")) {
			System.out.println("mailiniz basar�yla kaydedildi");
			
		}else{
			throw new InvalidEmailIdCheckedException("email uygun de�il");
			
		}	
	}
}
