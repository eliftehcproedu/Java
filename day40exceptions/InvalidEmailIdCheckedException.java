package java_mehmetBulutluoz.day40exceptions;

public class InvalidEmailIdCheckedException extends Exception {

	
	private static final long serialVersionUID = 1L;
	// java exception lar�n� tekrars�z olmas�n� saglamak i�in her exception a unique bir kod verir

		InvalidEmailIdCheckedException(String message){
			super(message);
					
		
	}

}
