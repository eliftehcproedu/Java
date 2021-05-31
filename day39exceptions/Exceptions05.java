package mehmetBulutluoz.day39exceptions;

public class Exceptions05 {

	public static void main(String[] args) {
		
		
		// null olarak tanimlanmis bir obje ile uygun olmayan bir islem yapmaya calistiginizda
        // Java NullPointerException verir
        // Unchecked exception'dir
		
		String str1=" ";
		String str2="";
		String str3=null;  // null bir de�er degildirn sadece str3 un hi�bir�eye e�it olmad���n� 
							// soyleyen bir i�aretcidir(pointer)
		
		System.out.println(str1.length());   //1
		System.out.println(str2.length());   //0
		//System.out.println(str3.length());    // NullPointerException
		
		System.out.println(str3+"bos");    //nullbos
		System.out.println(str3.concat("bos"));   //NullPointerException (null string methodlarda �al��maz)
		

	}

}
