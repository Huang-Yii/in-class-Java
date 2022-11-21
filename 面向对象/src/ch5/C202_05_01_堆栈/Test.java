package ch5.C202_05_01_堆栈;

public class Test {
    public static void main(String[] args) {
        CommonStack<Integer> stack1 = new CommonStack<>(100);
        stack1.push(11);
        stack1.push(22);
        Result res = new Result();
        stack1.pop(res);
        System.out.println(res.data);
        stack1.pop(res);
        System.out.println(res.data);

        CommonStack<Double> stack2 = new CommonStack<>(100);
        stack2.push(1.11);
        stack2.push(2.22);
        stack2.pop(res);
        System.out.println(res.data);
        stack2.pop(res);
        System.out.println(res.data);

//        IntStack stack = new IntStack(100);
//        IntStack stack2 = new IntStack(100);
//
//        stack.push(11);
//        stack.push(22);
//        stack.push(33);
//        stack.push(44);
//
//        Result res = new Result();
//        stack.pop(res);
//        System.out.println(res.data);
//        stack.pop(res);
//        System.out.println(res.data);
//        stack.pop(res);
//        System.out.println(res.data);
//        stack.pop(res);
//        System.out.println(res.data);
    }
}
