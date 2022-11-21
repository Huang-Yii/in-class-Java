package src.ch5;

import java.util.List;

public class Food {
    private Position pos;

    public void init(int rows, int cols, List<Position> points){
        this.pos = new Position(0,0);
        while (true) {
            pos.row = (int) (Math.random()*rows);
            pos.col = (int) (Math.random()*cols);
            boolean success = true;
            for (Position p:points){
                if (p.match(pos)){
                    success = false;
                    break;
                }
            }
            if (success){
                break;
            }
        }
    }
    public Position getPos(){
        return pos;
    }
}
