package SpecuficClass;

import InterfaceClass.StandardInterval;
import Model.*;

import java.util.ArrayList;
import java.util.Comparator;

public class StandardIntervalPoint implements StandardInterval {

    public void find(){
        Interval intervalPoint = SortInervalArrayList(); // 以这个点的标准来算 在区间内就是合理的
        System.out.println("合理区间 left="+intervalPoint.getLeft()+" right="+intervalPoint.getRight());
        double left = intervalPoint.getLeft();
        double right = intervalPoint.getRight();
        ArrayList<DistancePoint> distancePointArrayList = DistancePointList.getDistancepointlist();
        for(int i = 0 ; i<distancePointArrayList.size();i++){
            double distance = distancePointArrayList.get(i).getDistance();
            if(distance<left || right<distance){
                Tag(distancePointArrayList.get(i));
            }
        }

    }

    public Interval SortInervalArrayList(){
        ArrayList<Interval> intervalArrayList = IntervalList.getIntervalArrayList();
        Comparator c = new Comparator<Interval>() {
            @Override
            public int compare(Interval a, Interval b) {

                if(a.getThisIntervalCount() < b.getThisIntervalCount())
                    return 1;
                else return -1;
            }
        };
        intervalArrayList.sort(c);
        return intervalArrayList.get(0);
    }

    public  void Tag(DistancePoint distancePoint){
        ArrayList<OriginalPoint> ListPoint = OriginalPointList.getListPoint();

        for(int i = 0;i<ListPoint.size();i++){
            if(ListPoint.get(i).getId() == distancePoint.getFirstId() || ListPoint.get(i).getId()== distancePoint.getSecondId()){

                ListPoint.get(i).setUnreasonCount(ListPoint.get(i).getUnreasonCount()+1);//不合理次数+1；
            }
        }
    }
}
