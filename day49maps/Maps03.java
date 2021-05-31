package mehmetBulutluoz.day49maps;

import java.util.HashMap;
import java.util.Map;

public class Maps03 {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101, "Ali, Can, Java");
		map1.putIfAbsent(102, "Veli, Yan, java");
		map1.put(103, "Ali, Yan, C#");

		System.out.println(map1.get(101)); // Ali, Can, Java
		System.out.println(map1.get(105)); // null

		System.out.println(map1.getOrDefault(105, "Aradiginiz key map de yoktur"));
		// Aradiginiz key map de yoktur

		System.out.println(map1.keySet()); // [101, 102, 103]

		System.out.println(map1.replace(103, "Mesut, Aksu, Java")); // put ile ayni islemi yapar
		System.out.println(map1);
		// {101=Ali, Can, Java, 102=Veli, Yan, java, 103=Mesut, Aksu, Java}
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("H", 1);
		map2.put("e", 1);
		map2.put("l", 2);
		map2.put("o", 3);
		System.out.println(map2); // {e=1, H=1, l=2, o=3}
		map2.compute("H", (key,value)-> 10); // key olarak entry H yi bul ve value yu 10 yap
		System.out.println(map2);//10 
		
		//t->t+3
		
		map2.computeIfAbsent("A", value -> 15); // A yoksa A y� ve degerini 15 olarak ekle
		map2.computeIfAbsent("H", value-> 5);
		
		System.out.println(map2);  //{A=15, e=1, H=10, l=2, o=3}
		
		map2.computeIfPresent("H", (key,value)-> 20);
		map2.computeIfPresent("m", (key,value)-> 20);
		
		System.out.println(map2); //{A=15, e=1, H=20, l=2, o=3}

		
		
		
	}

}
