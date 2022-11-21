package ch6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Game {
    private int rows;//行数
    private  int cols;//列数
    private int size;//每一个格子的尺寸
    private int margin;//棋盘离窗口的边距

    private ch6.Board board;//棋盘
    private ch6.Chess chess;//棋局
//界面
    private static Graphics pen;//（静态类成员）
    private static Frame frame;
    private static Button button;
    private static Canvas canvas;
//主函数
    public static void main(String[] args) {
        ch6.Game game = new ch6.Game(10,10,30,50);

        //界面0
        frame = new Frame("我的五子棋");
        frame.setSize(370, 500);
        frame.setVisible(true);
//布局
        frame.setLayout(new FlowLayout());

//画布
        canvas = new Canvas();
        canvas.setSize(370,370);
        frame.add(canvas);
//匿名内部类
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                pen = canvas.getGraphics();//获取画布对应的画笔
                game.handle(e.getX(),e.getY());
//                pen.drawLine(50,50,100,100);
                super.mouseClicked(e);
            }
        });
//按钮
        button = new Button("start");//画笔
        button.setSize(120, 60);
        frame.add(button);
//匿名内部类
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pen = canvas.getGraphics();
                game.drawBoard();
                super.mouseClicked(e);
            }
        });
    }
//构造函数
    public Game(int rows,int cols,int size,int margin) {
        this.rows = rows;
        this.cols = cols;
        this.size = size;
        this.margin = margin;
        this.board = new ch6.Board(rows,cols,size,margin);
        this.chess = new ch6.Chess(rows,cols);
    }
//绘制棋盘
    public void drawBoard(){
        //绘制背景
        pen.setColor(Color.blue);
        pen.fillRect(0,0,370,370);
        //绘制纬线
        for (int row = 0; row < rows; row++) {
            int x1 = margin;
            int y1 = margin+row*size;
            int x2 = x1+(cols-1)*size;
            int y2 = y1;
            pen.setColor(Color.gray);
            pen.drawLine(x1,y1,x2,y2);
        }
        //绘制经线
        for (int col = 0; col < cols; col++) {
            int x1 = margin+col*size;
            int y1 = margin;
            int x2 = x1;
            int y2 = y1+(cols-1)*size;
            pen.setColor(Color.gray);
            pen.drawLine(x1,y1,x2,y2);
        }
    }
//绘制棋子
    public void drawChess(ch6.Position p, byte color){
        int x = margin+p.col*size;
        int y = margin+p.row*size;
        int radius = size/3;
        x -= radius;
        y -= radius;
        pen.setColor(color==-1? Color.BLACK: Color.WHITE);
        pen.fillArc(x,y,2*radius,2*radius,0,360);
    }
//接收并处理用户的落子指令
    public void handle(int x,int y){
        ch6.Position pos = board.convert(x,y);
        if (pos == null){
            return;
        }
        if (chess.isExist(pos)){//已经有棋子了
            return;
        }
        byte color = chess.add(pos);//落子
        drawChess(pos,color);//绘制棋子

        byte res = chess.win(pos);
        if (res == ch6.Chess.NONE){
            chess.changeTurn();
        }else {
            //显示胜负结束，游戏结束
            String str = res==Chess.BLACK?"黑方胜":"白方胜";
            JOptionPane.showMessageDialog(null, str,"五子棋", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
    }
}
