package Model;

public class Interval {
    private double left;
    private double right;
    private int ThisIntervalCount;

    public  Interval(double left,double right){
        this.left = left;
        this.right = right;
        ThisIntervalCount = 1;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public int getThisIntervalCount() {
        return ThisIntervalCount;
    }

    public void setThisIntervalCount(int thisIntervalCount) {
        ThisIntervalCount = thisIntervalCount;
    }
}
