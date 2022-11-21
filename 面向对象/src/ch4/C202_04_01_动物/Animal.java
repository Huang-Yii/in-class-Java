package ch4.C202_04_01_动物;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    /**
     * 叫喊
     */
    //动物应该会叫，但是具体怎么叫无法描述，即不知道如何实现
    public abstract void shout();
}
