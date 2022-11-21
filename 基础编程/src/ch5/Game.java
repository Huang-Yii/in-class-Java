package src.ch5;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Game {
    private Snake snake;
    private Food food;
    private Grid grid;


    private int rows;//行数
    private  int cols;//列数
    private int size;//每一个格子的尺寸
    private int margin;//棋盘离窗口的边距



    private static Graphics pen;//（静态类成员）
    private static Frame frame;
    private static Button button;
    private static Canvas canvas;

    public static void main(String[] args) {
        Game game = new Game(10,10,30,50);

//界面0
        frame = new Frame("我的贪食蛇");
        frame.setSize(370, 500);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
//画布
        canvas = new Canvas();
        canvas.setSize(370,370);
        frame.add(canvas);
//布局

        canvas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case KeyEvent.VK_LEFT:
                        game.turn(Snake.LEFT);
                        break;
                    case KeyEvent.VK_RIGHT:
                        game.turn(Snake.RIGHT);
                        break;
                    case KeyEvent.VK_UP:
                        game.turn(Snake.UP);
                        break;
                    case KeyEvent.VK_DOWN:
                        game.turn(Snake.DOWN);
                        break;
                }
                super.keyPressed(e);
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
                //
                pen = canvas.getGraphics();
                game.drawGrid();
                game.drawFood();
                game.drawSnake();
                game.start();
                super.mouseClicked(e);
            }
        });
    }

    private void turn(byte direction) {
        snake.turn(direction);
        System.out.println(direction);
    }

    //构造函数
    public Game(int rows,int cols,int size,int margin) {
        this.rows = rows;
        this.cols = cols;
        this.size = size;
        this.margin = margin;
        this.snake = new Snake(5);
        this.food = new Food();
        this.food.init(rows,cols,snake.getBody());
        this.grid = new Grid(rows,cols,size,margin);
    }


    public boolean eatFood(){
        Position head = snake.getHead();
        Position p = food.getPos();

        return head.match(p);
    }

    public boolean meetGrid(){
        Position head = snake.getHead();
        if (head.row < 0 || head.row >= rows){
            return true;
        }
        if (head.col < 0 || head.col >= cols){
            return true;
        }
        return false;
    }

    public void start(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    snake.move();
                    drawGrid();
                    drawSnake();
                    drawFood();
                    if (eatFood()){
                        snake.grown();
                        food.init(rows,cols,snake.getBody());
                    }
                    if (meetGrid() || snake.eatSelf()){
                        System.exit(0);
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
}

    public void drawFood(){
        drawBlock(food.getPos(), Color.GREEN);
    }

    public void drawSnake(){
        List<Position> positions = snake.getBody();
        for (int i = 0; i < positions.size(); i++) {
//            if (i == 0){
//                drawBlock(positions.get(i),Color.RED);
//            }else {
//                drawBlock(positions.get(i),Color.RED);
//            }
            drawBlock(positions.get(i),i==0?Color.RED:Color.GRAY);
        }
    }

    public void drawGrid(){
        pen.setColor(Color.ORANGE);
        pen.fillRect(margin,margin,cols*size,rows*size);
    }

    private void drawBlock(Position p, Color color){
        pen.setColor(color);
        int x = p.col*size+margin+3;
        int y = p.row*size+margin+3;

        pen.fillRect(x,y,size-6,size-6);
    }
}
