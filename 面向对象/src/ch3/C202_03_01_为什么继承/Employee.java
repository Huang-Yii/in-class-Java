package ch3.C202_03_01_为什么继承;

//public class Employee extends Person{
//    private String department;
//    private String salary;
//
//    public Employee(String id, String name, String sex, String department, String salary){
////    this.id = id;
////    this.name = name;
////    this.sex = sex;
//        super(id,name,sex);
//    this.department = department;
//    this.salary = salary;
//    }
//}
//    public void print(){
//    super.print();
//        System.out.printf("单位: %s\n",department);
//        System.out.printf("工资: %.2f\n",salary);
//    }
//public class Employee {
public class Employee extends Person {
   /* private String id;
    private String name;
    private String sex;*/

    private String department;
    private int salary;

    public Employee(String id, String name, String sex, int salary) {
       /* this.id = id;
        this.name = name;
        this.sex = sex;*/
        super(id, name, sex);//继承
        this.salary = salary;
    }

    public void print(){
        /*System.out.printf("身份证号:%s",id);
        System.out.printf("姓名:%s",name);
        System.out.printf("性别:%s",sex);*/
        super.print();//继承
        System.out.println(sex);
        System.out.printf("单位:%s",department);
        System.out.printf("工资:%s",salary);
    }

}