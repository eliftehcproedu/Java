package java_mehmetBulutluoz.day30_dateTime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDateTime Idt = LocalDateTime.now();
		
		System.out.println(Idt); //2021-03-19T23:06:48.913604300
		System.out.println(Idt.toString());//2021-03-19T23:06:48.913604300
		
		String time = Idt.toString();
		
		System.out.println(time.startsWith("2021")); //true
		
		
		
	}

}
