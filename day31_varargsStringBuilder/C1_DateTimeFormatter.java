package java_mehmetBulutluoz.day31_varargsStringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {



		LocalDateTime Idt=LocalDateTime.now();
		System.out.println(Idt);    //2021-03-20T17:11:07.852703 çalıştırdıkça son saati verir.

		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		System.out.println(dtf.format(Idt));   //21/Mart/20 05:15

		/*
		 * yy: YILIN SON İKİ RAKAMI
		 * yyyy : yılın tamamını
		 * M : ay sırasını verir mart için : 3
		 *  MM:  ay sırasını veriri mart için : 03
		 *  MMM . ay isminin ilkuc harfını verır.
		 *  MMMM : ay isminin tamamını verir
		 */
		
		
		DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("yy/MMM/dd");
		System.out.println(dtf2.format(Idt)); //21/Mar/20
		
		DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("HH:mm");  //17:23 24 LUK SİSTEME GÖRE
		DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("hh:mm");  //05:23 PM/AM SİSTEMİNE GÖRE
		System.out.println(dtf3.format(Idt)); 
		System.out.println(dtf4.format(Idt));
		
		
		
		// kac yasinda oldugunu hesap etmek icin
		
		LocalDate dogumTarihi= LocalDate.of(1986, 06, 13);
		LocalDate bugun = LocalDate.now();
		
		Period benimYasim= Period.between(dogumTarihi, bugun); //P-34Y-9M-7D
		 System.out.println(benimYasim);
		
		int yas=Period.between(dogumTarihi, bugun).getYears(); // 34 sadece yil verir
		System.out.println(yas);
		
	}

}
