package java_mehmetBulutluoz.day36_inheritance;


class Person {
    public Person(){  //5
        System.out.println("Person Constructor");  //6
    }
    public void talk() {
        System.out.println("First Program");
    }
}
class Student extends Person {
    public void talk() { //8
        System.out.println("Second Program");  //9
    }
}
public class Test04 {
    
    public static void main(String[] args) {  //1
        Person p = new Student();   //2    //3 default student()  //4 super()
        p.talk();   //7
    }
}
