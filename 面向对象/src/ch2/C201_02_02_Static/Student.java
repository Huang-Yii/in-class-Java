package ch2.C201_02_02_Static;

public class Student {
    private String no;
    private String name;

    private static int nums = 0;//学生人数

    //静态代码块,在类完成加载后自动执行,用于完成静态成员的初始化
    static {
        nums = 0;
    }

    //静态方法
    public static void showNums(){
//        this.no = "111";//静态方法中没有this
//        System.out.println(name);//静态方法中不能访问非静态成员
        System.out.printf("当前学生人数:%d\n",nums);
    }

    //构造函数,在实例化对象(new)时被自动执行,完成对象成员的初始化
    public Student(String no, String name) {
        this.no = "111";
        this.no = no;
        this.name = name;
        nums++;
    }
    public void print(){
        System.out.printf("学号:%s\n",this.no);
        System.out.printf("姓名:%s\n",this.name);
        System.out.printf("人数:%s\n",this.nums);
    }
}
