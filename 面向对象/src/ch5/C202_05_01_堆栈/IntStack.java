package ch5.C202_05_01_堆栈;

public class IntStack {//shift+f6改名
    private int[] buff;//数据存储区
    private int capacity;//堆栈容
//    private int size;//堆栈当前实际大小
    private int top;//栈顶位置

    /**
     * 构造函数
     * @param capacity 容量
     */
    public IntStack(int capacity) {
        this.capacity = capacity;
        this.buff = new int[capacity];
//        size = 0;
        top = -1;
    }

    /**
     * 入栈
     * @param data 待入栈的数据
     * @return 是否入栈成功
     */
    public boolean push(int data){
        if(top == capacity-1){
            return false;
        }

        top++;
//        size++;
        buff[top] = data;
        return true;
    }

    /**
     * 出栈
     * @param res 输出型参数,带回栈顶元素
     * @return 是否成功出栈
     */
    public boolean pop(Result res){
        if(top == -1){
            return false;
        }

        res.data = buff[top];
        top--;
//        size--;
        return true;
    }
//
////    public boolean isFull(){
////        return size == capacity;
////    }
//
//    public boolean isEmpty(){
////        return size == 0;
//    }




}
