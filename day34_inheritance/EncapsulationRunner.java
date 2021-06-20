package java_mehmetBulutluoz.day34_inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1=new Encapsulation();	// obje olusturma var
		
		System.out.println(obj1.getOkulIsmi()); // Yildiz koleji
		System.out.println(obj1.getOkulHesapNo()); // 12345
		System.out.println(obj1.isOkulAcikMi()); //true
		
		
		obj1.setOkulIsmi("Mehmet Koleji");  // statik olmayanlar objeye ba�l�d�r	
		System.out.println(obj1.getOkulIsmi());   // Mehmet Koleji  (obj1 i�in okul ismi de�i�tirildi)
		
		Encapsulation obj2=new Encapsulation();	 // obje olusturma var 	
		System.out.println(obj2.getOkulIsmi());   // Yildiz koleji
	}

}
