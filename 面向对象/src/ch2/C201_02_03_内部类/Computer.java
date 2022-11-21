package ch2.C201_02_03_内部类;

public class Computer {
    private String brand;//品牌
    private int price;//价格
    private CPU cpu;//cpu

    public Computer(String brand,int price,long freq,int cache){
        this.brand = brand;
        this.price = price;
        this.cpu = new CPU(freq,cache);
    }

    public void print(){
        System.out.printf("品牌:%s\n",brand);
        System.out.printf("价格%d\n",price);
        cpu.print();
    }

    public class CPU{
        private long freq;//主频
        private int cache;//二级缓存

        public CPU(long freq,int cache){
            this.freq = freq;
            this.cache = cache;
            brand = "haha";//访问外部类Computer类的brand,可以!
//            this.brand = "haha";//this指的是当前CPU的引用
            // 而cpu中没有brand成员,故不可以访问
            //提醒:在设计内部类时,使用this要小心^▼^
        }

        public void print(){
            System.out.printf("主频:%d\n",freq);
            System.out.printf("二级缓存:%d\n",cache);
        }
    }
}
