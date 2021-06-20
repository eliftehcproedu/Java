package java_mehmetBulutluoz.day40exceptions;

public class Exceptions04 {

	public static void main(String[] args) {
		String s="";
		try {
			s+="t";
		}catch (Exception e) {
			s+="c";
		}	finally {
			s+="f";
		}
		s+="a";
		System.out.println(s); //tfa
				
	}

}
