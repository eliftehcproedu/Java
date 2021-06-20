package java_mehmetBulutluoz.day47_queue_maps;

public class C3_MultiThread {

	public static void main(String[] args) {
		//Central Process Unit 
		//Merkezi ��lem Birimi
		
		/*
	     1) Multi threading, CPU'nun maksimum kullanimi icin bir programin iki veya daha fazla bolumun
	      ayni anda yurutulmesine izin veren bir Java ozelligidir. 
	      Boyle bir programin her bir parcasi bir is parcacigi (thread) olarak adlandirilir.
	      Threads iki mekanizma kullanilarak olusturulabilir:
	     a) Thread class�ina extend edilerek,
	     b) Calistirilabilir Interface�in implement edilmesi ile.
	      Multi threading ayni variable veya ayni method'la ilgili oldugunda sonuclar 
	      islem sirasina gore degisebilir. Bu da belirsizlik dogurur ve bu da Java'nin hic sevmedigi bir seydir.
	      
	     
	     2) Synchronizing : 
	      Multi-thread programlar genellikle birden cok thread�in ayni kaynaklara erismeye calistigi ve 
	      sonunda hatali ve ongorulemeyen sonuclar urettigi bir duruma gelebilir. 
	      Bu nedenle, belirli bir zaman araliginda kaynaga yalnizca bir thread�in erisebileceginden emin olunmasi gerekir.
	      
	      Java, senkronize bloklar kullanarak thread olusturmayi ve threads�in g�revlerini senkronize bir sekilde yapmasini saglar.
	      Java'da senkronize bloklar, synchronized keyword ile isaretlenir.
	      Java'da senkronize edilmis blok mekanizmasi ayni obje uzerinde tek zaman diliminde tek thread calismasini saglar.
	      Blokda bir thread calismaya baslayinca, diger tum thread�ler ilk thread�in islemi bitene kadar bekletilir.
	      
	      Mehmet Hoca tabiriyle Synchronizing :
	      Aksama misafirimiz var diyelim ve yemek yapcaz, corba 45 dk, salata 15 dk, yemek 1 saat, sofrayi hazirlamak 15 dk sursun.
	      Toplam 2 saat 15 dkdir ama bu max suredir diyelim bunun ne kadar kisalacagi sizin ne kadar senkronize calistiginiza baglidir.
	      Corbayi koyarken salatayi yap sofra kur derken zamani kisaltabiliriz. 
	      Peki 1 saatten kisa olabilir mi bu islemler ? Hayir cunku yemek hazirlanmasi sirf 1 saat suruyor , o yuzden bu sure
	      1 saat ile 2 saat 15 dk arasindadir. 
	      
	      Bir kisi ayni anda telefonla konusup, kahve icip, evrak imzalayip, laptopta arastirma yapabilir mi ? Hayir ayni anda yapamaz
	      ama belli bir senkronize ile yapabilir.
	      
	      Birden fazla thread ayni variable veya method'u kullaniyorsa , ilk gelen yapilana kadar digerlerini bekletir.
	      Sonra ikinci, ucuncu, dorduncu.... 
	      
	      Java hem multi threading hem de synchronizing yapar. 
	      Multi thread ayni anda birden fazla thread'in calismasini amaclarken,
	      Synchronizing calisan bu cok threading'in kazasiz belasiz calisip, istenen yere dogru olarak varmasini saglar.
	      
	       Threading olmadan synchronizing dogru calisamaz, synchronizing olmadan threading calismasinin bir amaci yoktur.
	     */

		
		
		
		
		
	}

}
