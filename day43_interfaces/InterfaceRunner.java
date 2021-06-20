package java_mehmetBulutluoz.day43_interfaces;
public class InterfaceRunner implements Interface02{

	public static void main(String[] args) {

		// static olarak tanımlanmış bir veriable veya method başka classlardan
		// classIsmi.methodIsmi seklinde çagrılabilir.


		Interface02.deneme2();   //static keyword'lu method calisti

		// default keyword ile oluşturduğumuz method ise
		// obj üzerinden çağrılabilir


		InterfaceRunner obj1=new InterfaceRunner();
		obj1.deneme();   // deneme methodu olmadığı için çağırmadı...  implements Interface02 yapınca çağırma gerçekleşti




	}

}
