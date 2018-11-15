package Model;

public class OriginalPoint {

    private double x,y,z; //坐标
    private int id; // 点的id；
    private int UnreasonCount; // 不符合"聚合"的标准次数

    private static int idCount = 0;

    public OriginalPoint(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        this.id = idCount++;
        this.UnreasonCount = 0;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getUnreasonCount() {
        return UnreasonCount;
    }

    public void setUnreasonCount(int unreasonCount) {
        this.UnreasonCount = unreasonCount;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


}
