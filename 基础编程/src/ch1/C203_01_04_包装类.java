package src.ch1;

public class C203_01_04_包装类 {
    public static void main(String[] args) {
        Integer x1 = 5;
        Integer x2 = new Integer(3); //int->Integer
        System.out.println(x1);
        int y1 = x1; //解封
        System.out.println(y1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.parseInt("123")); //String->int
        System.out.println(String.format("%d",123)); //int->String
    }
}
