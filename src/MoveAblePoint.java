import java.util.*;
public class MoveAblePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveAblePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    public float getXSpeed() {
        return this.xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return this.ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }
    public float[] getSpeed() {

        float[] xy = {this.xSpeed, this.ySpeed};
        return xy;
    }
    public MoveAblePoint move() {
        setX(getX() + this.xSpeed);
        setY(getY() + this.ySpeed);
        return this;
    }
    @Override
    public String toString() {
        return "(x,y) = " + Arrays.toString(this.getXY())
                + "\nspeed = " + Arrays.toString(this.getSpeed());
    }
}