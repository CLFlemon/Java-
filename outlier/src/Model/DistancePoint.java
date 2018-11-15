package Model;

public class DistancePoint {

    private double distance;

    public int getSecondId() {
        return secondId;
    }

    public void setSecondId(int secondId) {
        this.secondId = secondId;
    }

    public int getFirstId() {
        return firstId;
    }

    public void setFirstId(int firstId) {
        this.firstId = firstId;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    private int firstId;
    private int secondId;

    public DistancePoint(double distance,int firstId,int secondId){
        this.distance = distance;
        this.firstId = firstId;
        this.secondId = secondId;
    }
}
