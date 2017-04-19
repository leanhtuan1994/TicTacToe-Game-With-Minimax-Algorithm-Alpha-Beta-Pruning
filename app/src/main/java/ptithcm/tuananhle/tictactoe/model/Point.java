package ptithcm.tuananhle.tictactoe.model;

/**
 * Created by leanh on 4/19/2017.
 */

public class Point {
    private int x;
    private int y;


    public Point(){

    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
