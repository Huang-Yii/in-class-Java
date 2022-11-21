package src.ch5;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    public static final byte UP = 1;
    public static final byte DOWN = -1;
    public static final byte LEFT = 2;
    public static final byte RIGHT = -2;

    private List<Position> body;//蛇身
    private byte direction;
    private boolean growing = false;//生长标记

    public Snake(int length) {
        direction = RIGHT;
        body = new ArrayList<>();
        for (int col = 0;col < length;col++){
            Position p = new Position(0,col);
            body.add(0,p);
        }
    }

    public void move(){
        //在蛇前进的方向加头
        Position head = getHead();
        Position newHead = new Position(head);
        switch (direction) {
            case LEFT:
                newHead.col--;
                break;
            case RIGHT:
                newHead.col++;
                break;
            case UP:
                newHead.row--;
                break;
            case DOWN:
                newHead.row++;
                break;
        }
        body.add(0,newHead);
        //去尾
        if (growing){
            growing = false;
        }else {
            body.remove(body.size()-1);
        }

    }

    public void grown(){
        growing = true;
    }

    public void turn(byte direction){
        if (this.direction+direction == 0){
            return;
        }
        this.direction = direction;
    }

    public boolean eatSelf(){
        Position head = getHead();
        for (int i = 1; i < body.size(); i++) {
            Position p = body.get(i);
            if (p.match(head)){
                return true;
            }
        }
        return false;
    }

    public Position getHead(){
        return body.get(0);
    }

    public List<Position> getBody(){
        return body;
    }
}
