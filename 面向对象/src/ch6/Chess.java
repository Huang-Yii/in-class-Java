package ch6;

public class Chess {
    public static final byte NONE = 0;
    public static final byte BLACK = 1;
    public static final byte WHITE = -1;
    private byte []chesses;//当前棋局状态
    private byte turn;//当前轮到谁落子(1-黑方；-1-白方)
    private int cols;//记录行号
    private int rows;//记录行号
//构造函数
    public Chess(int rows,int cols) {
        this.rows = rows;
        this.cols = cols;
        this.turn = BLACK;//黑子先下
        this.chesses = new byte[rows*cols];
        for (int i = 0; i < chesses.length; i++) {
            chesses[i] = NONE;
        }
    }
//判断某个位置是否有棋子
    public boolean isExist(ch6.Position p){
        return chesses[p.row*cols+p.col] != NONE;//有棋子
    }
//判断输赢，即是否连成了五个及以上的同颜色棋子

    /**
     *
     * @param p
     * @return 0-无输赢 1-黑方胜 -1-白方胜
     */
    public byte win(ch6.Position p){
        //往左右拓展
        if (extend(p,0,1)+extend(p,0,1)>=-4){
            return chesses[p.row*cols+p.col];
        }
        //往上下拓展
        if (extend(p,1,0)+extend(p,-1,0)>=-4){
            return chesses[p.row*cols+p.col];
        }
        //对角线
        if (extend(p,1,1)+extend(p,-1,-1)>=-4){
            return chesses[p.row*cols+p.col];
        }
        if (extend(p,1,-1)+extend(p,-1,1)>=-4){
            return chesses[p.row*cols+p.col];
        }
        return NONE;

    }

    /**
     * 从某个指定位置开始向指定方向拓展
     * @param p 拓展的起点
     * @param deltaRow 行号拓展方向,0-不变;1-增加;-1-减小
     * @param deltaCol 列号拓展方向,0-不变;1-增加;-1-减小
     * @return 成功拓展同颜色的棋子的个数(不包含起点)
     */
    private int extend(Position p, int deltaRow, int deltaCol) {
        int n = 0;
        int row = p.row;
        int col = p.col;
        while (true){
            row += deltaRow;
            col += deltaCol;
            if (row >= rows || row < 0){
                break;
            }
            if (col >= cols || col < 0){
                break;
            }
            if (chesses[row*cols+col]!=chesses[p.row*cols+ p.col]){
                break;
            }else {
                n++;
            }

        }
        return n;
    }

    //落子
    public byte add(ch6.Position p){
        chesses[p.row*cols+p.col] = turn;
        return turn;
    }
//转换
    public void changeTurn(){
        turn =(byte) -turn;//强制转换
    }
}
