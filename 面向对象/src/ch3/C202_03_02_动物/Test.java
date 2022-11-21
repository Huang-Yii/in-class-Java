package ch3.C202_03_02_动物;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财");
       // dog.shout();

        Cat cat = new Cat("招财");
      //  cat.shout();

        hit(dog);
        hit(cat);
    }
    private  static void hit(Animal a){
        a.shout();
    }
//
//    private  static void hit(Cat cat){
//        cat.shout();
//    }
//    private  static void hit(Dog dog){
//        dog.shout();
//    }
}