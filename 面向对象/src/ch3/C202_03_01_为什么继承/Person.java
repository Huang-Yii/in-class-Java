package ch3.C202_03_01_为什么继承;

///public class Person {
//    public class person{
//        private String id;
//        private String name;
//        private String sex;
//
//        public person(String id, String name, String sex){
//            this.id = id;
//            this.name = name;
//            this.sex = sex;
//        }
//    }
//}
public class Person {

    private String id;
     String name;
    protected String sex;

    public Person(String id, String name, String sex){
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public void print(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(sex);
    }

}

