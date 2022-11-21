package ch6;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Test {
//    Graphics pen;//（类的成员）
//    static Graphics pen;//省略是defalut
    private static Graphics pen;//（静态类成员）
    private static Frame frame;
    private static Button button;
    private static Canvas canvas;
//static 静态方法
    public static void main(String[] args) {
//界面
//        Graphics pen;//画笔(main()方法的局部成员)
        frame = new Frame("我的第一个图形界面");
        frame.setSize(400, 400);
        frame.setVisible(true);
//布局
        frame.setLayout(new FlowLayout());
//按钮
//        Button button = new Button("动我试试");
//        Button button = new Button("click me");
        button = new Button("start");//画笔
        button.setSize(120, 60);
        frame.add(button);
//匿名内部类
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                super.mouseClicked(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {

//                System.out.println("放开我");
                super.mousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

//                System.out.println("算你识相");
                super.mouseReleased(e);
            }
        });
//画布
        canvas = new Canvas();
        canvas.setSize(400,300);
        frame.add(canvas);
//匿名内部类
        canvas.addMouseListener(new MouseAdapter() {
            private boolean pressed;//记录左键是否按下
            private int x;//鼠标按下位置的横坐标 //鼠标上次的位置
            private int y;//鼠标按下位置的纵坐标
            @Override
            public void mouseClicked(MouseEvent e) {
                pen = canvas.getGraphics();//获取画布对应的画笔
                pen.setColor(Color.red);
//                pen.drawLine(50,50,100,100);
                super.mouseClicked(e);
            }
//移动
            @Override
            public void mouseMoved(MouseEvent e) {
                pen.drawLine(x,y,e.getX(),e.getY());
                x = e.getX();
                y = e.getY();
                super.mouseMoved(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                pressed = true;
//                x = e.getX();
//                y = e.getY();//记住横纵坐标
//
                super.mousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                pressed = false;
//                pen.drawLine(x,y,e.getX(),e.getY());
//
                super.mouseReleased(e);
            }
        });

    }
}
