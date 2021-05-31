package mehmetBulutluoz.day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		// java da saat ile islem yamaki�in
		//localTime class �ndan obje kullan�r�z

		
		LocalTime  saat = LocalTime.now();
		System.out.println(saat); //22:41:57.885890700
	  
		
		for (int i = 0; i < 1000000; i++) {
			i+=1;
		}
		
		LocalTime  saat2 = LocalTime.now();
		System.out.println(saat2); //22:41:57.895892900
		System.out.println(saat); //2:43:24.946928200
		
		
		System.out.println(saat.plusHours(15)); // 15 saat sonra saat 13:45:49.836400500
		System.out.println(saat.getSecond()); // 37
		System.out.println(saat.minusSeconds(1564866)); // 20:15:26.445512800 �NCE
		
		System.out.println(saat.now(ZoneId.of("Japan"))); // 05:01:03.683693700 japonya da saat
		
		
	}

}
