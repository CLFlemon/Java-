package Model;


import java.util.ArrayList;

public class DistancePointList {

    private static ArrayList<DistancePoint> Distancepointlist = new ArrayList<DistancePoint>();

    public static ArrayList<DistancePoint> getDistancepointlist() {
        return Distancepointlist;
    }

    public static void Add(DistancePoint distancePoint){
        Distancepointlist.add(distancePoint);
    }

    public static void Show(){
        for(int i = 0;i<Distancepointlist.size();i++){
            System.out.println("距离是="+Distancepointlist.get(i).getDistance()+" 第一个Id "+Distancepointlist.get(i).getFirstId()+" 第二个Id "+Distancepointlist.get(i).getSecondId());
        }
    }
}
