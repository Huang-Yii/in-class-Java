package ch3.C202_03_01_为什么继承;

import ch3.C202_03_01_为什么继承.Employee;
import ch3.C202_03_01_为什么继承.Person;

//public class Test {
//    public static void main(String[] args) {
//        Person p1 = new Person("3604022000011113321","张三","男");
//        p1.print();
//    }
//}
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("3320078427849803","zhang","男");
        p1.print();
        System.out.println(p1.sex);
        System.out.println(p1.name);

        Employee e1 = new Employee("413739879472078","wang","女",3600);
        e1.print();
    }
}
