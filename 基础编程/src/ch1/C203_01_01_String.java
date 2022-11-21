package src.ch1;

public class C203_01_01_String {
    public static void main(String[] args) {
        String s1 = "hello,jju";
        String s2 = new String("南昌,九江,上饶");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.length());
        System.out.println(s1.substring(2,6));

        String []citys = s2.split(",");
        for (String city:citys){
            System.out.println(city);
        }

        int a = 3;
        int b = 5;
        System.out.println(String.format("%d+%d=%d\n",a,b,a+b));
        System.out.println(a+"+"+b+"="+(a+b)+"\n");//复杂字符串的拼接建议用String.format

        StringBuffer str1 = new StringBuffer("jiangxi");
        str1.delete(2,3);
        System.out.println(str1); //删除2,不包含3

    }
}
