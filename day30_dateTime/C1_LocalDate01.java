package java_mehmetBulutluoz.day30_dateTime;

import java.time.LocalDate;

public class C1_LocalDate01 {

	public static void main(String[] args) {
		
		//java da sadece tarih kullanmak istiyorsak
		// LocalDate Class inda bir obje uretiriz
		
		
		LocalDate tarih= LocalDate.now();
		System.out.println(tarih); //2021-03-19
		
		tarih.plusWeeks(20);
		System.out.println(tarih.plusWeeks(20)); //2021-08-06 20 hafta sonrayi hesapladik
		System.out.println(tarih.plusDays(500)); // 2022-08-01  500 gun sonrayi hesapladi
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12));
		// istedi�imiz veriyi girdikten sonra bizi o tarihe gitirdi 2024-08-31
		
		System.out.println(tarih.minusMonths(15)); //2019-12-19
		System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10));//2017-11-09 gecmic yil hesaplama
		
		System.out.println(tarih.getDayOfYear()); // 78 yilin kacinci gunu
		System.out.println(tarih.getDayOfMonth()); // 3 ayin  kacinci gunu
		System.out.println(tarih.getDayOfWeek()); // FRIDAY haftanin gunu
		
		
		LocalDate dogumGunu= LocalDate.of(1986,6, 13); 
		System.out.println(dogumGunu.getDayOfWeek());//FRIDAY gunu dogmusum
		
		
		System.out.println(tarih.getMonthValue());//3 ay
		System.out.println(tarih.getMonth());// MARCH
		
		
		
		System.out.println(tarih.isLeapYear()); // false  artik yil degil
		
		
		//eger suan ki tarih ile degil de eski bir tarih ile islem yapilacaksa asagidaki islem yapilir
		LocalDate tarih1= LocalDate.of(1995, 12, 15);
		LocalDate tarih2= LocalDate.of(1995, 12, 10);
		
		System.out.println(tarih1.isAfter(tarih2)); //true
		System.out.println(tarih1.isBefore(tarih2)); // false
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
