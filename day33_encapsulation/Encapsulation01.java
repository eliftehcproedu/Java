package mehmetBulutluoz.day33_encapsulation;
import mehmetBulutluoz.day20_scope.Scope1;
import mehmetBulutluoz.day21_scope.Scope6;

public class Encapsulation01 {
    public static void main(String[] args) {
        // OOP concapt
        // Object Orianted Programing
        // Bir proje kapsamındaki classlardan oluşturulan variable ve methodların
        // classlarda tekrar tekrar yazılmaması, var olduğu classdan uretilerek
        // bu variable ve methodların istendiği kadar kulanılmasıdır. (reusability)
        // Write once reuse aanywhere(bir kere yaz heryerde çalıştır)

        // scope6 class ındaki variable mehotlara ulaşmak istiyorum
        // bunun için Scope6 clasından obje uretmeliyiz.

        Scope6 obj1 = new Scope6();   //day21 deki
        // esitligin sol tarafi declaration
        // declaration 2 parcadir ilk parca Data turu , ikinci kisim isim
        // non-primitive'ler icin data turu ayni zaman class ismi olabilir
        // esitligin saginda ise deger, 2 parcadan olusur
        // new keyword'u, ikincisi de constructor
        // hangi class'dan obje uretmek istersek o class'in constructor'inii kullaniriz

        obj1.num1=10;
        System.out.println(obj1.num1);   //10

        obj1.add();

        //deneme methodunu main method içinden çagırabilir miyim?
        //deneme();  method u static olmadığı için main method tan direkt çağrılamaz
        //bunun yerine içinde olduğumuz class dan bir objhe uretip onun uzerinden
        // static olmayan methodlar da cagırabiliriz

        Encapsulation01 obj3 = new Encapsulation01();
        obj3.deneme();

    }
        public void deneme(){

            // projemizin kapsamına bulunan tum classlardan
            // public variable ve methodlara istediğim yerden obje ureterek ulasabilirim.
            // eger ulasmak istediğim class uyeleri(class member) public degilse baska
            // package lerden ulasmak icin extra islem yapmamız gerekir.
            // Class Member(Uye) = bir class icerisinde olan class seviyesindeki
            // instance variable'lar,static variable'lar ve class methodlaridir.

            Scope1 obj2 = new Scope1(); //day20 deki
            obj2.isim = "Ahmet";
            obj2.soyisim="Ozcelik";
            obj2.sayi=15;
            obj2.method();

            // ben istediğim class tan obje uretip oradaki public class uyelerine ulasabilirim




    }
}
