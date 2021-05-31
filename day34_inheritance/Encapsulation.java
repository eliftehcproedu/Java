package mehmetBulutluoz.day34_inheritance;

public class Encapsulation {

	
		
		
		private String okulIsmi= "Yildiz koleji";
		private int okulHesapNo= 12345;
		private boolean okulAcikMi=true;
		
		
		public String getOkulIsmi() {
		    return okulIsmi;
		}

		public int getOkulHesapNo() {
		return okulHesapNo;		
		}
	   
		public boolean isOkulAcikMi() { // data tipi boolean olan variable lar�n getter method isimleri "is" ile ba�lar
		return okulAcikMi;              // data tipi boolean olmayan variable lar�n getter method isimleri "get" ile ba�lar
		
		}
		public void setOkulIsmi(String okulIsmi) {  // d��ardan gelen okul ismini bu classtaki okul ismine atama yap�yor.
			 this.okulIsmi=okulIsmi;               //obje �zerinden oldu�u i�in bu classtaki orjinal de�eri de�i�tirmiyor
		   
		}		
		public void setOkulHesapNo(int okulHesapNo) {  // int yerine Integer de olur
			this.okulHesapNo=okulHesapNo;	
			
		}
		public void setOkulAcikMi(boolean okulAcikMi) {
			this.okulAcikMi=okulAcikMi;					
		}
}
