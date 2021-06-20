package java_mehmetBulutluoz.day04_matematikselislemlermodulus;

public class C4_JavaMath {

    public static void main(String[] args) {
        int a=-12;
        int b= 4;

        System.out.println("a nın mutlak degeri =  " + Math.abs(a)); // 12
        System.out.println("a ve b den en buyuk olanı = " + Math.max(a,b)); // 4
        System.out.println("2,6,8 den en buyuk olanı = " + Math.max(2, Math.max(6,8) ) ); // 8
        System.out.println("a ve b den en kucuk olanı = " + Math.min(a,b)); // -12
        System.out.println("b nin kare koku = " + Math.sqrt(b)); // 2
        System.out.println("2 nin 3.kuvveti" + Math.pow(2,3)); // 8
        System.out.println("round 3.1 = " + Math.round(3.1)); // 3
        System.out.println("round 3.5 = " + Math.round(3.5)); // 4
        System.out.println("ceil 3.1 = " + Math.ceil(3.1)); // 4 -> tavan
        System.out.println("ceil 3.5 = " + Math.ceil(3.5)); // 4
        System.out.println("floor 3.1 = " + Math.floor(3.1)); // 3 -> taban
        System.out.println("floor 3.5 = " + Math.floor(3.5)); // 3

    }

}
