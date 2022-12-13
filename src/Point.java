import java.util.*;
public class Point {

    private float x;
    private float y;
    public Point() {
        this.x = 0.0F;
        this.y = 0.0F;
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return this.x;
    }
    public float getY() {
        return this.y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {

        float[] xy = {this.x, this.y};
        return xy;
    }

    public String toString() {
        return "x: " + this.getX()
                + "\nY: " + this.getY()
                + "\nXY: " + Arrays.toString(this.getXY());
    }
}