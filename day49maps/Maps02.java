package mehmetBulutluoz.day49maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {
	public static void main(String[] args) {
		// Verilen bir String deki harfleri ve harflerin kacar kez kullanildigini
		// return eden bir method yaziniz
		//Ornek : input: Hello   output: H=1,  e=1,  l=2,  o=3
		
		String input= "Hellooo";
		Map<String,Integer> methoddanGelenMap =harfSayisiBul(input);
		System.out.println(methoddanGelenMap); // {e=1, H=1, l=2, o=3}
	}

	public static Map<String, Integer> harfSayisiBul(String input) {
		String harfler[] = input.split("");
		System.out.println(Arrays.toString(harfler)); //[H, e, l, l, o, o, o]
		Map<String,Integer> harfKullanimSayisi =new HashMap<>();
		for(String each: harfler) {
			if(!harfKullanimSayisi.containsKey(each)) {
				harfKullanimSayisi.put(each, 1); // H-e-1.l - 1.o
			}else {   // 2.l - 2.o
				harfKullanimSayisi.put(each,harfKullanimSayisi.get(each) + 1 ); //eski l nin uzerine +1
			}
		}
		
		return harfKullanimSayisi;
	}
}
