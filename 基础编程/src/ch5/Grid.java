package src.ch5;

public class Grid {
    private int rows;
    private int cols;
    private int size;

    public Grid(int rows, int cols, int size, int margin) {
        this.rows = rows;
        this.cols = cols;
        this.size = size;
        this.margin = margin;
    }

    private int margin;
}
