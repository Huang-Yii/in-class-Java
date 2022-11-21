package src.ch5;

public class Position {
    public int row;//行号
    public int col;//列号

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Position(Position p) {
        this.row = p.row;
        this.col = p.col;


    }

    public boolean match(Position p){
        return this.row==p.row && this.col==p.col;
    }
}
