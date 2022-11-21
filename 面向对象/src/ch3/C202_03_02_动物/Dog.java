package ch3.C202_03_02_动物;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override //重写，名字和参数不动，动的是实现方法
    public void shout() {
        System.out.printf("汪汪汪，我是%s\n",name);
    }
}
