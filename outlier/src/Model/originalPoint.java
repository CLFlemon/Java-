package Model;

public class originalPoint {

    double x,y,z; //坐标
    int id; // 点的id；
    int unreasonCount; // 不符合"聚合"的标准次数

    public originalPoint(double x,double y,double z,int id,int unreasonCount){
        this.x = x;
        this.y = y;
        this.z = z;
        this.id = id;
        this.unreasonCount = unreasonCount;
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
        return unreasonCount;
    }

    public void setUnreasonCount(int unreasonCount) {
        this.unreasonCount = unreasonCount;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
