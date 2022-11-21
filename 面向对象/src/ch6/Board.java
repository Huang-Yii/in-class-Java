package ch6;

public class Board {
    private int row;//行数
    private  int col;//列数
    private int size;//每一个格子的尺寸
    private int margin;//棋盘离窗口的边距
//构造函数
    public Board(int row, int col, int size, int margin) {
        this.row = row;
        this.col = col;
        this.size = size;
        this.margin = margin;
    }
//将物理坐标（像素）转换为逻辑坐标（行号，列号）

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public ch6.Position convert(int x, int y){
        ch6.Position pos = new ch6.Position();
        pos.row = (y-margin+size/2)/size;
        pos.col = (x-margin+size/2)/size;
        return pos;
    }
}
